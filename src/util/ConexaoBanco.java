/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.sql.*;


/**
 * Classe para Criar Conexão com o Banco de Dados
 * @author Rafael
 * @since Classe criada em 16/04/2017
 */
public class ConexaoBanco {
    public Statement stm;// responsavel por fazer pesquisa no banco
    public ResultSet rs;// responsavel por amazenenar as pesquisas feitas
    public Connection conn;
    private final String driver = "com.mysql.jdbc.Driver"; 
    private final String url = "jdbc:mysql://localhost:3307/goldfood";
    private final String usuario = "root";
    private final String senha = "root";// responsavel por realizar a conexão com o banco de dados
    
    
    public void conecta(){
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com Sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao Conectar!" + ex.getMessage());
        }
    }
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Erro no ExecutaSQL!" + ex.getMessage());
        }
        
    }
    public void Desconecta(){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao Fechar Conexão!" + ex.getMessage());
        }
    }

    public Statement createStatement(int TYPE_SCROLL_SENSITIVE, int CONCUR_UPDATABLE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//Fim da classe
