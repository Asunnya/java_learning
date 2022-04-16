package Ex8;

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

            preencherMensagens( keyboardStr, samsung);
        }
        System.out.println("[LIGACOES] [DIGITE A QUANTIDADE DE LIGACOES]");

        int nL = keyboardInt.nextInt();

        for (int i=0; i < nL; i++) {

            preencherLigacao( keyboardStr, keyboardInt,samsung);
        }
        samsung.visualizarCelular(samsung);
    }
    public static void preencherMensagens(Scanner keyboardStr, Celular celular) {
        String texto; String contato;
        System.out.println("[MENSAGEM]: DIGITE A MENSAGEM");
        texto = keyboardStr.nextLine();
        System.out.println("[MENSAGEM]: DIGITE O CONTATO");
        contato  = keyboardStr.nextLine();

        Mensagem mensagem = new Mensagem(texto, contato);
        celular.enviarMensagem(mensagem, celular);
    }
    public static void preencherLigacao( Scanner keyboardStr, Scanner keyboardInt ,Celular celular) {
        int tM; String contato;
        System.out.println("[LIGACAO]: DIGITE O TEMPO DE LIGACAO EM MINUTOS");
        tM = keyboardInt.nextInt();
        System.out.println("[LIGACAO]: DIGITE O CONTATO");
        contato  = keyboardStr.nextLine();

        Ligacao ligacao = new Ligacao(tM, contato);
        celular.ligar(ligacao, celular);
    }
}
