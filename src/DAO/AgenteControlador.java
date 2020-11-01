/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import ConexaoBD.Conexao;
import ConexaoBD.FuncaoConexao;
import Logica.Agente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicksson
 */
public class AgenteControlador {
    
      public static boolean classificarDivergencias(Agente a, Agente b, String tabela){
       if(FuncaoConexao.criarConexaoPostgree()){
             try {
                String sql = "update "+tabela+" SET classification = 'Divergencia' WHERE ("+a.getPerfilAgente()+") and ("+b.getPerfilAgente()+")";                
                PreparedStatement stmt = Conexao.conexao.prepareStatement(sql);
                            
                stmt.execute();
                stmt.close();
                FuncaoConexao.fecharConexao();
                return true;
            } catch (SQLException ex) {
                FuncaoConexao.fecharConexao();
                JOptionPane.showMessageDialog(null,"ERRO: Agente Controlador\n"+ex.getMessage());
                return false;
            }
        }else
            return false;
        
    }
      
      public static long contadorDivergencias(Agente a, Agente b, String tabela){
       if(FuncaoConexao.criarConexaoPostgree()){
             try {
                String sql = "select count(id) as somaDivergencia from "+tabela+"  WHERE ("+a.getPerfilAgente()+") and ("+b.getPerfilAgente()+")";                
                PreparedStatement stmt = Conexao.conexao.prepareStatement(sql);
                      
               
                ResultSet rs = stmt.executeQuery();
        

                if(rs.next()){ 
                   long somaDivegencia = rs.getLong("somaDivergencia");
                    stmt.close();
                    rs.close();
                    FuncaoConexao.fecharConexao();
                    return somaDivegencia;
                }else{
                    stmt.close();
                    rs.close();
                    FuncaoConexao.fecharConexao();
                    return 0;
                }
                
            } catch (SQLException ex) {
                FuncaoConexao.fecharConexao();
                JOptionPane.showMessageDialog(null,"ERRO: Agente Controlador\n"+ex.getMessage());
                return 0;
            }
        }else
            return 0;
        
    }  
}
