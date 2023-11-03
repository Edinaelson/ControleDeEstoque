package menu;

import clientes.Cliente;
import clientes.Fisico;
import clientes.Juridico;
import exceptions.ProdInsuficiente;
import produto.Produto;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Menu {
    public static void menu() throws Exception {
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
                    System.out.println("Cadastrar cliente");
                    System.out.println("Informe nome: ");
                    String nome = scanner.next();
                    System.out.println("Informe documento(CNPJ ou CPF):");
                    String documento = scanner.next();
                    // colocar 1000 para cpf ou 1500 para CNPJ
                    System.out.println("Informe saldo do cliente: ");
                    double saldo = scanner.nextDouble();
                    int tipo;// 1 CPF/ 2 CNPJ
                    if (documento.length() > 11) {
                        tipo = 2;
                        Juridico juridico = new Juridico(nome, documento, tipo, saldo);
                        Cliente.cadastrarCliente(juridico);
                    }
                    if (documento.length() <= 11) {
                        tipo = 1;
                        Fisico fisico = new Fisico(nome, documento, tipo, saldo);
                        Cliente.cadastrarCliente(fisico);
                    }

                    System.out.println("--------------------------------------------");
                    break;
                }
                case 3: {
                    System.out.println("Listar Clientes");
                    Cliente.listarClientes();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 4: {
                    System.out.println("Listar Produtos");
                    Produto.listarProdutos();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 5:{
                    System.out.println("Ver cliente: ");
                    System.out.println("Informe o documento do cliente: ");
                    String documento = scanner.next();
                    Cliente cliente = Cliente.cliente(documento);

                    if (cliente == null) {
                        System.out.println("Cliente não encontrado.");
                        break;
                    }

                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("Saldo: " + cliente.getSaldo());
                    System.out.print("Tipo: ");
                    Cliente.identificarDocumento(cliente.getTipo());
                    System.out.println("Itens comprados: ");
                    cliente.listarProdutos();
//                    for (String produtoComprado : cliente.produtos) {
//                        System.out.println(produtoComprado);
//                    }

                    System.out.println("--------------------------------------------");
                    break;
                }
                case 6: {
                    System.out.println("Efetuar compra: ");
                    Cliente.listarClientes();
                    Produto.listarProdutos();
                    System.out.println("Informe documento do cliente: ");
                    String documento = scanner.next();
                    Cliente cliente = Cliente.cliente(documento);

                    if (cliente == null) {
                        System.out.println("Cliente não encontrado.");
                        break;
                    }

                    System.out.println("Informe o código do produto: ");
                    int codigoProduto = scanner.nextInt();
                    Produto produto = Produto.buscarProduto(codigoProduto);

                    if (produto == null) {
                        System.out.println("Produto não encontrado.");
                        break;
                    }

                    System.out.println("Informe a quantidade desejada: ");
                    int quant = scanner.nextInt();

                    try {
                        if (produto.efetuarCompra(quant) == 1) {
                            if (cliente.comprarProduto(quant, produto.getPreco(), produto) == 1) {
                                System.out.println("Compra efetuada com sucesso.");
                                System.out.println("Novo saldo do cliente: " + cliente.getSaldo());
                                cliente.cadastrarProdutosComprados(produto.getNome());
                                //Produto.listarProdutos(); // Mostrar a lista de produtos após a compra.
                            }
                        }
                    } catch (ProdInsuficiente e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("--------------------------------------------");

                    break;
                }
            }
        }
        scanner.close();
    }

}
