package Universidade.Dados;

public class Curso {
    private String nome;
    private int codigo;
    private Disciplina[] disciplina = new Disciplina[10];
    private Professor[] professor = new Professor[10];

    public Curso(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Disciplina[] getDisciplina() {
        return disciplina;
    }

    public Professor[] getProfessor() {
        return professor;
    }
}
