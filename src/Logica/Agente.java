/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicksson
 */
public class Agente implements Serializable{
    
    public static ArrayList<Agente> listaDeAgentes = new ArrayList<>();
    
    private String nmAgente;
    private String perfilAgente;
    private String metaDados;

    public Agente() {
    }
    
    public static ArrayList<Agente> getListaDeAgentes() {
        return listaDeAgentes;
    }

    public static void setListaDeAgentes(ArrayList<Agente> listaDeAgentes) {
        Agente.listaDeAgentes = listaDeAgentes;
    }

    public String getPerfilAgente() {
        return perfilAgente;
    }

    public void setPerfilAgente(String perfilAgente) {
        this.perfilAgente = perfilAgente;
    }

    public String getMetaDados() {
        return metaDados;
    }

    public void setMetaDados(String metaDados) {
        this.metaDados = metaDados;
    }

    public String getNmAgente() {
        return nmAgente;
    }

    public void setNmAgente(String nmAgente) {
        this.nmAgente = nmAgente;
    }
    
    public static void criarArquivoAgente(){
        try {
            FileOutputStream arquivo = new FileOutputStream("agentes.dat");
            ObjectOutputStream gravador = new ObjectOutputStream(arquivo);
            gravador.writeObject(listaDeAgentes);

            gravador.close();
            arquivo.close();            
        //    JOptionPane.showMessageDialog(null,"Arquivo Criado Com Sucesso");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"ERRO: Arquivo 'agentes.dat' não foi criado\n"+e.getMessage());
        }
    }
    
    public static boolean abrirArquivoAgente(){        
        try {
            FileInputStream arquivo = new FileInputStream("agentes.dat"); 
            ObjectInputStream leitor = new ObjectInputStream(arquivo);            
            listaDeAgentes = (ArrayList<Agente>) leitor.readObject();
            arquivo.close();
            leitor.close();
            return true;
        } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(null,"Arquivo 'agentes.dat' Não Encontrado\n"+ex.getMessage());
             return false;
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Arquivo 'agentes.dat' Não Encontrado ou está Invalido\n"+ex.getMessage());
            return false;
        } 
                
      }
}
