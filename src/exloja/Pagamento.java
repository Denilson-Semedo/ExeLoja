/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exloja;

import java.util.Date;

/**
 *
 * @author Denilson
 */
public class Pagamento {
    private int nCliente;
    private int nCartao;
    private int nEncomenda;
    private Date data;

    public int getnCliente() {
        return nCliente;
    }

    public void setnCliente(int nCliente) {
        this.nCliente = nCliente;
    }

    public int getnCartao() {
        return nCartao;
    }

    public void setnCartao(int nCartao) {
        this.nCartao = nCartao;
    }

    public int getnEncomenda() {
        return nEncomenda;
    }

    public void setnEncomenda(int nEncomenda) {
        this.nEncomenda = nEncomenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Pagamento(int nCliente, int nCartao, int nEncomenda, Date data) {
        this.nCliente = nCliente;
        this.nCartao = nCartao;
        this.nEncomenda = nEncomenda;
        this.data = data;
    }
    
}
