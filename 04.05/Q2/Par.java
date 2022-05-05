package Q2;

public class Par <F, S> {
   private F primeiroElementoPar;
   private S segundoElementoPar;

    public F getPrimeiroElementoPar() {
        return this.primeiroElementoPar;
    }

    public S getSegundoElementoPar() {
        return this.segundoElementoPar;
    }

    public void setPrimeiroElementoPar(F primeiroElementoPar) {
        this.primeiroElementoPar = primeiroElementoPar;
    }

    public void setSegundoElementoPar(S segundoElementoPar) {
        this.segundoElementoPar = segundoElementoPar;
    }

}
