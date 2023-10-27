package produto;

import clientes.Cliente;
import clientes.Fisico;
import clientes.Juridico;
import exceptions.ProdInsuficiente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
    public static String nome;
    public static int codigo;
    public static int quantidade;
    public static double preco;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Produto.nome = nome;
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Produto.codigo = codigo;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Produto.quantidade = quantidade;
    }

    public static double getPreco() {
        return preco;
    }

    public static void setPreco(double preco) {
        Produto.preco = preco;
    }

    public Produto(String nome,int codigo, int quantidade, double preco) {
        setNome(nome);
        setCodigo(codigo);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public void Produto(){

    }

    public void imprimir(){
        System.out.println("------------------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Codigo: " +getCodigo());
        System.out.println("Quantidade " + getQuantidade());
        System.out.println("preco "+ getPreco());
        System.out.println("------------------------------------");
    }

    public void efetuarCompra(int quant) throws Exception{
        System.out.println("quantidade: " + getQuantidade());
        System.out.println("quantidade requisitada: " + quant);

        if(quant > getQuantidade()){
            throw new ProdInsuficiente();
        }
    }

    public void editarProduto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar produto");
        System.out.println("1 - Nome, 2- Codigo, 3- Quantidade, 4- Preço");
        int escolha = scanner.nextInt();
        switch (escolha){
            case 1:{
                System.out.println("Novo Nome");
                String name = scanner.next();
                setNome(name);
                break;
            }
            case 2: {
                System.out.println("Novo Codigo: ");
                int cod = scanner.nextInt();
                setCodigo(cod);
                break;
            }
            case 3: {
                System.out.println("Nova quantidade: ");
                int quant = scanner.nextInt();
                setQuantidade(quant);
                break;
            }
            case 4:{
                System.out.println("Novo Preço");
                double p = scanner.nextDouble();
                setPreco(p);
                break;
            }
        }
        scanner.close();
    }
}
