package clientes;

public class Juridico extends Cliente{
    public Juridico(String nome, String cnpj, double saldo, int tipo) {
        super(nome, cnpj, saldo,tipo);
    }

    @Override
    public void setTipo(int tipo) {
        super.setTipo(tipo);
    }

    @Override
    public int getTipo() {
        setTipo(2);
        return super.getTipo();
    }
}
