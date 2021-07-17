public class Baralho {

    int deck = 52;
    private Carta[] cartas = new Carta[deck];
    int cont = 0;

    public Baralho() {

        String[] nomeCartas = { "as", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };
        String[] naipes = { "Espadas", "Copas", "Paus", "Ouros" };

        for (int j = 0; j < naipes.length; j++) {
            for (int i = 0; i < nomeCartas.length; i++) {
                cartas[cont] = new Carta(nomeCartas[i], naipes[j]);
                cont++;
            }

        }
    }

    public void embaralha() {
        for (int i = 0; i < deck; i++) {
            Carta aux = cartas[i];
            int proxCarta = (int) (Math.random() * deck);
            cartas[i] = cartas[proxCarta];
            cartas[proxCarta] = aux;

        }

    }

    public void mostraBaralho() {

        for (int i = 0; i < cartas.length; i++) {
            cartas[i].imprime();

        }
    }
}
