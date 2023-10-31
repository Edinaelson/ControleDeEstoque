package clientes;

import produto.Produto;

import java.util.ArrayList;

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
        System.out.println("Produtos adquiridos");
        if (n > 0){
            for(i = 0; i < n;i++){
                System.out.println(i + " Nome: " + produtos.get(i));
            }
        }
        if(n == 0){
            System.out.println("Produtos não cadastrados");
        }
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
                //System.out.println("nome: " + clientes.get(i).getNome() +  "Tipo: " + clientes.get(i).getTipo());
                if (clientes.get(i).getTipo() == 1){
                    System.out.print(i + " Nome: " + clientes.get(i).getNome());
                    System.out.println(": Física ");
                }
                if (clientes.get(i).getTipo() == 2){
                    System.out.print(i + " Nome: " + clientes.get(i).getNome());
                    System.out.println(": Júridica ");
                }
            }
        }
        if(n == 0){
            System.out.println("Clientes não cadastrados");
        }
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
    //TODO bug comprar produto metodo static resolver para ficar como codigo de instancia
    public int comprarProduto(int quant, double valor,Produto produto){
        setSaldo(getSaldo() - (valor * quant));
        System.out.println("Novo valor: " + getSaldo());
        produto.setQuantidade(produto.getQuantidade() - quant);
        return 1;
    }
}
