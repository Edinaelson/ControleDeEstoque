package menu;

import clientes.Cliente;
import clientes.Fisico;
import clientes.Juridico;
import produto.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

    //cores para o terminal
    String corVerde = "\u001B[32m";
    String linha = "|--------------------------------------------------------|";

    public void menu() throws Exception {

        //Lista de clientes
        Fisico f1 = new Fisico("Edinaelson Santos", "07403743385",8000,1);
        Fisico f2 = new Fisico("Stela Maria", "72057815072",7500,1);
        Fisico f3 = new Fisico("Fabricio Gome", "24215444080",5500,1);
        Fisico f4 = new Fisico("Ster albuquerque", "84196839061",4000,1);

        Juridico j1 = new Juridico("Pedro Henrique","03253242000185",15000,2);
        Juridico j2 = new Juridico("Roberta Miranda","08716374000110",22000,2);
        Juridico j3 = new Juridico("Jose Augusto","42360803000105",17000,2);
        Juridico j4 = new Juridico("Cyndy Valverde","55637830000116",500447,2);

        clientes.add(f1);clientes.add(f2);clientes.add(f3);clientes.add(f4);
        clientes.add(j1);clientes.add(j2);clientes.add(j3);clientes.add(j4);
        //Fim lista de Clientes

        //Lista de Produtos
        Produto p1 = new Produto("Placa mãe",455,10,375);
        Produto p2 = new Produto("Memoria Ram",456,9,100);
        Produto p3 = new Produto("Mouse",457,8,60);
        Produto p4 = new Produto("Teclado",458,7,540);
        Produto p5 = new Produto("Gabinete",459,6,400);

        produtos.add(p1);produtos.add(p2);produtos.add(p3);produtos.add(p4);produtos.add(p5);
        //Fim Lista de Produtos

        //String corVerde = "\u001B[32m";
        //String linha = "|--------------------------------------------------------|";
        Scanner scanner = new Scanner(System.in);
        //System.out.println("|--------------------------------------------------------|");
        System.out.println(corVerde + linha + "\u001B[0m");
        System.out.println("\u001B[32m|\u001B[0m  1- Cadastrar Produto | 2- Cadastrar Cliente           \u001B[32m|\u001B[0m");
        System.out.println("\u001B[32m|\u001B[0m  3- Listar Clientes   | 4- Listar Produtos             \u001B[32m|\u001B[0m");
        System.out.println("\u001B[32m|\u001B[0m  5- Ver cliente       | 6- Efetuar compra de produto   \u001B[32m|\u001B[0m");
        System.out.println("\u001B[32m|\u001B[0m  7- Editar Cliente    | 8- Editar Produto              \u001B[32m|\u001B[0m");
        System.out.println("\u001B[32m|\u001B[0m  9- Excluir Produto   | 10- Excluir Cliente            \u001B[32m|\u001B[0m");
        System.out.println("\u001B[32m|\u001B[0m  0- Sair                                               \u001B[32m|\u001B[0m");
        int i = 10;
        System.out.println(corVerde + linha + "\u001B[0m");
        while (i != 0) {
            System.out.println("Informe opção: ");
            i = scanner.nextInt();
            switch (i) {
                case 1: {
                    break;
                }
                case 2: {
                    cadastrarCliente();
                    break;
                }
                case 3: {
                    listarClientes();
                    break;
                }
                case 4: {
                    listarProdutos();
                    break;
                }
                case 5:{
                    verCliente();
                    break;
                }
                case 9:{
                    excluirProduto();
                    break;
                }
            }
        }
        scanner.close();
    }

    public void excluirProduto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exclusão de Produto");
        System.out.println("Informe Código");
        int codigo = scanner.nextInt();
        for(int i=0;i<produtos.size();i++){
            if(codigo == produtos.get(i).getCodigo()){
                System.out.println("Produto removido: " + produtos.get(i).getNome());
                produtos.remove(produtos.get(i));
            }
        }
    }

    public void cadastrarCliente(){
        System.out.println("Cadastro de Clientes");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe tipo: 1-Pessoa Fisica | 2-Pessoa Juridica");
        int tipo = scanner.nextInt();
        if(tipo == 1){
            System.out.println("Informe CPF: ");
            String cpf = scanner.next();
            System.out.println("Informe saldo: ");
            Double saldo = scanner.nextDouble();
            Fisico fisico = new Fisico(nome,cpf,saldo,tipo);
            clientes.add(fisico);
        }
        if (tipo == 2) {
            System.out.println("Informe cnpj: ");
            String cnpj = scanner.next();
            System.out.println("Informe saldo: ");
            double saldo = scanner.nextDouble();
            Juridico juridico = new Juridico(nome, cnpj, saldo,tipo);
            clientes.add(juridico);
        }
        System.out.println("Cadastrado com sucesso!");
        System.out.println("------------------------------------");
    }

    public void listarClientes(){
        System.out.println("Lista de Clientes");
        System.out.println(corVerde + linha + "\u001B[0m");
        for (int n = 0;n<clientes.size();n++){
            System.out.println("\u001B[32m|\u001B[0m\u001b[34mNome: " + clientes.get(n).getNome());
            Cliente.identificarDocumento(clientes.get(n).getTipo());
        }
    }

    public void listarProdutos(){
        System.out.println("Lista de Produtos");
        System.out.println(corVerde + linha + "\u001B[0m");
        for (int n = 0;n<produtos.size();n++){
            System.out.println("\u001B[32m|\u001B[0m\u001b[34mNome:.................. " + produtos.get(n).getNome());
            System.out.println("\u001B[32m|\u001B[0m\u001b[34mPreço:................. " + produtos.get(n).getPreco());
            System.out.println("\u001B[32m|\u001B[0m\u001b[34mQuantida:.............. " + produtos.get(n).getQuantidade());
            System.out.println("\u001B[32m|\u001B[0m\u001b[34mCódigo:................ " + produtos.get(n).getCodigo());
            System.out.println(corVerde + linha + "\u001B[0m");
        }
    }

    public void verCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe documento para buscar cliente: ");
        String documento = scanner.next();
        for (int i = 0; i<clientes.size();i++){
            if(documento.equals(clientes.get(i).cnpj)){
                System.out.println("Nome: " + clientes.get(i).getNome());
                System.out.println("Saldo: " + clientes.get(i).getSaldo());
                //System.out.println("Tipo: " + clientes.get(i).getTipo());
                Cliente.identificarDocumento(clientes.get(i).getTipo());
            }
        }
        System.out.println("------------------------------------");
    }
}
