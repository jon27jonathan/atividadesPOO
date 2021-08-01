public class Par<F, S> {
    private F primeiroElemento;
    private S segundoElemento;

    public Par(F a, S b) {
        this.primeiroElemento = a;
        this.segundoElemento = b;
    }

    public void setPrimeiroElemento(F a) {
        this.primeiroElemento = a;

    }

    public void setSegundoElemento(S b) {
        this.segundoElemento = b;

    }

    public F getPrimeiroElemento() {
        return primeiroElemento;
    }

    public S getSegundoElemento() {
        return segundoElemento;
    }

}
