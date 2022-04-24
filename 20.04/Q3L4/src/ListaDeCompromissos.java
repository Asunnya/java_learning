import java.util.ArrayList;

public class ListaDeCompromissos {
    private ArrayList<Compromisso> listaC = new ArrayList<Compromisso>();
    private int idList;

    public ListaDeCompromissos(int idList) {
        this.idList = idList;
    }

    public void addCompromissoInList(Compromisso compromisso) {
        if (!listaC.contains(compromisso.getTitulo())) {
            listaC.add(compromisso);
        }
    }

    public ArrayList<Compromisso> getListaC() {
        return this.listaC;
    }
}
