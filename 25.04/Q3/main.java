import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Organizador.criandoEvento();
        int op;
        do {
            Scanner keyboardInt = new Scanner(System.in);
            Scanner keyboardStr = new Scanner(System.in);
            System.out.println("============================== BEM VINDO A SEMANA A COMPUTACAO DO IC/UFF =============================");
            System.out.println("[0] ADICIONAR PALESTRA\n[1] INSCRICAO DE PARTICIPANTE\n[2] LISTANDO TODAS AS PALESTRAS QUE UM PARTICIPANTE SE INSCREVEU");
            System.out.println("[3] CONSULTAR VAGA EM UMA PALESTRA\n[4] TODAS AS PALESTRAS E SUAS INFORMACOES\n[5] VERIFICANDO SE UM PARTICIPANTE ESTA INSCRITO EM UMA PALESTRA\n[6] SAIR\n");
            op = keyboardInt.nextInt();
            switch (op) {
                case 0:
                    if (Organizador.criandoPalestra()) {
                        System.out.println("CADASTRO DA PALESTRA CONCLUIDO");
                    } else {
                        System.out.println("NAO FOI POSSIVEL CADASTRAR A PALESTRA, NUMERO DE PALESTRAS EXCEDIDO");
                    }
                    break;
                case 1:
                     Organizador.criandoParticipante();
                    break;
                case 2:
                    System.out.println("POR FAVOR, DIGITE SEU NUMERO DE MATRICULA ");
                    int numeroDeMatricula;
                    do {
                        numeroDeMatricula = keyboardInt.nextInt();
                    } while (numeroDeMatricula < 0);
                    menu.listandoParticipanteNaPalestra(numeroDeMatricula);
                    break;
                case 3:
                    Palestra palestraSolicitada;
                    do {
                        System.out.println("POR FAVOR, A PALESTRA QUE DESEJA CONSULTAR A VAGA ");
                        String palestraNome = keyboardStr.nextLine();
                        palestraSolicitada = Evento.procurarPalestras(palestraNome);

                        if (palestraSolicitada == null) {
                            System.out.println("A PALESTRA SOLICITADA NAO FOI ENCONTRADA, VERIFIQUE O TITULO E TENTE NOVAMENTE ");
                        }

                    } while (palestraSolicitada == null);

                    System.out.printf("EXISTE %d VAGAS PARA A PALESTRA COM TITULO %s\n", palestraSolicitada.vagasDisponiveisPalestra(), palestraSolicitada.getTitulo());
                    break;
                case 4:
                    Evento.imprimirAllInfoPalestras();
                    break;
                case 5:
                    System.out.println("POR FAVOR, DIGITE SEU NUMERO DE MATRICULA ");
                    int numeroDeMatriculaA = 0;
                    do {
                        numeroDeMatriculaA = keyboardInt.nextInt();
                    } while (numeroDeMatriculaA < 0);

                    Palestra palestraDesejada;
                    do {
                        System.out.println("POR FAVOR, DIGITE O TITULO DA PALESTRA QUE DESEJA VERIFICAR A INSCRICAO");
                        String palestraNome = keyboardStr.nextLine();
                        palestraDesejada = Evento.procurarPalestras(palestraNome);

                        if (palestraDesejada == null) {
                            System.out.println("O TITULO DA PALESTRA INSERIDO NAO FOI ENCONTRADO, VERIFIQUE O TITULO E TENTE NOVAMENTE ");
                        }

                    } while (palestraDesejada == null);

                    if (menu.isParticipanteInscritoEmPalestra(palestraDesejada.getTitulo(), numeroDeMatriculaA)) {
                        System.out.println("O PARTICIPANTE ESTA INSCRITO NA PALESTRA");
                    } else {
                        System.out.println("O PARTICIPANTE NAO ESTA INSCRITO NA PALESTRA");
                    }

                    break;
                case 6:
                    System.out.println("PROGRAMA FINALIZADO");
                    break;

            }

        } while (op != 6);

    }
}
