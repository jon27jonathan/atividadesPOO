public class Quadrado extends Figuras {

    private double lado;
    private double lado2;
    private double area;

    @Override
    public void calculaArea(double lado, double lado2) {
        if (lado == lado2) {
            this.area = this.lado * this.lado2;
        } else {
            System.out.println("Não é um quadrado e sim um retangulo");
        }
    }

    @Override
    public double impriArea() {
        if (lado == lado2) {
            System.out.println("A área do quadrado é: " + this.area);
        } else {
            System.out.println("A área do retangulo é: " + (lado * lado2));
        }
        return 0;
    }

}