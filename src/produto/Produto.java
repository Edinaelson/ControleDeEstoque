package produto;

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

    public Produto() {
    }
}
