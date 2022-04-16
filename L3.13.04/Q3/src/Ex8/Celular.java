package Ex8;
/*
 * Faça uma classe celular em que cada celular contém uma bateria, cada bateria é caracterizada pela capacidade de carga (medida em unidades u inteiras) e pelo nível de carga.
 * Com o seu celular você pode enviar mensagens de texto e fazer ligações mas, obviamente, ambas as funções afetam o nível da bateria: uma mensagem de texto consome uma unidade de carga e uma chamada consome uma unidade de carga a cada 5 segundos.
 * Também é possível saber o nível de carga do celular.
 * Implemente as classes com todos os métodos que julgar apropriados para simular objetos reais e, em seguida, instancie os objetos e faça alguns testes.
 * */

public class Celular {
    private int capacidadeBateria = 100;
    private int nivelBateria = 43;
    private int qtdMensagensTotais = 0;
    private int qtdLigacoesTotais = 0;

    private Mensagem[] mensagens =  new Mensagem[100];
    private Ligacao[] ligacoes = new Ligacao[100];

    public void enviarMensagem(Mensagem mensagem, Celular celular) {
        mensagens[qtdMensagensTotais] = mensagem;
        qtdMensagensTotais++;
        if (celular.nivelBateria > 0) {
            celular.nivelBateria--;
        }
    }
    public void ligar(Ligacao ligacao, Celular celular) {
        ligacoes[qtdLigacoesTotais] = ligacao;
        qtdLigacoesTotais++;
        celular.nivelBateria -= 1 * ligacao.getTempoEmMinutos()/0.083333;
        if (celular.nivelBateria < 0) {
            celular.nivelBateria = 0;
        }
    }

    void visualizarCelular(Celular celular) {
        System.out.println("-------------- CELULAR --------------------");
        System.out.println("BATERIA: " + celular.nivelBateria);
        System.out.println("QUANTIDADE DE MENSAGENS ENVIADAS: " + celular.qtdMensagensTotais);
        System.out.println("QUANTIDADE DE LIGACOES FEITAS: " + celular.qtdLigacoesTotais);
    }

}
