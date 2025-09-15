package Universidade.Dados;

public class Aluno {
    private String matricula;



    private String nome;
    private String cpf;
    private Professor[] professores = new Professor[5];
    private Turma[] turmas = new Turma[5];

    public Aluno(String matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public Turma[] getTurmas() {
        return turmas;
    }

    public String getNome() {
        return nome;
    }
}
