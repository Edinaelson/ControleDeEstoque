package clientes;

public class Juridico extends Cliente{
    public Juridico(String nome, String cnpj, int tipo) {
        super(nome, cnpj, tipo);
    }

    public int tipo(){
        System.out.printf("Pessoa Juridica");
        return 2;
    }

}
