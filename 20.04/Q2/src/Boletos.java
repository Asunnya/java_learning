import java.util.ArrayList;

public class Boletos {
    private ArrayList<Boleto> listaDeBoletos = new ArrayList<Boleto>();


    public void addBoletos(Boleto boleto) {

        if (!(listaDeBoletos.contains(boleto.getCodigo()))) {
            listaDeBoletos.add(boleto);
        }
    }

    public ArrayList<Boleto> getListaDeBoletos() {
        return this.listaDeBoletos;
    }
}
