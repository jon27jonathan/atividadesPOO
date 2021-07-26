public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;
    private double area;

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
        return 0;
    }

    @Override
    public double impriResultado() {
        System.out.println("\nA área do retangulo é:" + this.area);
        return 0;
    }

}