package com.company;

import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    List<Aluno> alunos = new ArrayList<Aluno>(10);

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public double mediaTurmaNota1() {
        double mediaNota1 = 0;
        for (Aluno aluno : alunos) mediaNota1 = mediaNota1 + aluno.nota1;
        return mediaNota1;
    }

    public double mediaTurmaNota2() {
        double mediaNota2 = 0;
        for (Aluno aluno : alunos) mediaNota2 = mediaNota2 + aluno.nota2;
        return mediaNota2;
    }

    public void alunoAntesDepois(int posicaoArray) {
        System.out.println(posicaoArray <= 0 ? posicaoArray - 1 : "Não possui");
        System.out.println(posicaoArray >= 10 ? posicaoArray + 1 : "Não possui");
    }
}
