package clientes;
import produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private  int tipo; //1 pessoa fisica 2 juridico
    private String documento;
    private double saldo;
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public  void setDocumento(String documento) {
        this.documento = documento;
    }

    public Cliente(String nome, String documento, double saldo,int tipo) {
        setNome(nome);
        setDocumento(documento);
        setSaldo(saldo);
        setTipo(tipo);
    }

    public static int identificarDocumento(int documento){
        if (documento == 1){
            System.out.println("\u001B[32m|\u001B[0m\u001b[34mPessoa Fisica\u001b[m");
            System.out.println("\u001B[32m|\u001B[0m--------------------------------------------------------\u001B[32m|\u001B[0m");
            return 1;
        }
        if(documento == 2){
            System.out.println("\u001B[32m|\u001B[0m\u001b[34mPessoa Juridica\u001b[m");
            System.out.println("\u001B[32m|\u001B[0m--------------------------------------------------------\u001B[32m|\u001B[0m");
            return 2;
        }
        return -1;
    }
}
