package menu;

import clientes.Cliente;
import clientes.Fisico;
import clientes.Juridico;
import produto.Produto;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Cadastrar Cliente");
        System.out.println("3- Listar Clientes");
        System.out.println("4- Listar Produtos");
        System.out.println("5- Pesquisar cliente");
        System.out.println("6- Efetuar compra de produto: ");
        System.out.println("0- Sair");
        int i = 10;
        System.out.println("--------------------------------------------");
        while (i != 0) {
            System.out.println("Informe opção: ");
            i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("Cadastrar Produto");
                    System.out.println("Informe nome: ");
                    String nome = scanner.next();
                    System.out.println("Informe código(numero): ");
                    int codigo = scanner.nextInt();
                    System.out.println("Informe quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.println("Informe preço: ");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(nome, codigo, quantidade, preco);
                    //TODO bug, nome aparece duas vezes no cadastro
                    Produto.cadastrarProduto(produto);
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 2: {
                    System.out.println("Informe nome: ");
                    String nome = scanner.next();
                    System.out.println("Informe documento(CNPJ ou CPF:");
                    String documento = scanner.next();
                    // colocar 1000 para cpf ou 1500 para CNPJ
                    System.out.println("Informe saldo do cliente: ");
                    double saldo = scanner.nextDouble();
                    int tipo;// 1 CPF/ 2 CNPJ
                    if (documento.length()>11){
                        tipo = 2;
                        Juridico juridico = new Juridico(nome,documento,tipo,saldo);
                        Cliente.cadastrarCliente(juridico);
                    }
                    if (documento.length() <= 11){
                        tipo = 1;
                        Fisico fisico = new Fisico(nome,documento,tipo,saldo);
                        Cliente.cadastrarCliente(fisico);
                    }

                    System.out.println("--------------------------------------------");
                    break;
                }
                case 3: {
                    Cliente.listarClientes();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 4: {
                    Produto.listarProdutos();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 5:{

                    System.out.println("--------------------------------------------");
                    break;
                }
            }
        }
        scanner.close();
    }

}
