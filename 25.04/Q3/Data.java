public class Data {

    private int dia;
    private int mes;
    private int ano;


    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public static int[] quebraData(String data) {
        String[] vetorData;
        int[] vetorDataInt = new int[3];
        vetorData = data.split("/");

        for (int i = 0; i < 3; i++) {
            vetorDataInt[i] = Integer.parseInt(vetorData[i]);
        }
        return vetorDataInt;
    }

    public int getAno() {
        return this.ano;
    }

}
