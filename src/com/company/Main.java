package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Aluno aluno = new Aluno();
        Disciplina BD = new Disciplina();
        aluno.setName("Mariana");
        aluno.setId(1);
        aluno.nota1 = 3.5;
        aluno.nota2 = 6.5;

        System.out.println("Média do aluno é: "+ aluno.retornaMedia());
        System.out.println("status:"+ aluno.passou());

    }
}
