public class Triangulo extends Figuras {
    private double ladoA;
    private double base;
    private double ladoC;
    private double altura;
    private double area;

    public Triangulo() {
        this.ladoA = ladoA;
        this.ladoC = ladoC;
        this.base = base;
        this.altura = altura;

    }

    public double verificaTriangulo(double ladoA, double base, double ladoC) {

        if (ladoA < base + ladoC && base < ladoA + ladoC && ladoC < ladoA + base) {
            System.out.println("Trata-se de um triangulo");
            if (ladoA == base && ladoA == ladoC) {
                System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
            } else if (ladoA == ladoC || ladoA == ladoC) {
                System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
            } else
                System.out.println("Três lados diferentes, Trata-se de um Triangulo Escaleno.");
        } else {
            System.out.println("Não é um triangulo");
        }
        return 0;

    }

    @Override
    public void calculaArea(double ladoA, double base, double ladoC, double altura) {
        if (ladoA < base + ladoC && base < ladoA + ladoC && ladoC < ladoA + base) {
            this.area = (this.base * this.altura) / 2;
        }
    }

    @Override
    public double impriArea() {
        System.out.println("A área do triangulo é: " + this.area);
        return 0;
    }
}