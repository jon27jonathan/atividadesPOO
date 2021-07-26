import java.math.*;
import java.text.DecimalFormat;

public class Circulo extends FormaGeometrica {

    private double raio;
    private double area;
    private double perimetro;

    String padrão = "##.##";
    DecimalFormat df = new DecimalFormat(padrão);

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        this.area = (double) (Math.PI * (raio * raio));
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = (double) ((Math.PI * 2) * raio);
        return 0;
    }

    @Override
    public double impriResultado() {
        System.out.printf("A área do circulo: " + df.format(this.area));
        System.out.printf(" \nO perimetro do circulo: " + df.format(this.perimetro));
        return 0;
    }

}
