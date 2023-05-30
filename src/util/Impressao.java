/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.List;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.swing.JOptionPane;
import model.Impressora;
import view.FormCupomDelivery;

/**
 *
 * @author Escritorio
 */
public final class Impressao {
        private static PrintService impressora;
        FormCupomDelivery formCupom = new FormCupomDelivery();
        private ArrayList impressoras = new ArrayList();
        private Impressora imp = new Impressora();
        ConexaoBanco conexao = new ConexaoBanco();
        private String nomeImpressora;
        
    public Impressao(){
    detectaImpressoras();
    
    }
    
    public static void main(String[] args) {
       // new Impressao();
    }

    public ArrayList detectaImpressoras() {
        conexao.conecta();
        conexao.executaSQL("SELECT * FROM tb_impressoras WHERE codigo_impressora =1");
        
            try {
                conexao.rs.first();
                nomeImpressora = conexao.rs.getString("nome_impressora");
            } catch (SQLException ex) {
                Logger.getLogger(Impressao.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            DocFlavor df = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
            PrintService[] ps = PrintServiceLookup.lookupPrintServices(df, null);
                for (PrintService p: ps) {
                    System.out.println("Impressora encontrada: " + p.getName());
                    getImpressoras().add(p.getName());
                    if (p.getName().contains(nomeImpressora)) {
                        System.out.println("Impressora Selecionada: " + p.getName());
                        impressora = p;
                        break;
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
            System.out.println("\nteste:"+getImpressoras());
            
        return getImpressoras();
    }

    public synchronized boolean imprime(String texto) {
    // se nao existir impressora, entao avisa usuario
    // senao imprime texto
        if (impressora == null) {
            String msg = "Nenhuma impressora foi encontrada. Instale uma impressora padrão \r\n(Generic Text Only) e reinicie o programa.";
            JOptionPane.showMessageDialog(formCupom, msg, "Encerramento", JOptionPane.OK_OPTION);
        } else {
        
            try {
                System.out.println("Impressora: "+impressora);
                DocPrintJob dpj = impressora.createPrintJob();
                InputStream stream = new ByteArrayInputStream(texto.getBytes());
                DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
                Doc doc = new SimpleDoc(stream, flavor, null);
                dpj.print(doc, null);
                return true;
            } catch (PrintException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * @return the impressoras
     */
    public ArrayList getImpressoras() {
        return impressoras;
    }

    /**
     * @param impressoras the impressoras to set
     */
    public void setImpressoras(ArrayList impressoras) {
        this.impressoras = impressoras;
    }

}
    

