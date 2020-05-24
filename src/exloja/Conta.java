/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exloja;

import java.io.Serializable;

/**
 *
 * @author Denilson
 */
public class Conta implements Serializable {
    private int codigoCliente;
    private int nCartao;
    private String banco;
    private String tipo;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getnCartao() {
        return nCartao;
    }

    public void setnCartao(int nCartao) {
        this.nCartao = nCartao;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Conta(int codigoCliente, int nCartao, String banco, String tipo) {
        this.codigoCliente = codigoCliente;
        this.nCartao = nCartao;
        this.banco = banco;
        this.tipo = tipo;
    }
    
    public void imprimir() {
        System.out.printf("|%17d%3s%15d%3s%14s%3s%15s|\n", codigoCliente, "|", nCartao, "|", banco, "|", tipo);
    } 
    
    
}
