/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correios;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Escritorio
 */
public class Correios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BuscarCep buscar = new BuscarCep();
        System.out.println(buscar.buscarCep("19904624"));
    }
    
}
