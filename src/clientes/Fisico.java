package clientes;

public class Fisico extends Cliente{
    public Fisico(String nome, String cpf, int tipo) {
        super(nome, cpf, tipo);
    }

    public int tipo(){
        System.out.printf("Pessoa fisica");
        return 1;
    }

}
