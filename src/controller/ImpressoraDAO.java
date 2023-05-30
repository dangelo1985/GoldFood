/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Impressora;
import util.ConexaoBanco;

/**
 *
 * @author Escritorio
 */
public class ImpressoraDAO {
     private ConexaoBanco conexao = new ConexaoBanco();
              
  
    public void alterarBairro(Impressora i){
        
         try{
            conexao.conecta();
            
            String sql = "update tb_impressoras set nome_impressora = ?, exportar =?, mensagem =? where codigo_impressora =1";
        
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
          
            pre.setString(1, i.getNome_impressora());
            pre.setString(2, String.valueOf(i.getExportar()));
            pre.setString(3, i.getMensagem());
            pre.execute();
            
            System.out.println("Alteração Realizada");
        
        }catch(SQLException a){
            System.out.println("Erro ao Alterar "+a.getMessage());
        }
         conexao.Desconecta();
    }//fim do metodo 
}
