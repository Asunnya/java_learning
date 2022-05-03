package Q3.src;

public class Cadastros {

    private static int qtdPalestras = 0;

    protected static Evento cadastroInfomacoesParaOeEvento(int diaI, int mesI, int anoI, String hInicio, int diaF, int mesF, int anoF, String hFinal) {
        Evento evento = Evento.getInstanciaEvento(diaI, mesI, anoI, hInicio, diaF, mesF, anoF, hFinal);
        return evento;
    }

    protected static boolean cadastroDasPalestras(Evento evento, String titulo, String nomePalestrante, String local, int dia, int mes,  String horarioInicio, int prazoDeDuracaoEmMinutos, int numeroMax, String dataString) {
        if (qtdPalestras < Palestra.getNumeroMaxPalestra()) {
            Palestra palestra = new Palestra(evento, titulo, nomePalestrante, local, dia, mes, horarioInicio, prazoDeDuracaoEmMinutos, numeroMax, dataString);
            evento.addPalestra(palestra);
            qtdPalestras++;
            return true;
        }
        return false;
    }

    protected static void cadastroParticipante(int numeroMatricula, String nome, String email, Palestra palestraSolicitada) {

        Participante participante = new Participante(numeroMatricula, nome, email);
        palestraSolicitada.addParticipantes(participante);

    }


}
