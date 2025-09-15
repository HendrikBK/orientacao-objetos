package Model;

public class Cliente {

    private String nome;
    private String endereco;
    private final Dependente[] dependente = new Dependente[5];

    public  Cliente(String nome, String endereco) {}

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
