<<<<<<< HEAD
import br.com.caelum.stella.tinytype.CPF;
import exceptions.ProdInsuficiente;
import produto.Produto;
import utils.ValidarCPF;
=======
import clientes.Cliente;
>>>>>>> 4cefb6b648340cd3c5afa0f1d7e5f0fde96f1fe3

public class Main {
    public static void main(String[] args) throws Exception{
        Cliente c1 = new Cliente("Edinaelson","07403743385",1);
        Cliente c2 = new Cliente("Fabricio","07403743385",2);
        Cliente c3 = new Cliente("Ana","2303743385",2);
        //Cliente c4 = new Cliente("Edi","07403744385",2);

        Cliente.cadastrarCliente(c1);
        Cliente.cadastrarCliente(c2);
        Cliente.cadastrarCliente(c3);
        //Cliente.cadastrar(c4);

        Cliente.listarClientes();
        //c1.imprimir();
//        Fisico f = new Fisico("Edinaelson","07403743385",1);
//        f.imprimir();
//        f.tipo();

//        Produto prod1 = new Produto("Prego",123,10,20.77);
//        prod1.imprimir();
<<<<<<< HEAD
        //prod1.editarProd();
//        try {
//            prod1.efetuarCompra(9);
=======
//        //prod1.editarProd();
//        try {
//            prod1.efetuarCompra(11);
>>>>>>> 4cefb6b648340cd3c5afa0f1d7e5f0fde96f1fe3
//        }catch (ProdInsuficiente e){
//            System.out.println(e.getMessage());
//            System.out.println("-----------------------");
//        }
<<<<<<< HEAD
//        prod1.editarProduto();
//
//        prod1.imprimir();

//        CPF validar = new CPF("61465581334");
//        System.out.println("Valido: " + validar.isValido());
        ValidarCPF v = new ValidarCPF();
        v.validarCPF("07403743384");
=======
//
//        prod1.imprimir();
>>>>>>> 4cefb6b648340cd3c5afa0f1d7e5f0fde96f1fe3

    }
}