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
import model.Empresa;

/**
 *
 * @author Rafael
 */
public class EmpresaDAO {
    private ConexaoBanco conexao = new ConexaoBanco();
              
  
    public void alterarBairro(Empresa e){
        
         try{
            conexao.conecta();
            
            String sql = "update tb_empresa set nome_empresa = ?, nome_fantasia =?, cnpj_cpf =?,"
                    + "ie_rg =?, endereco_empresa =?, numero_empresa =?, comp_empresa =?,"
                    + "bairro_empresa =?, cidade_empresa =?, telefone_empresa =? where codigo_empresa =1";
        
            PreparedStatement pre = conexao.conn.prepareStatement(sql);
          
            pre.setString(1, e.getNome_empresa());
            pre.setString(2, e.getNome_fantasia());
            pre.setString(3, e.getCnpj_cpf());
            pre.setString(4, e.getIe_rg());
            pre.setString(5, e.getEndereco_empresa());
            pre.setInt(6, e.getNumero_empresa());
            pre.setString(7, e.getComp_empresa());
            pre.setString(8, e.getBairro_empresa());
            pre.setString(9, e.getCidade_empresa());
            pre.setString(10, e.getTelefone());
            pre.execute();
            
            System.out.println("Alteração Realizada");
        
        }catch(SQLException a){
            System.out.println("Erro ao Alterar "+a.getMessage());
        }
         conexao.Desconecta();
    }//fim do metodo 
   
        
}
