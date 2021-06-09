package com.company;

public class Aluno {
    private String name;
    private int id;
    private double media;
    protected double nota1, nota2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private double calculaMedia(){
        return this.media = ((nota1 + nota2)/2);
    }

    public double retornaMedia(){
        return calculaMedia();
    }

    public boolean passou(){
        return retornaMedia() >=7;
    }

}
