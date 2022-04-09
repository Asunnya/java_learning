package Ex4;

public class Casa {
    String cor = "Sem cor";
    Porta[] portas = new Porta[3];
    int qtdePortas = 0;

    public void addPortas(Porta porta) {
        porta.id = qtdePortas + 1;
        porta.cor = "Sem cor";
        portas[qtdePortas] = porta;
        qtdePortas++;
    }
    public void pintandoCasa(Casa casa, String cor) {
        System.out.println("Cor anterior: "+ casa.cor);
        casa.cor = cor;
        System.out.println("Cor nova: "+ casa.cor);
    }
    public int quantasPortasEstaoAbertas() {
        int portasAbertas = 0;
        for (int i=0; i < qtdePortas; i++) {
            if (portas[i].isPortaOpen) {
                portasAbertas++;
            }
        }
        return portasAbertas;
    }
    public void imprimindoPortas(Casa casa) {
        System.out.println("-------------- CASA --------------------");
        System.out.println("Cor da casa: " + casa.cor);
        for (int i = 0; i < qtdePortas; i++) {
            System.out.println("-------------- PORTAS --------------------");
            System.out.println("ID: " + portas[i].id );
            System.out.println("cor: " + portas[i].cor);
            if (portas[i].isPortaOpen) {
                System.out.println("Porta aberta!");
            } else {
                System.out.println("Porta fechada!");
            }
        }
    }
}
