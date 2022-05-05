package Q2;

public class main {
    public static void main(String[] args) {
        Par<String, String> par = new Par<String, String>();

        par.setPrimeiroElementoPar("String");
        par.setSegundoElementoPar("2 String");

        Par<String, Integer> par2 = new Par<String, Integer>();

        par2.setPrimeiroElementoPar("String");
        par2.setSegundoElementoPar(29);

        System.out.println("OBJ Par 1, 1 Elemento: " + par.getPrimeiroElementoPar());
        System.out.println("OBJ Par 1, 2 Elemento: " + par.getSegundoElementoPar());

        System.out.println("OBJ Par 2, 1 Elemento: " + par2.getPrimeiroElementoPar());
        System.out.println("OBJ Par 2, 2 Elemento: " + par2.getSegundoElementoPar());
    }

}
