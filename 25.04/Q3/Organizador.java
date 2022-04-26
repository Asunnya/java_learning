
import java.util.Scanner;

public class Organizador {

    public static void criandoEvento() {
        Scanner keyboardStr = new Scanner(System.in);
        int[] dataInicioV; int[] dataFinalV;

        System.out.println("============================== PREENCHENDO AS INFORMACOES PARA O EVENTO DA SEMANA DA COMPUTACAO =============================");

        System.out.println("[DIGITE]: A DATA DE INICIO\tEXEMPLO VALIDO DE ENTRADA: 29/12/2020");
        String dataInicio = keyboardStr.nextLine();
        System.out.println("[DIGITE]: A DATA DE ENCERRAMENTO\tEXEMPLO VALIDO DE ENTRADA: 29/12/2020");
        String dataFinal = keyboardStr.nextLine();
        System.out.println("[DIGITE]: HORARIO INICIO \tEXEMPLO VALIDO DE ENTRADA: 13:15 [FORMATO 24 HORAS]");
        String horarioInicio = keyboardStr.nextLine();
        System.out.println("[DIGITE]: HORARIO FINAL \tEXEMPLO VALIDO DE ENTRADA: 13:15 [FORMATO 24 HORAS]");
        String horarioFinal = keyboardStr.nextLine();

        dataInicioV = Data.quebraData(dataInicio);
        dataFinalV = Data.quebraData(dataFinal);

        Cadastros.cadastroInfomacoesParaOeEvento(dataInicioV[0], dataInicioV[1],dataInicioV[2], horarioInicio, dataFinalV[0], dataFinalV[1], dataFinalV[2], horarioFinal);
    }
    public static boolean criandoPalestra() {

        Scanner keyboardStr = new Scanner(System.in);
        Scanner keyboardInt = new Scanner(System.in);
        String tituloPalestra;
        int[] dataPalestraV;
        System.out.println("============================== PREENCHENDO AS INFORMACOES PARA PALESTRA =============================");

        Palestra palestraExistente;
        do {
            System.out.println("[DIGITE]: O TITULO DA PALESTRA DESEJADA");
             tituloPalestra = keyboardStr.nextLine();

            palestraExistente = Evento.procurarPalestras(tituloPalestra);

            if (palestraExistente != null ) {
                System.out.println("JA EXISTE UMA PALESTRA COM ESSE TITULO, POR FAVOR, ESCOLHA OUTRO");
            }
        }
        while (palestraExistente != null);

        System.out.println("[DIGITE]: O NOME DO PALESTRANTE");
        String nomePalestrante = keyboardStr.nextLine();

        System.out.println("[DIGITE]: O LOCAL DA PALESTRA");
        String local = keyboardStr.nextLine();

        System.out.println("[DIGITE]: A DATA DA PALESTRA\tFORMATO DIA/MES/ANO");
        String dataPalestra = keyboardStr.nextLine();

        System.out.println("[DIGITE]: HORARIO INICIO \tEXEMPLO VALIDO DE ENTRADA: 13:15 [FORMATO 24 HORAS]");
        String horarioInicio = keyboardStr.nextLine();

        System.out.println("[DIGITE]: PRAZO DE DURACAO EM MINUTOS\tEXEMPLO VALIDO DE ENTRADA: 60");
        int duracaoEmMinutos = keyboardInt.nextInt();

        System.out.println("[DIGITE]: NUMERO MAXIMO DE PARTICIPANTES NESSA PALESTRA");
        int numeroMax = keyboardInt.nextInt();

        dataPalestraV = Data.quebraData(dataPalestra);

        //fazer retornar sucess cadastro e tratar, caso ele for verdadeiro, quer dizer que foi possivel cadastrar
        return Cadastros.cadastroDasPalestras(tituloPalestra, nomePalestrante, local, dataPalestraV[0], dataPalestraV[1], horarioInicio, duracaoEmMinutos, numeroMax, dataPalestra);
    }
    public static void criandoParticipante() {
        Scanner keyboardStr = new Scanner(System.in);
        Scanner keyboardInt = new Scanner(System.in);
        System.out.println("============================== ACESSO PARTICIPANTE =============================");

        System.out.println("[DIGITE]: O NOME DO PARTICIPANTE");
        String nome = keyboardStr.nextLine();

        System.out.println("[DIGITE]: NUMERO DE MATRICULA");
        int numeroMatricula = keyboardInt.nextInt();

        System.out.println("[DIGITE]: EMAIL");
        String email = keyboardStr.nextLine(); //Nao a verificacao do email se ta correto ou nao

        Palestra palestraSolicitada;
        boolean palestraEmMaxDeParticipante = true;

        Evento.imprimirTituloEDisponibilidadePalestras();

        do {
            System.out.println("[DIGITE]: O TITULO DA PALESTRA DESEJADA");
            String tituloPalestraDesejada = keyboardStr.nextLine(); //Mostrar as palestras antes

            palestraSolicitada = Evento.procurarPalestras(tituloPalestraDesejada);

            if (palestraSolicitada == null ) {
                System.out.println("A PALESTRA SOLICITADA NAO FOI ENCONTRADA. VERIFIQUE E TENTE NOVAMENTE");
                Evento.imprimirTituloEDisponibilidadePalestras();
            } else {
                if (palestraSolicitada.vagasDisponiveisPalestra() > 0) {
                    palestraEmMaxDeParticipante = false;
                } else {
                    System.out.println("A PALESTRA ATINGIU O NUMERO MAXIMO DE PARTICIPANTE, POR FAVOR, SE INSCREVA EM OUTRA PALESTRA"); //Aqui dava para aproveitar e criar uma lista de palestras com titulos excluidos e faze essa verificacao com base nessa lista
                }
            }
        }
        while (palestraSolicitada == null || palestraEmMaxDeParticipante);
        System.out.println("VOCE FOI INSCRITO NA PALESTRA SOLICITADA!");
        Cadastros.cadastroParticipante(numeroMatricula, nome, email, palestraSolicitada);

    }
}
