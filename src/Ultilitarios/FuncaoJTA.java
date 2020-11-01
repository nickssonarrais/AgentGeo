/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ultilitarios;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Nicksson
 */
public class FuncaoJTA {
    
  public static boolean validarString(JTextArea jta){
      if(jta.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "ERRO: Campo Área Vazia");
           jta.requestFocus();
           return false;
        }else{
            return true;
        }
    }
}
