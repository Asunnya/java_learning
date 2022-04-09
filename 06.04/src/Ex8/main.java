package Ex8;

import Ex7.Produto;
import Ex7.Supermercado;

import java.util.Scanner;

/*
* Faça uma classe celular em que cada celular contém uma bateria, cada bateria é caracterizada pela capacidade de carga (medida em unidades u inteiras) e pelo nível de carga.
* Com o seu celular você pode enviar mensagens de texto e fazer ligações mas, obviamente, ambas as funções afetam o nível da bateria: uma mensagem de texto consome uma unidade de carga e uma chamada consome uma unidade de carga a cada 5 segundos.
* Também é possível saber o nível de carga do celular.
* Implemente as classes com todos os métodos que julgar apropriados para simular objetos reais e, em seguida, instancie os objetos e faça alguns testes.
* */
public class main {
    public static void main(String[] args) {
        Celular samsung = new Celular();
        Scanner keyboardInt = new Scanner(System.in);
        Scanner keyboardStr = new Scanner(System.in);

        samsung.visualizarCelular(samsung);
        System.out.println("[MENSAGENS] [DIGITE A QUANTIDADE DE MENSAGENS]");
        int nM = keyboardInt.nextInt();

        for (int i=0; i < nM; i++) {
            Mensagem mensagem = new Mensagem();
            preencherMensagens(mensagem, keyboardStr, samsung);
        }
        System.out.println("[LIGACOES] [DIGITE A QUANTIDADE DE LIGACOES]");

        int nL = keyboardInt.nextInt();

        for (int i=0; i < nL; i++) {
            Ligacao ligacao = new Ligacao();
            preencherLigacao(ligacao, keyboardStr, keyboardInt,samsung);
        }
        samsung.visualizarCelular(samsung);
    }
    public static void preencherMensagens(Mensagem mensagem, Scanner keyboardStr, Celular celular) {
        System.out.println("[MENSAGEM]: DIGITE A MENSAGEM");
        mensagem.texto = keyboardStr.nextLine();
        System.out.println("[MENSAGEM]: DIGITE O CONTATO");
        mensagem.contato  = keyboardStr.nextLine();
        celular.enviarMensagem(mensagem, celular);
    }
    public static void preencherLigacao(Ligacao ligacao, Scanner keyboardStr, Scanner keyboardInt ,Celular celular) {
        System.out.println("[LIGACAO]: DIGITE O TEMPO DE LIGACAO EM MINUTOS");
        ligacao.tempoEmMinutos = keyboardInt.nextInt();
        System.out.println("[LIGACAO]: DIGITE O CONTATO");
        ligacao.contato  = keyboardStr.nextLine();
        celular.ligar(ligacao, celular);
    }
}
