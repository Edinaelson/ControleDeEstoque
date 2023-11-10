package clientes;

public class Fisico extends Cliente{
    public Fisico(String nome, String cpf, double saldo,int tipo) {
        super(nome, cpf, saldo,tipo);
    }

    @Override
    public void setTipo(int tipo) {
        super.setTipo(tipo);
    }

    @Override
    public int getTipo() {
        setTipo(1);
        return super.getTipo();
    }
}
