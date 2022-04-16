package Ex2;

import java.util.Scanner;


public class Pessoa {
    private String nome;
    private int idade;
    

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    protected void envelhecer(Pessoa pessoa) {
        System.out.println("MAIS UM ANO SE PASSOU....HAPPY BIRTHDAY!!!");
        pessoa.idade++;
    }

    protected String getNome() {
        return this.nome;
    }

    protected int getIdade() {
        return this.idade;
    }
}
