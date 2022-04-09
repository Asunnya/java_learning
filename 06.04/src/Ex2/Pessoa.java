package Ex2;

import java.util.Scanner;


public class Pessoa {
    String nome;
    int idade;
    
    
    public void envelhecer(Pessoa pessoa) {
        System.out.println("MAIS UM ANO SE PASSOU....HAPPY BIRTHDAY!!!");
        pessoa.idade++;
    }
    public void gerarPessoa(Pessoa pessoa, Scanner keyboard, int n) {
        for (int i = 0; i < n; i++) {
            keyboard.nextLine();
            System.out.println("Digite o nome:");
            nome = keyboard.nextLine();
            System.out.println("Digite a idade");
            idade = keyboard.nextInt();
        }
        
        pessoa.idade = idade;
        pessoa.nome = nome;
  
    }
}
