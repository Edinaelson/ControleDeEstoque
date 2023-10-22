import exceptions.ProdInsuficiente;
import produto.Produto;

public class Main {
    public static void main(String[] args) throws Exception{
        //Cliente c1 = new Cliente("Edinaelson","07403743385");
        //c1.imprimir();
//        Fisico f = new Fisico("Edinaelson","07403743385",1);
//        f.imprimir();
//        f.tipo();

        Produto prod1 = new Produto("Prego",123,10,20.77);
        prod1.imprimir();
        //prod1.editarProd();
        try {
            prod1.efetuarCompra(11);
        }catch (ProdInsuficiente e){
            System.out.println(e.getMessage());
            System.out.println("-----------------------");
        }

        prod1.imprimir();
    }
}