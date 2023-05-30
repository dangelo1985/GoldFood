/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Delivery;
import model.Produto;
import util.ConexaoBanco;
/**
 *
 * @author Escritorio
 */
public class DeliveryDAO {
    ConexaoBanco conexao = new ConexaoBanco();
    
    public boolean cadastraVendaDelivery(Delivery d) {
        try {
           conexao.conecta();;
            
           String sql ="Insert into tb_delivery(data,total,idCliente,status,observacao,troco,cartao,entrega,tipo,dinheiro) values (?,?,?,?,?,?,?,?,?,?)";
            
           PreparedStatement pre = conexao.conn.prepareStatement(sql);
            
             pre.setString(1, d.getDataVenda());
             pre.setFloat(2, d.getTotalPedido());
             pre.setInt(3, d.getIdCliente().getCodigo());
             pre.setString(4, d.getStatus());
             pre.setString(5, d.getObservacao());
             pre.setFloat(6, d.getTroco());
             pre.setDouble(7, d.getCartao());
             pre.setDouble(8, d.getEntrega());
             pre.setString(9, d.getTipo());
             pre.setDouble(10, d.getDinheiro());
             
            pre.executeUpdate();

            pre.close();
            
            for (int i = 0; i < d.getItensDelivery().getRowCount(); i++) {
                PreparedStatement pre2 = conexao.conn.prepareStatement("Insert Into tb_produtosdelivery"
                        + "(id_delivery,id_produto,quantidade,preco_produto,total_produto,opcional)"+
                        " values ((select MAX(codigo_delivery) from tb_delivery),?,?,?,?,?)");
                pre2.setInt(1, new Integer(d.getItensDelivery().getValueAt(i, 0).toString()));
                pre2.setInt(2, new Integer(d.getItensDelivery().getValueAt(i, 2).toString()));
                pre2.setDouble(3, new Double(d.getItensDelivery().getValueAt(i, 3).toString().replaceAll(",", ".")));
                pre2.setDouble(4, new Double(d.getItensDelivery().getValueAt(i, 4).toString().replaceAll(",", ".")));
                pre2.setString(5,d.getItensDelivery().getValueAt(i, 5).toString());
                
                pre2.executeUpdate();
              
                pre2.close();
            }
//           
         
            return true;
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
    }
     public void alterarDelivery(Delivery d){
        
         try{
            conexao.conecta();
            
            String sql = "update tb_delivery set status = ?, entrega = ?, dinheiro =?, cartao = ? where codigo_delivery =?";
        
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
          
            pre.setString(1, d.getStatus());
            pre.setFloat(2, d.getEntrega());
            pre.setFloat(3, d.getDinheiro());
            pre.setFloat(4, d.getCartao());
            pre.setInt(5, d.getCodigo());
            pre.execute();
            
            System.out.println("Alteração Realizada");
        
        }catch(SQLException a){
            System.out.println("Erro ao Alterar "+a.getMessage());
        }
         conexao.Desconecta();
    }//fim do metodo 
    
}
