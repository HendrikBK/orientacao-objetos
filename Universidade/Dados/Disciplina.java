package Universidade.Dados;

public class Disciplina {
    private int codigo;
    private String nome;
    private Turma[] turmas = new Turma[5];
    private Curso curso;

    public Disciplina(int codigo, String nome, Curso curso) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
    }

    public Turma[] getTurmas() {
        return turmas;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }
}
