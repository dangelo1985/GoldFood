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
import model.Bairro;

/**
 *
 * @author Rafael
 */
public class BairrosDAO {
    private ConexaoBanco conexao = new ConexaoBanco();
              
   public void SalvarBairro(Bairro b){
        conexao.conecta();
   
        try{
            String sql ="Insert into tb_bairros (nome_bairro, preco_bairro) values (?, ?)";
            
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
            
            pre.setString(1, b.getNomeBairro());
            pre.setDouble(2, b.getPrecoBairro());
                       
            pre.execute();
            
            
           
            
        }catch(SQLException a){
            System.out.println("Erro ao incluir: " + a.getMessage());
                    
        }
        conexao.Desconecta();
    }//fim do metodo incluir
    
    public void alterarBairro(Bairro b){
        
         try{
            conexao.conecta();
            
            String sql = "update tb_bairros set nome_bairro = ?, preco_bairro =? where codigo_bairro =?";
        
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
          
            pre.setString(1, b.getNomeBairro());
            pre.setDouble(2, b.getPrecoBairro());
            pre.setInt(3, b.getCodigoBairro());
            pre.execute();
            
            System.out.println("Alteração Realizada");
        
        }catch(SQLException a){
            System.out.println("Erro ao Alterar "+a.getMessage());
        }
         conexao.Desconecta();
    }//fim do metodo 
   
    public void excluirBairro(Bairro b){
        
        conexao.conecta();
        
        try{
            String sql = "delete from tb_bairros where codigo_bairro=?";
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
            pre.setInt(1, b.getCodigoBairro());
            pre.executeUpdate();
            System.out.println("Excluido com sucesso");
            
        }catch (SQLException e ){
            System.out.println("Erro ao excluir: " +e.getMessage());
        }
        conexao.Desconecta();
    }//fim do metodo excluir*/
    
//    public boolean buscaProduto(Produto p){
//        conexao.conecta();
//        try{
//            PreparedStatement pre = conexao.conn.prepareStatement("Select * from tb_produtos where codigo_produto = ?");
//            pre.setInt(1, p.getCodigo());
//            
//            conexao.rs = pre.executeQuery();
//            
//            if (conexao.rs.next()){
//                p.setCodigo(conexao.rs.getInt("codigo_produto"));
//                p.setDescrição(conexao.rs.getString("descricao"));
//                p.setPreco(conexao.rs.getDouble("preco"));
//                return true;
//            }
//           conexao.Desconecta();
//            
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        } 
//        return false;
//     }
    
    
}
