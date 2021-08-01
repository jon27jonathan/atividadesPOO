public abstract class Figuras {
    protected double area;
    protected double perimetro;

    public abstract double calculaArea();

    public abstract double impriArea();

    public double getArea() {
        return this.area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

}
