public class Cadastros {

    private static int qtdEventos = 0;
    private static int qtdPalestras = 0;

    protected static void cadastroInfomacoesParaOeEvento(int diaI, int mesI, int anoI, String hInicio, int diaF, int mesF, int anoF, String hFinal) {
        if (qtdEventos < Evento.getQuantidadeDeEventos()) {
            Evento.setEvento(diaI, mesI, anoI, hInicio, diaF, mesF, anoF, hFinal);
            qtdEventos++;
        }
    }

    protected static boolean cadastroDasPalestras(String titulo, String nomePalestrante, String local, int dia, int mes,  String horarioInicio, int prazoDeDuracaoEmMinutos, int numeroMax, String dataString) {
        if (qtdPalestras < Palestra.getNumeroMaxPalestra()) {
            Palestra palestra = new Palestra(titulo, nomePalestrante, local, dia, mes, horarioInicio, prazoDeDuracaoEmMinutos, numeroMax, dataString);
            Evento.addPalestra(palestra);
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
