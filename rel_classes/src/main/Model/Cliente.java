package model;

import model.Dependente;

public class Cliente {

    private String nome;
    private String endereco;
    private Dependente[] dependente = new Dependente[5];

    public Dependente[] getDependente() {
        return dependente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}
