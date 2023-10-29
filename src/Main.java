
import br.com.caelum.stella.tinytype.CPF;
import clientes.Fisico;
import exceptions.ProdInsuficiente;
import produto.Produto;
import utils.ValidarCPF;

import clientes.Cliente;


public class Main {
    public static void main(String[] args) throws Exception{
        Cliente c1 = new Cliente("Edinaelson","07403743385",2,1500);
        Cliente c2 = new Cliente("Fabricio","07403743383",2,1500);
        Cliente c3 = new Cliente("Ana","2303743385",2,1500);
        //Cliente c4 = new Cliente("Edi","07403744385",2);

        Fisico f1 = new Fisico("Ana Carolina","07403743385",1,1000);

        Cliente.cadastrarCliente(c1);
        Cliente.cadastrarCliente(c2);
        Cliente.cadastrarCliente(c3);
        Cliente.cadastrarCliente(f1);

        Cliente.listarClientes();


        //Testar cadastro de produto
        Produto prod1 = new Produto("Prego",123,10,20.77);
        f1.cadastrarProdutosComprados(prod1.getNome());
        f1.listarProdutos();

        //Cliente.cadastrar(c4);

        //TODO criar foreach para listar os clientes com numeração.
//        Cliente.listarClientes();
//        Cliente.excluirCliente(c1);
        System.out.println("Saldo: " + c2.getSaldo());
        //c1.imprimir();
//        Fisico f = new Fisico("Edinaelson","07403743385",1);
//        f.imprimir();
//        f.tipo();

//        Produto prod1 = new Produto("Prego",123,10,20.77);
//        prod1.imprimir();

        //prod1.editarProd();
//        try {
//            prod1.efetuarCompra(9);

//        //prod1.editarProd();
//        try {
//            prod1.efetuarCompra(11);

//        }catch (ProdInsuficiente e){
//            System.out.println(e.getMessage());
//            System.out.println("-----------------------");
//        }

//        prod1.editarProduto();
//
//        prod1.imprimir();

//        CPF validar = new CPF("61465581334");
//        System.out.println("Valido: " + validar.isValido());
//        ValidarCPF v = new ValidarCPF();
//        v.validarCPF("07403743384");
        //Cliente.identificarDocumento(f1.getTipo());
        //System.out.println("Tipo: " + f1.getTipo());

//
//        prod1.imprimir();


    }
}