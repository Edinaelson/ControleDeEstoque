package produto;

import clientes.Cliente;
import clientes.Fisico;
import clientes.Juridico;
import exceptions.ProdInsuficiente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
    public String nome;
    public int codigo;
    public int quantidade;
    public double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome,int codigo, int quantidade, double preco) {
        setNome(nome);
        setCodigo(codigo);
        setQuantidade(quantidade);
        setPreco(preco);
    }
    public Produto(){

    }
    public void Produto(){

    }

    public int efetuarCompra(int quant) throws Exception{
        System.out.println("quantidade requisitada: " + quant);
        if(quant > getQuantidade()){
            throw new ProdInsuficiente();
        }
        return 1;
    }

    public static void editarProduto(Produto produto){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar produto");
        System.out.println("1 - Nome, 2- Codigo, 3- Quantidade, 4- Preço");
        int escolha = scanner.nextInt();
        switch (escolha){
            case 1:{
                System.out.println("Novo Nome");
                String name = scanner.next();
                produto.setNome(name);
                break;
            }
            case 2: {
                System.out.println("Novo Codigo: ");
                int cod = scanner.nextInt();
                produto.setCodigo(cod);
                break;
            }
            case 3: {
                System.out.println("Nova quantidade: ");
                int quant = scanner.nextInt();
                produto.setQuantidade(quant);
                break;
            }
            case 4:{
                System.out.println("Novo Preço");
                double p = scanner.nextDouble();
                produto.setPreco(p);
                break;
            }
        }
        //scanner.close();
    }

    /*
    Cadastro de produtos
     */
    public static ArrayList<Produto> produtos = new ArrayList<>();
    public static void cadastrarProduto(Produto produto){
        produtos.add(produto);
    }

    static int i;
    public static void listarProdutos(){
        int n = produtos.size();
        if (n > 0){
            for(i = 0; i < n;i++){
                System.out.println("nome "+ produtos.get(i).getNome()+ ", Preço "+ produtos.get(i).getPreco()+ ", quantidade "+ produtos.get(i).getQuantidade()+", código: "+produtos.get(i).getCodigo());
            }
        }
        if(n == 0){
            System.out.println("Produtos não cadastrados");
        }
    }

    //buscar produto
    public static Produto buscarProduto(int codigoProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoProduto) {
                return produto;
            }
        }
        return null; // Retorna null se o produto não for encontrado.
    }

    //Excluir produto
    public static void excluirProduto(Produto produto){
        produtos.remove(produto);
        System.out.println("Produto removido!");
    }

}
