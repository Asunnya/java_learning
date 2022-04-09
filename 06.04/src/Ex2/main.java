
package Ex2;

import java.util.Scanner;

/**
 *
 * @author Isadora Rbeiro
 */
public class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        System.out.println("BEM VINDO A VIDA\n");
        int n = 1;//keyboard.nextInt();
        pessoa.gerarPessoa(pessoa, keyboard, 1);
        main.imprimirPessoas(pessoa, n);
        
        System.out.println("Quantos anos se passaram?");
        int anos =  keyboard.nextInt();
        
        for(int i=0; i < anos; i++) {
            pessoa.envelhecer(pessoa);       
        }   
        
        main.imprimirPessoas(pessoa, n);
    }

        
    public static void imprimirPessoas(Pessoa pessoa, int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("-------------- PESSOA --------------------"); 
            System.out.println("Nome: " + pessoa.nome );
            System.out.println("Idade: " + pessoa.idade);
        }
    }
}
