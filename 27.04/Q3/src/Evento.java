package Q3.src;

import java.util.ArrayList;
import java.util.Objects;


public class Evento {
    private  ArrayList<Palestra> palestras = new ArrayList<>();
    private  Data dataInicio;
    private  Data dataFim;
    private  String horarioInicio;
    private  String horarioFim;
    private static final int QUANTIDADE_DE_EVENTOS = 1;
    private static int quantidadeEventosCriados = 0;
    private static Evento ultimoEventoInstanciado;

    public static Evento getInstanciaEvento(int diaI, int mesI, int anoI, String hInicio, int diaF, int mesF, int anoF, String hFinal) {
        if (quantidadeEventosCriados < QUANTIDADE_DE_EVENTOS) {
            Evento evento = new Evento(diaI, mesI, anoI,  hInicio, diaF,  mesF,  anoF, hFinal);
            ultimoEventoInstanciado = evento;
            return evento;
        }
        return ultimoEventoInstanciado;
    }

    private Evento(int diaI, int mesI, int anoI, String hInicio, int diaF, int mesF, int anoF, String hFinal) {
        this.dataInicio = new Data(diaI, mesI, anoI);
        this.dataFim = new Data(diaF, mesF, anoF);
        this.horarioFim = hFinal;
        this.horarioInicio = hInicio;
        quantidadeEventosCriados++;
    }

    public  Data getDataFim() {
        return dataFim;
    }

    public  void addPalestra(Palestra palestra) {
        palestras.add(palestra);
    }

    public  ArrayList<Palestra> getPalestras() {
        return palestras;
    }

    public  int getQuantidadeDeEventos() {
        return QUANTIDADE_DE_EVENTOS;
    }

    public  Palestra procurarPalestras(String titulo) {
        for (int i = 0; i < palestras.size(); i++) {
            if (Objects.equals(palestras.get(i).getTitulo(), titulo)) {
                return palestras.get(i);
            }
        }
        return null;
    }

    //Listar os dados de todas as palestras do evento com os nomes dos seus respectivos
    //participantes
    protected void imprimirAllInfoPalestras() {
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
    protected  void imprimirTituloEDisponibilidadePalestras() {
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
