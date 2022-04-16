
package Ex2;

import java.util.Scanner;

/**
 *
 * @author Isadora Rbeiro
 */
public class main {
    public static void main(String[] args) {
        String nome; int idade;
        Scanner keyboardInt = new Scanner(System.in);
        Scanner keyboardStr = new Scanner(System.in);
        
        System.out.println("BEM VINDO A VIDA\n");

        System.out.println("Digite o nome:");
        nome = keyboardStr.nextLine();
        System.out.println("Digite a idade");
        idade = keyboardInt.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);
        main.imprimirPessoa(pessoa);
        
        System.out.println("Quantos anos se passaram?");
        int anos =  keyboardInt.nextInt();
        
        for(int i=0; i < anos; i++) {
            pessoa.envelhecer(pessoa);       
        }   
        
        main.imprimirPessoa(pessoa);
    }

        
    public static void imprimirPessoa(Pessoa pessoa) {
        System.out.println("-------------- PESSOA --------------------");
        System.out.println("Nome: " + pessoa.getNome() );
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
