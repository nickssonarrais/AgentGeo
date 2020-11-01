/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ultilitarios;

import static Ultilitarios.FormatoMascara.*;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

     
public class FuncaoJTF {
    
    
    public static boolean validarSenha(JPasswordField jpf){
        String senha = new String(jpf.getPassword());
        if(senha.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ERRO: A Senha Não Foi Digitada");
            jpf.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    
    public static boolean validarConfirmaSenha(JPasswordField jpf, JPasswordField jpf2){
        String senha = new String(jpf.getPassword());
        String confirme = new String(jpf2.getPassword());
        if(senha.equals(confirme)){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: As Senhas Não Conferem");
            return false;
        }
    }
    
    public static boolean validarInteiro(JTextField jtf){
        if(jtf.getText().trim().isEmpty()){
              jtf.requestFocus();
              JOptionPane.showMessageDialog(null,"ERRO: O Campo Não Foi Digitado");
              return false;
        }else{
            
            try {    
             int num = Integer.parseInt(jtf.getText()); 
             return true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"ERRO: Formato de campo Invalido");
                jtf.setText("");
                jtf.requestFocus();
                return false;
            }
        }
    }
     
    public static boolean validarInteiroPositivo(JTextField jtf){
        if(jtf.getText().trim().isEmpty()){
              jtf.requestFocus();
              JOptionPane.showMessageDialog(null,"ERRO: O Campo Não Foi Digitado");
              return false;
        }else{
            
            try {    
                int num = Integer.parseInt(jtf.getText()); 
                if(num > 0){
                     return true;
                }else{
                     JOptionPane.showMessageDialog(null,"ERRO: Para Esse Campo Só é permitido Valores Positivos");
                     jtf.setText("");
                     jtf.requestFocus();
                     return false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"ERRO: Formato de campo Invalido");
                jtf.setText("");
                jtf.requestFocus();
                return false;
            }
        }
    }
    
    public static boolean validarLong(JTextField jtf){
          if(jtf.getText().trim().isEmpty()){
              jtf.requestFocus();
              JOptionPane.showMessageDialog(null,"ERRO: O Campo Não Foi Digitado");
              return false;
             }else{
                try {    
                 long num = Long.parseLong(jtf.getText()); 
                 return true;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Formato de campo Invalido");
                    jtf.setText("");
                    jtf.requestFocus();
                    return false;
                }
          }
    }
    
    public static boolean validarLongPositivo(JTextField jtf){
          if(jtf.getText().trim().isEmpty()){
              jtf.requestFocus();
              JOptionPane.showMessageDialog(null,"ERRO: O Campo Não Foi Digitado");
              return false;
             }else{
                try {    
                    long num = Long.parseLong(jtf.getText()); 
                    if(num > 0){
                        return true;
                    }else{
                        JOptionPane.showMessageDialog(null,"ERRO: O Campo Só Permite Valores POsitivos");
                        jtf.setText("");
                        jtf.requestFocus();
                        return false;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Formato de campo Invalido");
                    jtf.setText("");
                    jtf.requestFocus();
                    return false;
                }
          }
    }
    
    public static boolean validarDouble(JTextField jtf){
        if(jtf.getText().trim().isEmpty()){
              jtf.requestFocus();
              JOptionPane.showMessageDialog(null,"ERRO: O Campo Não Foi Digitado");
              return false;
        }else{
            try {
                Double.parseDouble(jtf.getText().replace(",", ".")); 
                return true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Formato de Campo Invalido");
                jtf.requestFocus();
                return false;
            }
        }    
    }
    
    public static boolean validarDoublePositivo(JTextField jtf){
        if(jtf.getText().trim().isEmpty()){
              jtf.requestFocus();
              JOptionPane.showMessageDialog(null,"ERRO: O Campo Não Foi Digitado");
              return false;
        }else{
            try {    
                double num = Double.parseDouble(jtf.getText().replace(",", ".")); 
                if(num > 0){
                     return true;
                }else{
                    JOptionPane.showMessageDialog(null,"ERRO: Não é Permitido Valor Negativo Para esse Campo");
                    jtf.requestFocus();
                  return false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Formato de Campo Invalido");
                jtf.requestFocus();
                return false;
            }
         }
    }
    
    public static boolean validarData(JTextField jtf){
              if(jtf.getText().trim().isEmpty()){
                    jtf.requestFocus();
                    JOptionPane.showMessageDialog(null,"ERRO: O Campo Não Foi Digitado");
                    return false;
              }else{                  
                try {
                      formatoData.setLenient (false);
                      formatoData.parse(jtf.getText());
                      return true; 
                  } catch (ParseException e) {                  
                      jtf.setText("");
                      jtf.requestFocus();
                      JOptionPane.showMessageDialog(null, "ERRO: A Data Informada é Invalida");
                      return false;
                  }
              }
      }     
      
    public static boolean validarNome(JTextField jtf){
         if(jtf.getText().trim().isEmpty()){
            jtf.requestFocus();
            JOptionPane.showMessageDialog(null,"ERRO: O Campo Não Foi Digitado");
          return false;
        }
         else if(jtf.getText().matches("[ [a-z]*[A-Z]*[ã,õ,ç,á,é,ó,ô,â,ê,í ]*]*")){
            return true;
        }else{
            jtf.setText("");
            jtf.requestFocus();
            JOptionPane.showMessageDialog(null, "Digite apenas letras para esse campo");
            return false;
     }
  }     

    public static boolean validarString(JTextField jtf){
         if(jtf.getText().trim().isEmpty()){
            jtf.requestFocus();
            JOptionPane.showMessageDialog(null,"ERRO: O Campo Não Foi Digitado");
            return false;
          }else{
            return true;
        }
  }     
    
    public static String getSenha(JPasswordField jpf){
      String senha = new String(jpf.getPassword());
      return senha;      
    }

    public static double getDouble(JTextField jtf){
       try {    
         double num = Double.parseDouble(jtf.getText().replace(",", ".")); 
         return num;

        } catch (NumberFormatException e) {
          //  JOptionPane.showMessageDialog(null,"Formato de campo Invalido");
           // jtf.setText("");
            jtf.requestFocus();
            return 0;
        }


    }

    public static int getInteiro(JTextField jtf){
        try {    
         int num = Integer.parseInt(jtf.getText()); 
         return num;

        } catch (NumberFormatException e) {
           // jtf.setText("");
           // jtf.requestFocus();
            return 0;
        }
    }

    public static String getString(JTextField jtf){
          return jtf.getText();
    }
    

    public static Date getDate(JTextField jtf){
          try {
                 formatoData.setLenient (false);
                 Date data = formatoData.parse(jtf.getText());
                 return data;
           } catch (ParseException e) {                  
               // jtf.setText("");
                //jtf.requestFocus();
                JOptionPane.showMessageDialog(null, "A Data Informada é Invalida");
                  return null;
            }
    }
        
    public static long getLong(JTextField jtf){
        try {  
                long num = Long.parseLong(jtf.getText());
                return num;
            }catch(NumberFormatException e){
                return 0;
            }  
    }
    

}
