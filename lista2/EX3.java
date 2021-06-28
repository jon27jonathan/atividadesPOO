public class EX3 {
    public static void main(String args[]) {
        Porta porta = new Porta();
        porta.pintar("Vermelho");
        porta.DimensaoX = 60.0;
        porta.DimensaoY = 2.0;
        porta.DimensaoZ = 60.0;

        porta.Abre();
        porta.estaAberta();
        porta.Fechada();
        porta.estaAberta();

        System.out.println("As Dimensoes da Porta são :" + "\n" + "X: " + porta.DimensaoX + "\n" + "Y: "
                + porta.DimensaoY + "\n" + "Z: " + porta.DimensaoZ);

    }

}
