/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Escritorio
 */
public class Delivery {
    
    private int codigo;
    private String dataVenda;
    private float totalPedido;
    private String status;
    private Cliente idCliente;
    private String observacao;
    private float troco;
    private float cartao;
    private float entrega;
    private float dinheiro;
    private String tipo;
    private float totalProduto;
    private String opcional;
   
    
   
    private DefaultTableModel itensDelivery;
    //private int transf;
    //private float troco;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dataVenda
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the totalPedido
     */
    public float getTotalPedido() {
        return totalPedido;
    }

    /**
     * @param totalPedido the totalPedido to set
     */
    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the idCliente
     */
    public Cliente getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the itensDelivery
     */
    public DefaultTableModel getItensDelivery() {
        return itensDelivery;
    }

    /**
     * @param itensDelivery the itensDelivery to set
     */
    public void setItensDelivery(DefaultTableModel itensDelivery) {
        this.itensDelivery = itensDelivery;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the troco
     */
    public float getTroco() {
        return troco;
    }

    /**
     * @param troco the troco to set
     */
    public void setTroco(float troco) {
        this.troco = troco;
    }

   
    /**
     * @return the entrega
     */
    public float getEntrega() {
        return entrega;
    }

    /**
     * @param entrega the entrega to set
     */
    public void setEntrega(float entrega) {
        this.entrega = entrega;
    }

    /**
     * @return the totalProduto
     */
    public float getTotalProduto() {
        return totalProduto;
    }

    /**
     * @param totalProduto the totalProduto to set
     */
    public void setTotalProduto(float totalProduto) {
        this.totalProduto = totalProduto;
    }

    /**
     * @return the opcional
     */
    public String getOpcional() {
        return opcional;
    }

    /**
     * @param opcional the opcional to set
     */
    public void setOpcional(String opcional) {
        this.opcional = opcional;
    }

    /**
     * @return the cartao
     */
    public float getCartao() {
        return cartao;
    }

    /**
     * @param cartao the cartao to set
     */
    public void setCartao(float cartao) {
        this.cartao = cartao;
    }

    /**
     * @return the dinheiro
     */
    public float getDinheiro() {
        return dinheiro;
    }

    /**
     * @param dinheiro the dinheiro to set
     */
    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
