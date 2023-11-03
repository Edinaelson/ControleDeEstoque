package clientes;

import produto.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nome;
    public String cnpj;
    public String cpf;

    public double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public  int tipo; //1 pessoa fisica 2 juridico

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    //Listas
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<String> produtos = new ArrayList<>();

    public void cadastrarProdutosComprados(String prod){
        produtos.add(prod);
    }

    int x;
    public void listarProdutos(){
        int n = produtos.size();
        if (n > 0){
            for(i = 0; i < n;i++){
                System.out.println(i + " Nome: " + produtos.get(i));
            }
        }
        if(n == 0){
            System.out.println("Produtos não cadastrados");
        }
    }

    public void Cliente(){

    }

    public Cliente(String nome, String documento, int tipo, double saldo) {
        setNome(nome);
        setCnpj(documento);
        setTipo(tipo);
        setSaldo(saldo);
    }

    public static void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public static void excluirCliente(Cliente cliente){
        clientes.remove(cliente);
    }
    
    static int i;
    public static void listarClientes(){
        int n = clientes.size();
        if (n > 0){
            for(i = 0; i < n;i++){
                if (clientes.get(i).getTipo() == 1){
                    System.out.print(i + " Nome: " + clientes.get(i).getNome());
                    System.out.println(":Pessoa Física ");
                }
                if (clientes.get(i).getTipo() == 2){
                    System.out.print(i + " Nome: " + clientes.get(i).getNome());
                    System.out.println(":Pessoa Júridico ");
                }
            }
        }
        if(n == 0){
            System.out.println("Clientes não cadastrados");
        }
    }

    static int y;
    public static Cliente cliente(String documento){
        int n = clientes.size();
        for (int x = 0;y <n; y++){
            if (documento.equals(clientes.get(x).cnpj)){
                return clientes.get(x);
            }
        }
        return null;
    }

    public static void identificarDocumento(int documento){
        if(documento == 2){
            System.out.println("Pessoa Juridica");
        }
        if (documento == 1){
            System.out.println("Pessoa Física");
        }
    }

    //comprar produto
    public int comprarProduto(int quant, double valor,Produto produto){
        setSaldo(getSaldo() - (valor * quant));
        System.out.println("Novo valor: " + getSaldo());
        produto.setQuantidade(produto.getQuantidade() - quant);
        return 1;
    }

    public static void editarCliente(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar Cliente");
        System.out.println("1 - Editar Nome");
        System.out.println("2 - Editar Saldo");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1: {
                System.out.println("Novo Nome: ");
                String novoNome = scanner.next();
                cliente.setNome(novoNome);
                System.out.println("Nome editado com sucesso.");
                break;
            }
            case 2: {
                System.out.println("Novo Saldo: ");
                double novoSaldo = scanner.nextDouble();
                cliente.setSaldo(novoSaldo);
                System.out.println("Saldo editado com sucesso.");
                break;
            }

            default: {
                System.out.println("Opção inválida.");
                break;
            }
        }

        //scanner.close();
    }

    //remover cliente
    public static void removerCliente(Cliente cliente){
        clientes.remove(cliente);
        System.out.println("Cliente removido com sucesso!");
    }

}
