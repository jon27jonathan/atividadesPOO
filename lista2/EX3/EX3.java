package EX3;

public class EX3 {
    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.pintar("azul");
        porta.dimensaoX = 60.0;
        porta.dimensaoY = 2.0;
        porta.dimensaoZ = 60.0;

        porta.mostrarCordaPorta();
        porta.abre();
        porta.estaAberta();
        porta.fechada();
        porta.estaAberta();

        System.out.println("As Dimensoes da Porta são :" + "\n" + "X: " + porta.dimensaoX + "\n" + "Y: "
                + porta.dimensaoY + "\n" + "Z: " + porta.dimensaoZ);

    }

}
