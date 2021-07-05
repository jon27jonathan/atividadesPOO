import java.util.Scanner;

public class Mecanica {
    private String modelo;
    private double reparo;
    private String parte;

    public String getModelo() {
        return this.modelo;
    }

    public void setParte(String parte) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual parte foi danificada?");
        parte = sc.next();

    }

    public void setReparo(double reparo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Preço para consertar:");
        reparo = sc.nextDouble();
        if (reparo > 1000) {

            this.reparo = reparo;
            System.out.println("Preço aceito");
            System.out.println("Carro pronto");
        } else {
            System.out.println("Preço não aceito");
        }

    }

}