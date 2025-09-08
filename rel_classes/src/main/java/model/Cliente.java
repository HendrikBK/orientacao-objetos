package model;

public class Cliente {

    private String nome;

    private String endereco;

    public Dependente[] dependente = new Dependente[10];

    public Dependente[] getDependente() {
        return dependente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
