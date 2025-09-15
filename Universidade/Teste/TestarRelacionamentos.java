package Universidade.Teste;

import Universidade.Dados.*;

public class TestarRelacionamentos {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Informática", 10101);
        Professor p1 = new Professor(101101, "Alencar");
        Disciplina disc1 = new Disciplina(51, "Algoritmos", curso1);
        Turma turma1 = new Turma(1, disc1, p1);

        Aluno aluno1 = new Aluno("0001", "Hendrik", "000000000");
        Aluno aluno2 = new Aluno("0002", "Pedro", "000000001");
        Aluno aluno3 = new Aluno("0003", "Maria", "000000002");
        Aluno aluno4 = new Aluno("0004", "João", "000000003");
        Aluno aluno5 = new Aluno("0005", "Júlio", "000000004");

        turma1.getAluno()[0] =  aluno1;
        turma1.getAluno()[1] =  aluno2;
        turma1.getAluno()[2] =  aluno3;
        turma1.getAluno()[3] =  aluno4;
        turma1.getAluno()[4] =  aluno5;

        mostrarAlunos(turma1);

    }

    public static void mostrarAlunos(Turma turma) {
        int i;
        int length = 0;
        for (i = 0; i < turma.getAluno().length; i++) {
            if (turma.getAluno()[i] != null) {
                length++;
            }
        }
        for (i = 0; i < length; i++) {
            System.out.println(turma.getAluno()[i].getNome());
        }
    }

}

