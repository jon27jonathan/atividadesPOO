import java.math.*;
import java.text.DecimalFormat;

public class Circulo extends Figuras {

    private double raio;
    private double area;

    String padrão = "##.##";
    DecimalFormat df = new DecimalFormat(padrão);

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        this.area = Math.PI * (raio * raio);

        return 0;
    }

    @Override
    public double impriArea() {
        System.out.printf("A área do circulo: " + df.format(this.area));

        return 0;
    }

}