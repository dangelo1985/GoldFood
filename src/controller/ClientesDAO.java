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
import model.Cliente;

/**
 *
 * @author Rafael
 */
public class ClientesDAO {
    private ConexaoBanco conexao = new ConexaoBanco();
              
   public void SalvarClientes(Cliente c){
        conexao.conecta();
   
        try{
            String sql ="Insert into tb_clientes (nome, telefone, endereco, numero, complemento, bairro) "
                    + "values (?,?,?,?,?,?)";
            
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
            
            pre.setString(1, c.getNome());
            pre.setString(2, c.getTelefone());
            pre.setString(3, c.getEndereco());
            pre.setInt(4, c.getNumero());
            pre.setString(5, c.getComplemento());
            pre.setString(6,c.getBairro());
             
            pre.execute();
            
            
           
            
        }catch(SQLException a){
            System.out.println("Erro ao incluir: " + a.getMessage());
                    
        }
        conexao.Desconecta();
    }//fim do metodo incluir
    
    public void alterarClientes(Cliente c){
        
         try{
            conexao.conecta();
            
            String sql = "update tb_clientes set nome = ?, telefone =?, endereco= ?,"
                    + "numero= ?, complemento =?, bairro =? where codigo_cliente =?";
        
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
          
            pre.setString(1, c.getNome());
            pre.setString(2, c.getTelefone());
            pre.setString(3, c.getEndereco());
            pre.setInt(4, c.getNumero());
            pre.setString (5,c.getComplemento());
            pre.setString(6, c.getBairro());
            pre.setInt(7, c.getCodigo());
            pre.execute();
            
            System.out.println("Alteração Realizada");
        
        }catch(SQLException a){
            System.out.println("Erro ao Alterar "+a.getMessage());
        }
         conexao.Desconecta();
    }//fim do metodo 
   
    public void excluirClientes(Cliente c){
        
        conexao.conecta();
        
        try{
            String sql = "delete from tb_clientes where codigo_cliente=?";
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
            pre.setInt(1, c.getCodigo());
            pre.executeUpdate();
            System.out.println("Excluido com sucesso");
            
        }catch (SQLException e ){
            System.out.println("Erro ao excluir: " +e.getMessage());
        }
        conexao.Desconecta();
    }//fim do metodo excluir*/
    
    public boolean buscaCliente(Cliente c){
        conexao.conecta();
        try{
            PreparedStatement pre = conexao.conn.prepareStatement
        ("select * from tb_clientes INNER JOIN tb_bairros ON tb_bairros.nome_bairro = tb_clientes.bairro where telefone = ?");
            pre.setString(1, c.getTelefone());
            
            conexao.rs = pre.executeQuery();
            
            if (conexao.rs.next()){
                c.setCodigo(conexao.rs.getInt("codigo_cliente"));
                c.setNome(conexao.rs.getString("nome"));
                c.setEndereco(conexao.rs.getString("endereco"));
                c.setNumero(conexao.rs.getInt("numero"));
                c.setComplemento(conexao.rs.getString("complemento"));
                c.setBairro(conexao.rs.getString("bairro"));
                c.setPreco_entrega(conexao.rs.getDouble("preco_bairro"));
                return true;
            }
           conexao.Desconecta();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
        return false;
     }
    
    
}
