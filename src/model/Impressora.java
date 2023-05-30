/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Escritorio
 */
public class Impressora {
    private int codigo_impressora;
    private String nome_impressora;
    private char exportar;
    private String mensagem;

    /**
     * @return the codigo_impressora
     */
    public int getCodigo_impressora() {
        return codigo_impressora;
    }

    /**
     * @param codigo_impressora the codigo_impressora to set
     */
    public void setCodigo_impressora(int codigo_impressora) {
        this.codigo_impressora = codigo_impressora;
    }

    /**
     * @return the nome_impressora
     */
    public String getNome_impressora() {
        return nome_impressora;
    }

    /**
     * @param nome_impressora the nome_impressora to set
     */
    public void setNome_impressora(String nome_impressora) {
        this.nome_impressora = nome_impressora;
    }

    /**
     * @return the exportar
     */
    public char getExportar() {
        return exportar;
    }

    /**
     * @param exportar the exportar to set
     */
    public void setExportar(char exportar) {
        this.exportar = exportar;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
}
