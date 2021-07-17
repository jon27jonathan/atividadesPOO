
public class Ex2 {

    public static void main(String[] args) {
        Conversor converteUnidadeparaArea = new Conversor();
        System.out.println("Área do campo de futebol é 8.250m²");
        System.out.println(converteUnidadeparaArea.metrosParaPes(8250.0) + "pes²");
        System.out.println(converteUnidadeparaArea.metrosParaAcres(8250.0) + "acres");
        System.out.println(converteUnidadeparaArea.metrosParaCentimetros(8250.0) + "cm²");

    }

}