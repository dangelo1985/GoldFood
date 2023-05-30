/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correios;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cep;
import model.Cliente;

/**
 *
 * @author Escritorio
 */
public class BuscarCep {
     AtendeClienteService service = new AtendeClienteService();
     AtendeCliente proxy = service.getAtendeClientePort();
     private Cliente cliente = new Cliente();
     private String bairro,cidade, rua;

public Cliente buscarCep(String cep){
     try {
             
             rua = proxy.consultaCEP(cep).getEnd();
             bairro = proxy.consultaCEP(cep).getBairro();
             cidade = proxy.consultaCEP(cep).getCidade();
             cliente.setEndereco(rua);
             cliente.setBairro(bairro);
             //cliente.setCidade(cidade);
             
             
         } catch (SQLException_Exception ex) {
             Logger.getLogger(BuscarCep.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SigepClienteException ex) {
             Logger.getLogger(BuscarCep.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    return cliente;
}
}