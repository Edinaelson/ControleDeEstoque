package menu;

import clientes.Cliente;
import clientes.Fisico;
import clientes.Juridico;
import exceptions.ProdInsuficiente;
import produto.Produto;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Produto> produtosComprados = new ArrayList<>();

    public void menu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Cadastrar Cliente");
        System.out.println("3- Listar Clientes");
        System.out.println("4- Listar Produtos");
        System.out.println("5- Ver cliente");
        System.out.println("6- Efetuar compra de produto: ");
        System.out.println("7- Editar Cliente");
        System.out.println("8- Editar Produto");
        System.out.println("9- Excluir Produto");
        System.out.println("10- Excluir Cliente");

        System.out.println("0- Sair");
        int i = 10;
        System.out.println("--------------------------------------------");
        while (i != 0) {
            System.out.println("Informe opção: ");
            i = scanner.nextInt();
            switch (i) {
                case 1: {

                    System.out.println("--------------------------------------------");
                    break;
                }
                case 2: {
                    cadastrarCliente();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 3: {

                    for (int n = 0;n<clientes.size();n++){
                        System.out.println("------------------------------------");
                        System.out.println("Nome: " + clientes.get(n).getNome());
                        System.out.println("Tipo: " + clientes.get(n).getTipo());
                        System.out.println("------------------------------------");
                    }

                    System.out.println("--------------------------------------------");
                    break;
                }
                case 4: {

                    System.out.println("--------------------------------------------");
                    break;
                }
                case 5:{


                    System.out.println("--------------------------------------------");
                    break;
                }
                case 6: {

                    System.out.println("--------------------------------------------");

                    break;
                }
                case 7:{

                    System.out.println("--------------------------------------------");
                    break;
                }
                case 8:{

                    System.out.println("--------------------------------------------");
                    break;
                }
                case 9:{

                    System.out.println("--------------------------------------------");
                    break;
                }
                case 10:{

                    System.out.println("--------------------------------------------");
                    break;
                }
            }
        }
        scanner.close();
    }

    public void cadastrarCliente(){
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
            Fisico fisico = new Fisico(nome,cpf,1,saldo);
            clientes.add(fisico);
        }
        if (tipo == 2) {
            System.out.println("Informe cnpj: ");
            String cnpj = scanner.next();
            System.out.println("Informe saldo: ");
            Double saldo = scanner.nextDouble();
            Juridico juridico = new Juridico(nome, cnpj, 2, saldo);
            clientes.add(juridico);
        }
        System.out.println("Cadastrado com sucesso!");
        //scanner.close();
    }

}
