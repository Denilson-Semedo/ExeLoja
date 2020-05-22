/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exloja;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Denilson
 */
public class Encomenda implements Serializable{
    private int numero;
    private ArrayList<Produto> Produtos=new ArrayList<Produto>();
    private Date data;
    private int codigo_cliente;
    private String estado;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(ArrayList<Produto> Produtos) {
        this.Produtos = Produtos;
    }
    
    public Date getData(){
        return this.data;
    }
    
    public void setData(Date d){
        this.data=d;
    }
    
   public int getCodigo_Cliente(){
       return this.codigo_cliente;
   } 
   
   public void setCodigo_Cliente(int cc){
       this.codigo_cliente=cc;
   }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
   

    public Encomenda(int numero, ArrayList<Produto> lista, int cc) {
        this.numero = numero;
        this.Produtos =lista;
        this.codigo_cliente=cc;
        this.data= new Date();
    }
    
    public double totalEncomenda(){
        double t=0;
           for(Produto p: this.Produtos) t=t+p.getPreco();
        return t;
    }
    
    public void verEncomenda(){
        System.out.println(" Encomenda Nº "+this.numero+" Cliente Nº"+this.codigo_cliente+" Data "+this.data);
        System.out.println("Esta encomenda tem "+this.Produtos.size()+" produtos");
        System.out.println("========================== Listas de Produtos ===============================");
           for(Produto p: this.Produtos) p.imprimir();
        System.out.println("=====================================");
        
    }
    
    public void adicionarProduto(Produto p){
        Produtos.add(p);  
    }
    
    public void removerProdutoEncomenda( int cod){
        
        for(int i=0;i<Produtos.size();i++){
            Produto p =Produtos.get(i);
            if(p.getCodigo()==cod){
                Produtos.remove(p); break;
            }
        }
        
    }
    
    
}


