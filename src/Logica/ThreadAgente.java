/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import DAO.AgenteDAO;
import Telas.TelaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicksson
 */
public class ThreadAgente extends Thread{
    
    private final Agente agente; 
    private final TelaPrincipal telaPrincipal; 

   public ThreadAgente(Agente agente, TelaPrincipal telaPrincipal) {
      this.agente = agente;
      this.telaPrincipal = telaPrincipal;
    }

    @Override
    public void run() {
        for (int i = 0; i < TelaPrincipal.listaTabelasSelecionadas.size(); i++) {
            if(AgenteDAO.Classificar(TelaPrincipal.listaTabelasSelecionadas.get(i), agente) ==  false){
                telaPrincipal.mostrarClassificacao(false, TelaPrincipal.listaTabelasSelecionadas.get(i), agente.getNmAgente());  
                try {
                   Thread.sleep(100);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao interromper processo");
                }    
                i = i - 1;// quando a classificação não acontece o agente persiste
            
            }else{          
               telaPrincipal.mostrarClassificacao(true, TelaPrincipal.listaTabelasSelecionadas.get(i), agente.getNmAgente());                 
            }             
        }
    }
    
}
