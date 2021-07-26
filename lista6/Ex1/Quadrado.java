public class Quadrado extends FormaGeometrica {

    private double lado;
    private double lado2;
    private double area;
    private double perimetro;

    public Quadrado(double lado, double lado2) {
        this.lado = lado;
        this.lado2 = lado2;

    }

    @Override
    public double calculaArea() {
        if (lado == lado2) {
            this.area = this.lado * this.lado2;
        } else {
            System.out.println("\nNão é um quadrado e sim um retangulo");
        }
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        if (lado == lado2) {
            this.perimetro = this.lado * 4;
        } else {
            System.out.println("\nNão é um quadrado e sim um retangulo");
        }
        return 0;
    }

    @Override
    public double impriResultado() {
        if (lado == lado2) {
            System.out.println("\nA área do quadrado é: " + this.area);
            System.out.println("O perimetro do quadrado é: " + this.perimetro);
        } else {
            System.out.println("A área do retangulo é: " + (lado * lado2));
            System.out.println("A perimetro do retangulo é: " + ((2 * lado) + (2 * lado2)));
        }
        return 0;
    }

}