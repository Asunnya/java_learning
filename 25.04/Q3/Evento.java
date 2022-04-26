import java.util.ArrayList;
import java.util.Objects;


public class Evento {
    private static ArrayList<Palestra> palestras = new ArrayList<>();
    private static Data dataInicio;
    private static Data dataFim;
    private static String horarioInicio;
    private static String horarioFim;
    private static final int QUANTIDADE_DE_EVENTOS = 1;

    public static void setEvento(int diaI, int mesI, int anoI, String hInicio, int diaF, int mesF, int anoF, String hFinal) {
        dataInicio = new Data(diaI, mesI, anoI);
        dataFim = new Data(diaF, mesF, anoF);
        horarioFim = hFinal;
        horarioInicio = hInicio;
    }


    public static Data getDataFim() {
        return dataFim;
    }

    public static void addPalestra(Palestra palestra) {
        palestras.add(palestra);
    }

    public static ArrayList<Palestra> getPalestras() {
        return palestras;
    }

    public static int getQuantidadeDeEventos() {
        return QUANTIDADE_DE_EVENTOS;
    }

    public static Palestra procurarPalestras(String titulo) {
        for (int i = 0; i < palestras.size(); i++) {
            if (Objects.equals(palestras.get(i).getTitulo(), titulo)) {
                return palestras.get(i);
            }
        }
        return null;
    }
    //Listar os dados de todas as palestras do evento com os nomes dos seus respectivos
    //participantes
    protected static void imprimirAllInfoPalestras() {
        System.out.println("=================== PALESTRAS EXISTENTES =====================");
        for (int i = 0; i < palestras.size(); i++) {
            System.out.printf("=================== PALESTRA [%d] =====================\n", i+1);
            Palestra palestra = palestras.get(i);
            System.out.println("TITULO: " + palestra.getTitulo());
            System.out.println("NOME DO PALESTRANTE: " + palestra.getNomePalestrante());
            System.out.println("LOCAL: " + palestra.getLocal());
            System.out.println("DATA: " + palestra.getDataString());
            System.out.println("HORARIO: " + palestra.getHorarioInicio());
            System.out.println("=========================================================");
        }
    }
    protected static void imprimirTituloEDisponibilidadePalestras() {
        System.out.println("=================== PALESTRAS EXISTENTES =====================");
        for (int i = 0; i < palestras.size(); i++) {
            System.out.printf("=================== PALESTRA [%d] =====================\n", i+1);
            Palestra palestra = palestras.get(i);
            System.out.println("TITULO: " + palestra.getTitulo());
            System.out.println("VAGAS: " + palestra.vagasDisponiveisPalestra());
            System.out.println("=========================================================");
        }
    }

}
