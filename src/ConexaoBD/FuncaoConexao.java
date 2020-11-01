/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FuncaoConexao {  
    
    //Se os dados tiver corretos a função cria uma conexão com a variavel global conexão com o Banco de Dados
    public static boolean criarConexaoPostgree(){
          try{
                String url = "jdbc:postgresql://"+Conexao.getHost()+":"+Conexao.getPorta()+"/"+Conexao.getNomeDoBanco();               
                Class.forName("org.postgresql.Driver");  
                Conexao.conexao = DriverManager.getConnection(url, Conexao.getUsuario(), Conexao.getSenha()); 
                return true;            
            } catch (ClassNotFoundException | SQLException ex) {
               JOptionPane.showMessageDialog(null,"Não Existe Conexão com o Banco de dados\n"+ex.getMessage());
               return false;
            }

     }     
    //cria uma conexão para a classificação dos agentes, pois as threads precisam está em conexões diferentes.
    public static Connection criarConexao(){
          try{
                String url = "jdbc:postgresql://"+Conexao.getHost()+":"+Conexao.getPorta()+"/"+Conexao.getNomeDoBanco();               
                Class.forName("org.postgresql.Driver");  
                return DriverManager.getConnection(url, Conexao.getUsuario(), Conexao.getSenha());
            } catch (ClassNotFoundException | SQLException ex) {
               JOptionPane.showMessageDialog(null,ex.getMessage()+"\nNão Existe Conexão com o Banco de dados");
                return null;
            }
         
     }
    //fecha a conexão dos agentes(threads) que é criada
    public static void fecharConexao(Connection c){
            try {         
                c.close();
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }
    //fecha a conexão da variavel global
    public static void fecharConexao(){
            try {         
                Conexao.conexao.close();
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }
    //preenche as tabelas do banco de dados que foi conectado
    public static boolean selectTabelasDoBanco(){         
       if(criarConexaoPostgree() == true){
           try {
               String sql = "SELECT tablename FROM pg_catalog.pg_tables\n" +
                       "WHERE schemaname NOT IN ('pg_catalog', 'information_schema', 'pg_toast')\n" +
                       "ORDER BY schemaname, tablename";
               
               PreparedStatement stmt = Conexao.getConexao().prepareStatement(sql);
               ResultSet rs = stmt.executeQuery();
               
               Conexao.listaTabelasDoBanco.clear();
               
               while(rs.next()){
                   Conexao.listaTabelasDoBanco.add(rs.getString("tablename"));
               }
               
               rs.close();
               stmt.close();
               FuncaoConexao.fecharConexao();
               return true;
           } catch (SQLException ex) {
               FuncaoConexao.fecharConexao();
               JOptionPane.showMessageDialog(null,"ERRO: SQL Invalida: Tabelas do Banco não foram preenchidas\n"+ex.getMessage());
               return false;
           }
           
      }else
           return false;
    }
    //preenche o combobox com os bancos de dados da conexão
    public static boolean selectBancoDeDados(){
        if(criarConexaoPostgree() == true){
           try {
               String sql = "select datName from pg_database";
               
               PreparedStatement stmt = Conexao.getConexao().prepareStatement(sql);
               ResultSet rs = stmt.executeQuery();
               
               Conexao.listaDeBancoDeDados.clear();
               
               while(rs.next()){
                   Conexao.listaDeBancoDeDados.add(rs.getString("datName"));
               }
               
               rs.close();
               stmt.close();
               FuncaoConexao.fecharConexao();
               return true;
           } catch (SQLException ex) {
               FuncaoConexao.fecharConexao();
               JOptionPane.showMessageDialog(null,"ERRO: SQL Invalida na Funcão: selectBancoDeDados\n"+ex.getMessage());
               return false;
           }
           
      }else
           return false;
    }

 }




