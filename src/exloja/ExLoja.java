/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exloja;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denilson
 */
public class ExLoja implements Serializable {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Produto> lista_Produtos = new ArrayList<Produto>();
    private static ArrayList<Cliente> lista_Clientes = new ArrayList<Cliente>();
    private static ArrayList<Encomenda> lista_Encomendas = new ArrayList<Encomenda>();
    private static ArrayList<Promocao> lista_Promocoes = new ArrayList<Promocao>();
    private static ArrayList<Pagamento> lista_Pagamentos = new ArrayList<Pagamento>();
    private static ArrayList<Conta> lista_Contas = new ArrayList<Conta>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ler();
        menu_Principal();

    }

    public static void escrever() throws IOException, ClassNotFoundException, FileNotFoundException {
        FileOutputStream arq = null;

        //Produtos
        try {
            arq = new FileOutputStream("Produtos.txt");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            for (Produto p : lista_Produtos) {
                obj.writeObject(p);
            }
        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para escrita falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } finally {
            arq.close();
        }

        //Clientes
        try {
            arq = new FileOutputStream("Clientes.txt");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            for (Cliente c : lista_Clientes) {
                obj.writeObject(c);
            }
        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para escrita falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } finally {
            arq.close();
        }

        //Encomendas
        try {
            arq = new FileOutputStream("Encomendas.txt");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            for (Encomenda e : lista_Encomendas) {
                obj.writeObject(e);
            }
        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para escrita falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } finally {
            arq.close();
        }

        //Promocoes
        try {
            arq = new FileOutputStream("Promocoes.txt");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            for (Promocao pro : lista_Promocoes) {
                obj.writeObject(pro);
            }

        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para escrita falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } finally {
            arq.close();
        }

        //Contas
        try {
            arq = new FileOutputStream("Contas.txt");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            for (Conta c : lista_Contas) {
                obj.writeObject(c);
            }

        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para escrita falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } finally {
            arq.close();
        }

        //Pagamentos
        try {
            arq = new FileOutputStream("Pagamentos.txt");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            for (Pagamento pag : lista_Pagamentos) {
                obj.writeObject(pag);
            }

        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para escrita falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } finally {
            arq.close();
        }
    }

    public static void ler() throws FileNotFoundException {

        //try and catch
        //O Programa tenta executar o bloco do codigo try
        FileInputStream arq = null;
        //Produtos
        try {
            File file = new File("Produtos.txt");
            if (file.exists()) {
                arq = new FileInputStream(file);
                ObjectInputStream obj = new ObjectInputStream(arq);
                while (arq.available() > 0) {
                    lista_Produtos.add((Produto) obj.readObject());
                }
            } else {
                file.createNewFile();
            }
        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para Leitura falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExLoja.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Clientes
        try {
            File file = new File("Clientes.txt");
            if (file.exists()) {
                arq = new FileInputStream(file);
                ObjectInputStream obj = new ObjectInputStream(arq);
                while (arq.available() > 0) {
                    lista_Clientes.add((Cliente) obj.readObject());
                }
            } else {
                file.createNewFile();
            }
        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para Leitura falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExLoja.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Encomendas
        try {
            File file = new File("Encomendas.txt");
            if (file.exists()) {
                arq = new FileInputStream(file);
                ObjectInputStream obj = new ObjectInputStream(arq);
                while (arq.available() > 0) {
                    lista_Encomendas.add((Encomenda) obj.readObject());
                }
            } else {
                file.createNewFile();
            }
        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para Leitura falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExLoja.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Promoções
        try {
            File file = new File("Promocoes.txt");
            if (file.exists()) {
                arq = new FileInputStream(file);
                ObjectInputStream obj = new ObjectInputStream(arq);
                while (arq.available() > 0) {
                    lista_Promocoes.add((Promocao) obj.readObject());
                }
            } else {
                file.createNewFile();
            }

        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para Leitura falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExLoja.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Se algo de errado acontecer, Imprime a mansagem de erro
        //Evitando que o pragrama feche caso ocorrer algum erro.

        //Contas
        try {
            File file = new File("Contas.txt");
            if (file.exists()) {
                arq = new FileInputStream(file);
                ObjectInputStream obj = new ObjectInputStream(arq);
                while (arq.available() > 0) {
                    lista_Contas.add((Conta) obj.readObject());
                }
            } else {
                file.createNewFile();
            }
        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para Leitura falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExLoja.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Pagamentos
        try {
            File file = new File("Pagamentos.txt");
            if (file.exists()) {
                arq = new FileInputStream(file);
                ObjectInputStream obj = new ObjectInputStream(arq);
                while (arq.available() > 0) {
                    lista_Pagamentos.add((Pagamento) obj.readObject());
                }
            } else {
                file.createNewFile();
            }
        } catch (FileNotFoundException erro) {
            erro.printStackTrace();
            System.out.println("Tentativa de abrir o arquivo indicado para Leitura falhou!");
        } catch (IOException erro) {
            erro.printStackTrace();
            System.out.println("Algo ocorreu mal!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExLoja.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void menu_Principal() throws IOException, ClassNotFoundException {

        Scanner s = new Scanner(System.in);
        int op = 0;
        while (op != 6) {
            System.out.println("============================ Menu Principal =================================");
            System.out.println("Escolhe uma opção");
            System.out.println("1 - Gerir Produtos");
            System.out.println("2 - Gerir Encomendas");
            System.out.println("3 - Gerir Clientes");
            System.out.println("4 - Gerir Promoções");
            System.out.println("5 - Gerir Contas");
            System.out.println("6 - Sair");
            op = s.nextInt();

            switch (op) {
                case 1: {
                    gerirProdutos();
                    break;
                }
                case 2: {
                    gerirEncomendas();
                    break;
                }
                case 3: {
                    gerirClientes();
                    break;
                }
                case 4: {
                    gerirPromocoes();
                    break;
                }
                case 5: {
                    gerirContas();
                    break;
                }
                case 6: {
                    System.out.println("A sair .......");
                    escrever();
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");
                }
            }
        }

    }

    /**
     * ***********************Métodos para Gerir
     * Produtos************************
     */
    private static void gerirProdutos() {

        Scanner s = new Scanner(System.in);
        int op = 0;
        while (op != 4) {
            System.out.println("============================ Gestão de Produtos =============================");
            System.out.println("Escolhe uma opção");
            System.out.println("1 - Ver Produtos");
            System.out.println("2 - Adicionar Produto");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Voltar ao Menu Principal");
            op = s.nextInt();

            switch (op) {
                case 1: {
                    if (!lista_Produtos.isEmpty()) {
                        System.out.println("\n=============LISTA_PRODUTOS===============");
                        System.out.println("|   CÓDIGO  |    NOME    |   PREÇO(ECV)  |");
                        System.out.println("|-----------+------------+---------------|");
                        for (Produto p : lista_Produtos) {
                            p.imprimir();
                        }
                        System.out.println("|========================================|\n");
                    } else {
                        System.out.println("Lita vazia!");
                    }
                    break;
                }
                case 2: {
                    adicionarProdutoNaLoja();
                    break;
                }
                case 3: {
                    if (!lista_Produtos.isEmpty()) {
                        removerProdutoDaLoja();
                    } else {
                        System.out.println("Lita vazia!");
                    }
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");

                }
            }
        }
    }

    public static void adicionarProdutoNaLoja() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insere o código do Produto");
        int co = s.nextInt();
        System.out.println("Insere a designação do Produto");
        String de = s.next();
        System.out.println("Insere o preço do Produto");
        double pr = s.nextDouble();
        Produto p = new Produto(co, de, pr);
        lista_Produtos.add(p);
    }

    public static void removerProdutoDaLoja() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insere o código do Produto para que seja removido");
        int cod = s.nextInt();

        for (Produto p : lista_Produtos) {
            if (p.getCodigo() == cod) {
                lista_Produtos.remove(p);
                break;
            }
        }
    }

    /**
     * *****************************************************************************
     */
    /**
     * ***********************Métodos para GERIR
     * ENCOMENDAS************************
     */
    private static void gerirEncomendas() {

        Scanner s = new Scanner(System.in);
        int op = 0;
        while (op != 7) {
            System.out.println("========================== Gestão de Encomendas =============================");
            System.out.println("Escolhe uma opção");
            System.out.println("1 - Ver Encomendas");
            System.out.println("2 - Adicionar Encomenda");
            System.out.println("3 - Remover Encomenda");
            System.out.println("4 - Gerir uma Encomenda");
            System.out.println("5 - Efectuar Pagamento de uma Encomenda");
            System.out.println("6 - Histórico de Pagamentos");
            System.out.println("7 - Voltar ao Menu Principal");
            op = s.nextInt();

            switch (op) {
                case 1: {
                    if (!lista_Encomendas.isEmpty()) {
                        for (Encomenda e : lista_Encomendas) {
                            e.verEncomenda();
                            //ver desconto da encomenda
                            double total = e.totalEncomenda();
                            System.out.println("O total da encomenda é " + total);
                            double desconto = descontoEncomenda(e.getProdutos(), lista_Promocoes);
                            System.out.println("O desconto é " + desconto);
                            double totalComDesc = total - desconto;
                            System.out.println("O total com desconto é " + totalComDesc);
                            System.out.println("=============================================================================");
                        }
                    } else {
                        System.out.println("Lista vazia!!");
                    }
                    break;
                }
                case 2: {
                    adicionarEncomendaNaLoja();
                    break;
                }
                case 3: {
                    if (!lista_Encomendas.isEmpty()) {
                        System.out.println("Insere o Número da Encomenda");
                        int numero = s.nextInt();
                        removerEncomendaDaLoja(numero);
                    } else {
                        System.out.println("Lista vazia!!");
                    }
                    break;
                }
                case 4: {
                    if (!lista_Encomendas.isEmpty()) {
                        System.out.println("Insere o Número da Encomenda");
                        int numero = s.nextInt();
                        Encomenda e = obtemEncomenda(numero);
                        gerir_Encomenda(e);
                    } else {
                        System.out.println("Lista vazia!!");
                    }
                    break;
                }
                case 5: {
                    if (!lista_Encomendas.isEmpty()) {
                        System.out.println("Insere o Número da Encomenda");
                        int numero = s.nextInt();
                        for (Encomenda e : lista_Encomendas) {
                            if (e.getNumero() == numero) {
                                e.verEncomenda();
                            }
                        }
                        System.out.println("1 - Continuar");
                        System.out.println("2 - Cancelar");
                        int x = s.nextInt();
                        if (x == 1) {
                            efectuarpagamento(numero);
                        }
                    } else {
                        System.out.println("Lista vazia!!");
                    }
                    break;
                }
                case 6: {
                    if (!lista_Pagamentos.isEmpty()) {
                        System.out.println("\n==============================LISTA_PAGAMENTOS======================================");
                        System.out.println("|  CODIGO CLIENTE  |    Nº CARTÃO    |  Nº ENCOMENDA  |            DATA            |");
                        System.out.println("|------------------+-----------------+----------------+----------------------------|");
                        for (Pagamento pag : lista_Pagamentos) {
                            pag.imprimir();
                        }
                        System.out.println("|==================================================================================|\n");
                    } else {
                        System.out.println("\nLista vazia!!");
                    }
                    break;
                }
            }
        }

    }

    //Método para gerir uma Encomenda
    public static void gerir_Encomenda(Encomenda e1) {
        if (e1 != null) {
            Scanner s = new Scanner(System.in);
            int op = 0;
            while (op != 6) {
                System.out.println("Escolhe uma opção");
                System.out.println("1 - Ver Encomenda");
                System.out.println("2 - Adicionar Produto");
                System.out.println("3 - Remover Produto");
                System.out.println("4 - Ver Total da Encomenda");
                System.out.println("5 - Efectuar o pagamento desta encomenda");
                System.out.println("6 - Voltar ao Menu Encomendas");

                op = s.nextInt();

                switch (op) {
                    case 1: {
                        e1.verEncomenda();
                        //ver desconto da encomenda
                        double total = e1.totalEncomenda();
                        System.out.println("O total da encomenda é " + total);
                        double desconto = descontoEncomenda(e1.getProdutos(), lista_Promocoes);
                        System.out.println("O desconto é " + desconto);
                        double totalComDesc = total - desconto;
                        System.out.println("O total com desconto é " + totalComDesc);
                        break;
                    }
                    case 2: {
                        System.out.println("Insere o código do produto:");
                        int cod = s.nextInt();
                        adicionarProdutoEncomenda(e1, cod);
                        break;
                    }
                    case 3: {
                        System.out.println("Insere o Codigo do produto a remover");
                        int c = s.nextInt();
                        e1.removerProdutoEncomenda(c);
                        break;
                    }
                    case 4: {
                        System.out.println("O total da encomenda é " + e1.totalEncomenda());
                        break;
                    }
                    case 5: {
                        efectuarpagamento(e1.getNumero());
                        break;
                    }
                    case 6: {
                        System.out.println("A sair da Encomenda.......");
                        break;
                    }
                    default: {
                        System.out.println("Opção inválida!");
                    }
                }
            }
        } else {
            System.out.println("Não existe encomenda com este numero");
        }
    }

    public static Encomenda obtemEncomenda(int n) {
        Encomenda e1 = null;
        for (Encomenda e : lista_Encomendas) {
            if (e.getNumero() == n) {
                return e;
            }
        }
        return e1;
    }

    private static void adicionarProdutoEncomenda(Encomenda e, int cod) {
        boolean existe = false;
        for (Produto p : lista_Produtos) {
            if (p.getCodigo() == cod) {
                e.adicionarProduto(p);
                existe = true;
                break;
            }
        }

        if (existe != true) {
            System.out.println("Não existe produto com este código");
        }
    }

    private static void adicionarEncomendaNaLoja() {

        Scanner s = new Scanner(System.in);
        System.out.println("Insere o Numero da encomenda");
        int numero = s.nextInt();
        System.out.println("Insere o codigo do cliente");
        int cod_cliente = s.nextInt();

        Encomenda e = new Encomenda(numero, new ArrayList<>(), cod_cliente, "Pendente");
        lista_Encomendas.add(e);
        gerir_Encomenda(e);

    }

    private static void removerEncomendaDaLoja(int numero) {
        for (Encomenda e : lista_Encomendas) {
            if (e.getNumero() == numero) {
                lista_Encomendas.remove(e);
                break;
            }
        }
    }

    private static void efectuarpagamento(int numero) {
        Scanner s = new Scanner(System.in);
        int y = 0;
        int cli = 0;
        for (Encomenda e : lista_Encomendas) {
            if (e.getNumero() == numero && e.getEstado() == "Pendente") {
                y = 1;
                cli = e.getCodigo_Cliente();
                break;
            }
        }
        if (y == 1) {
            System.out.println("Insira o numero do cartão deste cliente");
            int nc = s.nextInt();
            for (Conta c : lista_Contas) {
                if (c.getCodigoCliente() == cli) {
                    if (c.getnCartao() == nc) {
                        for (Encomenda e : lista_Encomendas) {
                            if (e.getNumero() == numero) {
                                e.setEstado("Pago");
                                System.out.println("Pagamento efectuado com sucesso!!");
                                Pagamento pag = new Pagamento(cli, nc, numero);
                                lista_Pagamentos.add(pag);
                                y = 2;
                                break;
                            }
                        }
                    }
                }
                break;
            }
            if (y != 2) {
                System.err.println("Não fooi possivel efectuar o pagamento!!");
                System.out.println("Este Cliente não possui conta na loja");
                System.out.println("                 ou                  ");
                System.out.println("O cartão utilizado é de outro cliente");
            }
        } else {
            System.out.println("Não Existe encomendas pendentes com este numero!!");
        }

    }

    /**
     * ************************************************************************
     */
    /**
     * *****************************Métodos para GERIR CLIENTES****************
     */
    private static void gerirClientes() {
        Scanner s = new Scanner(System.in);
        int op = 0;
        while (op != 4) {
            System.out.println("============================ Gestão de Clientes =============================");
            System.out.println("Escolhe uma opção");
            System.out.println("1 - Ver Clientes");
            System.out.println("2 - Adicionar Cliente");
            System.out.println("3 - Remover Cliente");
            System.out.println("4 - Voltar ao Menu Principal");
            op = s.nextInt();

            switch (op) {
                case 1: {
                    if (!lista_Clientes.isEmpty()) {
                        System.out.println("\n===================================LISTA_CLIENTES=====================================");
                        System.out.println("|  CODIGO  |    NOME    |  TELEFONE  |               EMAIL              |    MORADA    |");
                        System.out.println("|----------+------------+------------+----------------------------------+--------------|");
                        for (Cliente c : lista_Clientes) {
                            c.imprimir();
                        }
                        System.out.println("|======================================================================================|\n");
                    } else {
                        System.out.println("\nLista vazia!!");
                    }
                    break;
                }
                case 2: {
                    adicionarClienteNaLoja();
                    break;
                }
                case 3: {
                    if (!lista_Clientes.isEmpty()) {
                        removerClienteDaLoja();
                    } else {
                        System.out.println("Lista vazia!!");
                    }
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");

                }
            }
        }

    }

    private static void adicionarClienteNaLoja() {

        Scanner s = new Scanner(System.in);
        System.out.println("Insere nome do Cliente");
        String no = s.next();
        System.out.println("Insere o código do Cliente");
        int co = s.nextInt();
        System.out.println("Insere a morada do Cliente");
        String mo = s.next();
        System.out.println("Insere o email do Cliente");
        String em = s.next();
        System.out.println("Insere o telefone do Cliente");
        String tl = s.next();
        Cliente c = new Cliente(co, no, em, mo, tl);
        lista_Clientes.add(c);

    }

    private static void removerClienteDaLoja() {

        Scanner s = new Scanner(System.in);
        System.out.println("Insere o código do Cliente para que seja removido");
        int cod = s.nextInt();

        for (Cliente c : lista_Clientes) {
            if (c.getCodigo() == cod) {
                lista_Clientes.remove(c);
                break;
            }
        }

    }

    /**
     * ************************************************************************
     */
    /**
     * *****************************Métodos para GERIR
     * PROMOÇÕES****************
     */
    private static void gerirPromocoes() {

        Scanner s = new Scanner(System.in);
        int op = 0;
        while (op != 4) {
            System.out.println("============================ Gestão de Promoções =============================");
            System.out.println("Escolhe uma opção");
            System.out.println("1 - Ver Promoção");
            System.out.println("2 - Adicionar Promoção");
            System.out.println("3 - Remover Promoção");
            System.out.println("4 - Voltar ao Menu Principal");
            op = s.nextInt();

            switch (op) {
                case 1: {
                    if (!lista_Promocoes.isEmpty()) {
                        for (Promocao pm : lista_Promocoes) {
                            pm.imprimir();
                        }
                    } else {
                        System.out.println("Lista vazia!!");
                    }
                    break;
                }
                case 2: {
                    adicionarPromocaoNaLoja();
                    break;
                }
                case 3: {
                    if (!lista_Promocoes.isEmpty()) {
                        removerPromocaoDaLoja();
                    } else {
                        System.out.println("Lista vazia!!");
                    }
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");

                }
            }
        }

    }

    public static void adicionarPromocaoNaLoja() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insere o código do Produto");
        int co = s.nextInt();
        System.out.println("Insere o valor de desconto");
        double de = s.nextDouble();
        Promocao pm = new Promocao(co, de);
        lista_Promocoes.add(pm);
    }

    public static void removerPromocaoDaLoja() {

        Scanner s = new Scanner(System.in);
        System.out.println("Insere o código do Produto para que seja removido a promoção");
        int cod = s.nextInt();

        for (Promocao pm : lista_Promocoes) {
            if (pm.getCodigo_produto() == cod) {
                lista_Promocoes.remove(pm);
                break;
            }
        }
    }

    public static double descontoEncomenda(ArrayList<Produto> lpe, ArrayList<Promocao> lpm) {
        double totalDesc = 0;

        for (Produto p : lpe) {
            for (Promocao pm : lpm) {
                if (p.getCodigo() == pm.getCodigo_produto()) {
                    totalDesc += p.desconto(pm.getDesconto());
                }
            }
        }
        return totalDesc;
    }

    private static void gerirContas() {

        Scanner s = new Scanner(System.in);
        int op = 0;
        while (op != 4) {
            System.out.println("============================ Gestão de Contas =============================");
            System.out.println("Escolhe uma opção");
            System.out.println("1 - Ver Contas");
            System.out.println("2 - Adicionar Conta");
            System.out.println("3 - Remover Conta");
            System.out.println("4 - Voltar ao Menu Principal");
            op = s.nextInt();

            switch (op) {
                case 1: {
                    if (!lista_Contas.isEmpty()) {
                        System.out.println("\n===============================LISTA_CONTAS=============================");
                        System.out.println("|   CÓDIGO CLIENTE  |    Nª CARTÃO    |      BANCO     |   TIPO CONTA  |");
                        System.out.println("|-------------------+-----------------+----------------+---------------|");
                        for (Conta c : lista_Contas) {
                            c.imprimir();
                        }
                        System.out.println("|======================================================================|\n");
                    } else {
                        System.out.println("Lita vazia!");
                    }
                    break;
                }
                case 2: {
                    adicionarContaNaLoja();
                    break;
                }
                case 3: {
                    if (!lista_Contas.isEmpty()) {
                        removerContaDaLoja();
                    } else {
                        System.out.println("Lita vazia!");
                    }
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");

                }
            }
        }
    }

    public static void adicionarContaNaLoja() {
        Scanner s = new Scanner(System.in);
        int co;
        int y = 0;
        System.out.println("Insere o código do Cliente");
        co = s.nextInt();

        for (Cliente cl : lista_Clientes) {
            if (cl.getCodigo() == co) {
                for (Conta c : lista_Contas) {
                    if (c.getCodigoCliente() == co) {
                        y = 1;
                    }
                    break;
                }
                y = 2;
                break;
            }
        }

        if (y == 2) {
            System.out.println("Insere número do Cartão da Conta Cliente");
            int Nc = s.nextInt();
            boolean existeCartao = false;
            for (Conta c : lista_Contas) {
                if (c.getnCartao() == Nc) {
                    existeCartao = true;
                }
            }
            if (existeCartao == false) {
                System.out.println("Insere o Banco do Cliente");
                String banco = s.next();
                int x;
                String tipo = "";
                do {
                    System.out.println("Insere o tipo de conta que desejas criar para este Cliente");
                    System.out.println(" 1 - Particular ");
                    System.out.println(" 2 - Empresa ");
                    x = s.nextInt();
                    switch (x) {
                        case 1:
                            tipo = "Particular";
                            break;
                        case 2:
                            tipo = "Empresa";
                            break;
                        default:
                            System.out.println("Opção Invalida!!");
                    }

                } while (x != 1 || x != 2);

                Conta c = new Conta(co, Nc, banco, tipo);
                lista_Contas.add(c);
                System.out.println("Conta adicionada com sucesso!!");
            } else {
                System.out.println("Este Nº de Cartão já se encontra vinculado a uma outra conta!!");
            }

        } else if (y == 0) {
            System.out.println("Cliente não existe");
        } else {
            System.out.println("Este Cliente Já possui uma Conta na loja!!");
        }
    }

    public static void removerContaDaLoja() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insere número do Cartão da Conta Cliente");
        int cart = s.nextInt();

        for (Conta c : lista_Contas) {
            if (c.getnCartao() == cart) {
                lista_Contas.remove(c);
                System.out.println("Conta Removido!!");
                break;
            }
        }
        System.out.println("Este número do Cartão não se encontra registrado na loja!!");
    }
}
