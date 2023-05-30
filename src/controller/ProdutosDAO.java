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
import model.Produto;

/**
 *
 * @author Rafael
 */
public class ProdutosDAO {
    private ConexaoBanco conexao = new ConexaoBanco();
              
   public void SalvarProdutos(Produto p){
        conexao.conecta();
   
        try{
            String sql ="Insert into tb_produtos (descricao, preco, referencia) values (?, ?, ?)";
            
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
            
            pre.setString(1, p.getDescrição());
            pre.setDouble(2, p.getPreco());
            pre.setString(3, p.getReferencia());
             
            pre.execute();
            
            JOptionPane.showMessageDialog(null, "Produto Salvo com Sucesso!");
           
            
        }catch(SQLException a){
            System.out.println("Erro ao incluir: " + a.getMessage());
                    
        }
        conexao.Desconecta();
    }//fim do metodo incluir
    
    public void alterarProdutos(Produto p){
        
         try{
            conexao.conecta();
            
            String sql = "update tb_produtos set descricao = ?, preco =?, referencia= ? where codigo_produto =?";
        
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
          
            pre.setString(1, p.getDescrição());
            pre.setDouble(2, p.getPreco());
            pre.setString(3, p.getReferencia());
            pre.setInt(4, p.getCodigo());
            pre.execute();
            
            System.out.println("Alteração Realizada");
        
        }catch(SQLException a){
            System.out.println("Erro ao Alterar "+a.getMessage());
        }
         conexao.Desconecta();
    }//fim do metodo 
   
    public void excluirProdutos(Produto p){
        
        conexao.conecta();
        
        try{
            String sql = "delete from tb_produtos where codigo_produto=?";
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
            pre.setInt(1, p.getCodigo());
            pre.executeUpdate();
            System.out.println("Excluido com sucesso");
            
        }catch (SQLException e ){
            System.out.println("Erro ao excluir: " +e.getMessage());
        }
        conexao.Desconecta();
    }//fim do metodo excluir*/
    
    public boolean buscaProduto(Produto p){
        conexao.conecta();
        try{
            PreparedStatement pre = conexao.conn.prepareStatement("Select * from tb_produtos where codigo_produto = ?");
            pre.setInt(1, p.getCodigo());
            
            conexao.rs = pre.executeQuery();
            
            if (conexao.rs.next()){
                p.setCodigo(conexao.rs.getInt("codigo_produto"));
                p.setDescrição(conexao.rs.getString("descricao"));
                p.setPreco(conexao.rs.getDouble("preco"));
                return true;
            }
           conexao.Desconecta();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
        return false;
     }
    public boolean buscaProdutoNome(Produto p){
        conexao.conecta();
        try{
            PreparedStatement pre = conexao.conn.prepareStatement("Select * from tb_produtos where descricao LIKE '%?%'");
            pre.setString(1, p.getDescrição());
            
            conexao.rs = pre.executeQuery();
            
            if (conexao.rs.next()){
                p.setCodigo(conexao.rs.getInt("codigo_produto"));
                p.setDescrição(conexao.rs.getString("descricao"));
                p.setPreco(conexao.rs.getDouble("preco"));
                return true;
            }
           conexao.Desconecta();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
        return false;
     }
    
    
}
