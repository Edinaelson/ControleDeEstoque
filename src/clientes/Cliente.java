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
    public String getNome() {
        return nome;
    }

    public Cliente(String nome, String documento, double saldo,int tipo) {
        setNome(nome);
        setCnpj(documento);
        setSaldo(saldo);
        setTipo(tipo);
    }

    public static int identificarDocumento(int documento){
        if (documento == 1){
            System.out.println("\u001B[32m|\u001B[0m\u001b[34mPessoa Fisica\u001b[m");
            System.out.println("\u001B[32m|\u001B[0m--------------------------------------------------------\u001B[32m|\u001B[0m");
            return 1;
        }
        if(documento == 2){
            System.out.println("\u001B[32m|\u001B[0m\u001b[34mPessoa Juridica\u001b[m");
            System.out.println("\u001B[32m|\u001B[0m--------------------------------------------------------\u001B[32m|\u001B[0m");
            return 2;
        }
        return -1;
    }

    //comprar produto
    public int comprarProduto(int quant, double valor,Produto produto){
        setSaldo(getSaldo() - (valor * quant));
        System.out.println("Novo valor: " + getSaldo());
        produto.setQuantidade(produto.getQuantidade() - quant);
        return 1;
    }

    public  void editarCliente(Cliente cliente) {
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
}
