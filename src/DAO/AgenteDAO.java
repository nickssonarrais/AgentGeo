/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import ConexaoBD.Conexao;
import ConexaoBD.FuncaoConexao;
import Logica.Agente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AgenteDAO {
      
     
    public static boolean verificarColunaClassification(String tabela){
        if(FuncaoConexao.criarConexaoPostgree()){
            try {
                String sql = "SELECT column_name FROM information_schema.columns WHERE table_name ='"+tabela+"'"+" "
                        + "and column_name = 'classification'";
               
                PreparedStatement stmt = Conexao.conexao.prepareStatement(sql);                 
                ResultSet rs = stmt.executeQuery();
                
                if(rs.next()){ 
                    stmt.close();
                    rs.close();
                    FuncaoConexao.fecharConexao();
                    return true;
                }else{
                    stmt.close();
                    rs.close();
                    FuncaoConexao.fecharConexao();
                    return false;
                }
                
            } catch (SQLException ex) {
                FuncaoConexao.fecharConexao();
                JOptionPane.showMessageDialog(null,"ERRO: Coluna 'classification' Não Existe \n"+ex.getMessage());
                return false;
            }
        }else
            return false;
    }
    
    public static void criarColunaClassification(String tabela){
          if(FuncaoConexao.criarConexaoPostgree()){
            try {
                String sql = "ALTER TABLE "+tabela+" ADD classification varchar(50)";
               
                PreparedStatement stmt = Conexao.conexao.prepareStatement(sql);                 
                    
                stmt.execute();
                stmt.close();
                FuncaoConexao.fecharConexao();
 
            } catch (SQLException ex) {
                FuncaoConexao.fecharConexao();
                JOptionPane.showMessageDialog(null,"ERRO: Impossivel criar a Coluna 'classification'\n"+ex.getMessage());
            }
          }
    }
    
    public static void apagarColunaClassification(String tabela){
          if(FuncaoConexao.criarConexaoPostgree()){
            try {
                String sql = "ALTER TABLE "+tabela+" drop classification";
               
                PreparedStatement stmt = Conexao.conexao.prepareStatement(sql);                 
                    
                stmt.execute();
                stmt.close();
                FuncaoConexao.fecharConexao();
 
            } catch (SQLException ex) {
                FuncaoConexao.fecharConexao();
                JOptionPane.showMessageDialog(null,"ERRO: Não foi possivel Apagar a Coluna 'classificarion'\n"+ex.getMessage());
            }
         }
    }
     //Vefificar se os agentes irão funcionar nas tabelas
    public static boolean verificarDoPerfilDosAgentes(String tabela, Agente agente){
        if(FuncaoConexao.criarConexaoPostgree()){
            try {
                String sql = "SELECT id from "+tabela+" WHERE classification != 'teste' and "+agente.getPerfilAgente()+" limit 5";                
                PreparedStatement stmt = Conexao.conexao.prepareStatement(sql);
                            
                stmt.execute();
                stmt.close();
                FuncaoConexao.fecharConexao();
                return true;
            } catch (SQLException ex) {
                FuncaoConexao.fecharConexao();
                JOptionPane.showMessageDialog(null,"ERRO: Não é possivel realizar a classificacao do agente "+agente.getNmAgente()+" na tabela "+tabela+"\n"+ex.getMessage());
                return false;
            }
        }else
            return false;
    }
    //Classificação dos agentes
    public static boolean Classificar(String tabela, Agente agente){
       Connection a = FuncaoConexao.criarConexao();
       if(a!=null){
          try {
                String sql = "UPDATE "+tabela+" SET classification = '"+agente.getNmAgente()+"'"
                 +" WHERE "+agente.getPerfilAgente();                
                
                 PreparedStatement stmt = a.prepareStatement(sql);
                  stmt.execute();
                  stmt.close();      
                  FuncaoConexao.fecharConexao(a);
      
                 return true;
            } catch (SQLException ex) {
                FuncaoConexao.fecharConexao(a);
              //  JOptionPane.showMessageDialog(null,"Houve Convergencias na Classificação\n"+ex.getMessage());
                return false;
            }
       }else{
           JOptionPane.showMessageDialog(null, "ERRO: Nao Existe Conexão\n Conexão nula");
           return false;
       }     
    }
    

    
}
