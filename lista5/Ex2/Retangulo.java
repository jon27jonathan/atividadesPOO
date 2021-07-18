public class Retangulo extends Figuras {

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
    public double impriArea() {
        System.out.println("A área do retangulo é:" + this.area);
        return 0;
    }

}