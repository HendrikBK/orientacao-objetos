package Universidade.Dados;

import Model.Dependente;

public class Turma {
    private int codigo;
    private Aluno[] aluno = new Aluno[30];
    private Disciplina disciplina;
    private Professor professor;

    public Turma(int codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Aluno[] getAluno(){
        return aluno;
    }

}
