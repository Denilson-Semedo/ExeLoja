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
public class Promocao implements Serializable{
    private int codigo_produto;
    private double desconto;

    public Promocao(int codigo_produto, double desconto) {
        this.codigo_produto = codigo_produto;
        this.desconto = desconto;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    
    public void imprimir() {
        System.out.println("Promocao{" + "codigo_produto=" + codigo_produto + ", desconto=" + desconto + '}');
    }   
}

