/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConexaoBD;


import java.sql.Connection;
import java.util.ArrayList;


/**
 *
 * @author Nicksson
 */
public class Conexao{
    
    //varivel global da conexão
    public static Connection conexao = null;
    
    public static String bancoDeDados;
    public static String usuario;
    public static String senha;
    public static String host;
    public static String nomeDoBanco;
    public static int porta;

    public static ArrayList<String> listaTabelasDoBanco = new ArrayList<>();
    public static ArrayList<String> listaDeBancoDeDados = new ArrayList<>();
    
    public static Connection getConexao() {
        return conexao;
    }

    public static String getBancoDeDados() {
        return bancoDeDados;
    }

    public static void setBancoDeDados(String bancoDeDados) {
        Conexao.bancoDeDados = bancoDeDados;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Conexao.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        Conexao.senha = senha;
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        Conexao.host = host;
    }

    public static String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public static void setNomeDoBanco(String nomeDoBanco) {
        Conexao.nomeDoBanco = nomeDoBanco;
    }

    public static int getPorta() {
        return porta;
    }

    public static void setPorta(int porta) {
        Conexao.porta = porta;
    }

}
