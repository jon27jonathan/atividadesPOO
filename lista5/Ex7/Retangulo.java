public class Retangulo extends Figuras {

    private double base;
    private double altura;
    private double area;

    @Override
    public void calculaArea(double base, double altura) {
        this.area = this.base * this.altura;

    }

    @Override
    public double impriArea() {
        System.out.println("A área do retangulo é:" + this.area);
        return 0;
    }

}