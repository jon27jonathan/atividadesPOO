import java.math.*;
import java.text.DecimalFormat;

public class Circulo extends Figuras {

    String padrão = "##.##";
    DecimalFormat df = new DecimalFormat(padrão);

    @Override
    public void calculaArea(double raio) {
        this.area = (double) (Math.PI * (raio * raio));

    }

    @Override
    public double impriArea() {
        System.out.printf("A área do circulo: " + df.format(this.area));
        return 0;
    }

}