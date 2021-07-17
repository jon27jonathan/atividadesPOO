package EX4;

import EX3.Porta;

public class EX4 {
    public static void main(String[] args) {
        Casa c1 = new Casa();
        c1.porta1 = new Porta();
        c1.porta2 = new Porta();
        c1.porta3 = new Porta();

        c1.porta1.fechada();
        c1.porta1.pintar("Vermelha");
        c1.porta1.dimensaoX = 1.80;
        c1.porta1.dimensaoY = 0.60;
        c1.porta1.dimensaoZ = 0.60;
        c1.porta1.mostra();

        c1.porta2.abre();
        c1.porta2.pintar("Roxa");
        c1.porta2.dimensaoX = 2.00;
        c1.porta2.dimensaoY = 0.90;
        c1.porta2.dimensaoZ = 0.40;
        c1.porta2.mostra();

        c1.porta3.abre();
        c1.porta3.pintar("Rosa");
        c1.porta3.dimensaoX = 3.00;
        c1.porta3.dimensaoY = 1.00;
        c1.porta3.dimensaoZ = 0.60;
        c1.porta3.mostra();

        c1.pinta("Preta");

        c1.mostrar();

    }
}