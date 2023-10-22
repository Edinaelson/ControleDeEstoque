import clientes.Fisico;
import produto.Produto;

public class Main {
    public static void main(String[] args) {
        //Cliente c1 = new Cliente("Edinaelson","07403743385");
        //c1.imprimir();
//        Fisico f = new Fisico("Edinaelson","07403743385",1);
//        f.imprimir();
//        f.tipo();

        Produto prod1 = new Produto("Prego",123,10,20.77);
        prod1.imprimir();
        //prod1.editarProd();
        prod1.realizarCompra(11);
        prod1.imprimir();
    }
}