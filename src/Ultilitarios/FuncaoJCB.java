/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ultilitarios;

import ConexaoBD.Conexao;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class FuncaoJCB {
    
    public static void listarBancoDeDados(JComboBox jcb){
        jcb.removeAllItems();        
        if(Conexao.listaDeBancoDeDados.isEmpty()){
            JOptionPane.showMessageDialog(null,"ERRO JCB: Não Existe Banco de Dados nessa Conexão");
        }else{
            for (String listaDeBancoDeDado : Conexao.listaDeBancoDeDados) {
                jcb.addItem(listaDeBancoDeDado);
            }
        }
    }
    
    public static void limparComboBox(JComboBox jcb){
        try {
            jcb.removeAllItems(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO ComboBox: "+e.getMessage());
        }
        
    }
    
    public static String getBancoSelecionado(int linhaSelecionada){
        try {
          return Conexao.listaDeBancoDeDados.get(linhaSelecionada);  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO: "+e.getMessage());
            return "";
        }

    }
    
    
 
    public static boolean validarSelecao(JComboBox jcb){
        if(jcb.getSelectedIndex() < 0){
            jcb.requestFocus();
            JOptionPane.showMessageDialog(null, "ERRO: Nenhum Campo Foi Selecionado");
            return false;
        }else{
            return true;
        }
    }
}
