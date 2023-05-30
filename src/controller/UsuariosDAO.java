/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.ConexaoBanco;
import model.Usuario;

/**
 *
 * @author Rafael
 */
public class UsuariosDAO {
    private final ConexaoBanco conexao = new ConexaoBanco();
              
   public void SalvarUsuarios(Usuario u){
        conexao.conecta();
   
        try{
            String sql ="Insert into tb_usuarios (nome, telefone, endereco, numero, complemento, bairro, tipo, senha, usuario) "
                    + "values (?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
            
            pre.setString(1, u.getNome());
            pre.setString(2, u.getTelefone());
            pre.setString(3, u.getEndereco());
            pre.setInt(4, u.getNumero());
            pre.setString(5, u.getComplemento());
            pre.setString(6,u.getBairro());
            pre.setString(7, u.getTipo());
            pre.setString(8, u.getSenha());
            pre.setString(9, u.getUsuario());
            pre.execute();
            
            JOptionPane.showMessageDialog(null, "Usuario Salvo com Sucesso!");
           
            
        }catch(SQLException a){
            System.out.println("Erro ao incluir: " + a.getMessage());
                    
        }
        conexao.Desconecta();
    }//fim do metodo incluir
    
    public void alterarUsuarios(Usuario u){
        
         try{
            conexao.conecta();
            
            String sql = "update tb_usuarios set nome = ?, telefone =?, endereco= ?,"
                    + "numero= ?, complemento =?, bairro =?, tipo =?, senha =?, usuario =? where codigo =?";
        
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
          
            pre.setString(1, u.getNome());
            pre.setString(2, u.getTelefone());
            pre.setString(3, u.getEndereco());
            pre.setInt(4, u.getNumero());
            pre.setString (5,u.getComplemento());
            pre.setString(6, u.getBairro());
            pre.setString(7, u.getTipo());
            pre.setString(8, u.getSenha());
            pre.setString(9, u.getUsuario());
            pre.setInt(10, u.getCodigo());
            pre.execute();
            
            System.out.println("Alteração Realizada");
        
        }catch(SQLException a){
            System.out.println("Erro ao Alterar "+a.getMessage());
        }
         conexao.Desconecta();
    }//fim do metodo 
   
    public void excluirUsuarios(Usuario u){
        
        conexao.conecta();
        
        try{
            String sql = "delete from tb_usuarios where codigo=?";
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
            pre.setInt(1, u.getCodigo());
            pre.executeUpdate();
            System.out.println("Excluido com sucesso");
            
        }catch (SQLException e ){
            System.out.println("Erro ao excluir: " +e.getMessage());
        }
        conexao.Desconecta();
    }//fim do metodo excluir*/
    
    
    
}
