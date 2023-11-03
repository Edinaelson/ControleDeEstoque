package menu;

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
        System.out.println("0- Sair");
        int i = 10;
        System.out.println("--------------------------------------------");
        while (i != 0) {
            System.out.println("Informe opção: ");
            i = scanner.nextInt();
            switch (i) {
                case 1: {
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

                }
                case 3: {

                }
                case 4: {
                    Produto.listarProdutos();
                    System.out.println("--------------------------------------------");
                    break;
                }
            }
        }
        scanner.close();
    }
}
