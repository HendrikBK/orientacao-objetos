package Universidade.Dados;

public class Professor {

    private int matricula;
    private String nome;
    private Turma[] turmas = new Turma[5];
    private Curso[] cursos = new Curso[3];

    public Professor(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public Turma[] getTurmas() {
        return turmas;
    }

}
