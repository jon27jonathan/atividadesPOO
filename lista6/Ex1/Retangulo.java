public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }

    @Override
    public double calculaArea() {
        this.area = this.base * this.altura;
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = (2 * this.base) + (2 * this.altura);
        return 0;
    }

    @Override
    public double impriResultado() {
        System.out.println("A área do retangulo é:" + this.area);
        System.out.println("O perimetro do retangulo é:" + this.perimetro);
        return 0;
    }

    public void impriArea() {
    }

}