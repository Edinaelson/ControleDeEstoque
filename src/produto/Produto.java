package produto;

import exceptions.ProdInsuficiente;

public class Produto {
    public String nome; public int codigo; public int quantidade; public double preco;

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

}
