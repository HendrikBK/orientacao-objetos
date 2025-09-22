package Universidade.Dados;

public class Aluno {
    private String matricula;
    private String nome;
    private String cpf;
    private Turma[] turmas = new Turma[5];

    public Aluno(String matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Turma[] getTurmas() {
        return turmas;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCPF() {
        return cpfs;
    }
}
