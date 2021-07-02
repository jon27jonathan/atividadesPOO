public class Carta {
    private String nomeCarta;
    private String naipe;

    public Carta(String nomeCarta, String naipe) {
        this.nomeCarta = nomeCarta;
        this.naipe = naipe;
    }

    public String getnomeCarta() {
        return this.nomeCarta;
    }

    public String getnaipe() {
        return this.naipe;

    }

    public void imprime() {
        System.out.println(this.nomeCarta + " - " + this.naipe);
    }
}