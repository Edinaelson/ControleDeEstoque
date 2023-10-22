package clientes;

public class Cliente {
    public static String nome;
    public static String cnpj;
    public static String cpf;

    public static int tipo; //1 pessoa fisica 2 juridico

    public int getTipo() {
        return tipo;
    }

    public static void setTipo(int tipo) {
        Cliente.tipo = tipo;
    }

    public static void setNome(String nome) {
        Cliente.nome = nome;
    }

    public static void setCnpj(String cnpj) {
        Cliente.cnpj = cnpj;
    }

    public static void setCpf(String cpf) {
        Cliente.cpf = cpf;
    }

    public static String getNome() {
        return nome;
    }

    public static String getCnpj() {
        return cnpj;
    }

    public static String getCpf() {
        return cpf;
    }

    public Cliente(String nome, String cnpj, int tipo) {
        setNome(nome);
        setCnpj(cnpj);
        setTipo(tipo);
    }

    public void Cliente(String nome, String cpf, int tipo){
        setNome(nome);
        setCpf(cpf);
        setTipo(tipo);
    }

    public void imprimir(){
        System.out.println(getNome());
        System.out.println(getCnpj());
        System.out.println(getTipo());
    }

}
