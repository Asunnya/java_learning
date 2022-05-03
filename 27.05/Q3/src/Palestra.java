package Q3.src;

import java.util.ArrayList;

public class Palestra {
    private String titulo;
    private String nomePalestrante;
    private String local;
    private Data data;
    private String dataString;
    private String horarioInicio;
    private int prazoDeDuracaoEmMinutos;
    private static final int NUMERO_MAX_PALESTRA = 20;
    private int numeroMaximoParticipantes;
    private int numeroParticipantes;
    private ArrayList<Participante> participantes = new ArrayList<Participante>();

    public Palestra(Evento evento, String titulo, String nomePalestrante, String local, int dia, int mes,  String horarioInicio, int prazoDeDuracaoEmMinutos, int numeroMax, String dataString) {
        this.titulo = titulo;
        this.nomePalestrante = nomePalestrante;
        this.local = local;
        this.data = new Data(dia, mes, evento.getDataFim().getAno());
        this.horarioInicio = horarioInicio;
        this.prazoDeDuracaoEmMinutos = prazoDeDuracaoEmMinutos;
        this.numeroMaximoParticipantes = numeroMax;
        this.dataString = dataString;

    }

    public static int getNumeroMaxPalestra() {
        return NUMERO_MAX_PALESTRA;
    }

    public void addParticipantes(Participante partipante) {
        participantes.add(partipante);
        this.numeroParticipantes++;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getNomePalestrante() {
        return this.nomePalestrante;
    }

    public String getLocal() {
        return this.local;
    }

    public String getHorarioInicio() {
        return this.horarioInicio;
    }

    public int getNumeroMaximoPartipantes() {
        return this.numeroMaximoParticipantes;
    }

    public int getNumeroParticipantes() {
        return this.numeroParticipantes;
    }

    public ArrayList<Participante> getParticipantes() {
        return this.participantes;
    }

    public int vagasDisponiveisPalestra() {
        return this.getNumeroMaximoPartipantes() - this.getNumeroParticipantes();
    }

    public String getDataString() {
        return dataString;
    }
}
