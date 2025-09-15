package Model;

import Model.Conta;

public class Banco {

    private int codigo;
    private String nome;
    private Conta conta;

    public Banco(int codigo, String nome, Conta conta) {
        System.out.println("Método construtor da classe Banco...");
        this.codigo = codigo;
        this.nome = nome;
        this.conta = conta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
