import clientes.Fisico;

public class Main {
    public static void main(String[] args) {
        //Cliente c1 = new Cliente("Edinaelson","07403743385");
        //c1.imprimir();
        Fisico f = new Fisico("Edinaelson","07403743385",1);
        f.imprimir();
        f.tipo();
    }
}