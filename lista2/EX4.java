public class EX4 {
    public static void main(String[] args) {
        Casa c1 = new Casa();
        c1.porta1 = new Porta();
        c1.porta2 = new Porta();
        c1.porta3 = new Porta();

        c1.porta1.Fechada();
        c1.porta1.pintar("Vermelha");
        c1.porta1.DimensaoX = 1.80;
        c1.porta1.DimensaoY = 0.60;
        c1.porta1.DimensaoZ = 0.60;
        c1.porta1.mostra();

        c1.porta2.Fechada();
        c1.porta2.pintar("Roxa");
        c1.porta2.DimensaoX = 2.00;
        c1.porta2.DimensaoY = 0.90;
        c1.porta2.DimensaoZ = 0.40;
        c1.porta2.mostra();

        c1.porta3.Abre();
        c1.porta3.pintar("Rosa");
        c1.porta3.DimensaoX = 3.00;
        c1.porta3.DimensaoY = 1.00;
        c1.porta3.DimensaoZ = 0.60;
        c1.porta3.mostra();

        c1.pinta("Preta");

        c1.mostrar();

    }
}