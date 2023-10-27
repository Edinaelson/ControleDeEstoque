package clientes;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    public static String cnpj;
    public static String cpf;

    public static int tipo; //1 pessoa fisica 2 juridico

    public int getTipo() {
        return tipo;
    }

    public static void setTipo(int tipo) {
        Cliente.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setCnpj(String cnpj) {
        Cliente.cnpj = cnpj;
    }

    public static void setCpf(String cpf) {
        Cliente.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public static String getCnpj() {
        return cnpj;
    }

    public static String getCpf() {
        return cpf;
    }

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente(String nome, String documento, int tipo) {
        setNome(nome);
        setCnpj(documento);
        setTipo(tipo);
    }

    public static void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    static int i;
    public static void listarClientes(){
        int n = clientes.size();
        if (n > 0){
            for(i = 0; i < n;i++){
                System.out.println("nome: " + clientes.get(i).getNome());
                //System.out.println(i);
                //System.out.println("tipo: " + clientes.get(i).getTipo());
            }
        }
        if(n == 0){
            System.out.println("Clientes não cadastrados");
        }
    }

    //TODO criar algum metodo para identificar usuario se é cpf ou cnpj
    public int identificarDocumento(String documento){
        
        return -1;
    }
}
