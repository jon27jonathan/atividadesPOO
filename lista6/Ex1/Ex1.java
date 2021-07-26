public class Ex1 {

    public static void main(String[] args) {
        Circulo novoCirculo = new Circulo(5);
        novoCirculo.calculaArea();
        novoCirculo.calcularPerimetro();
        novoCirculo.impriResultado();
        Quadrado novoQuadrado = new Quadrado(5, 3);
        novoQuadrado.calculaArea();
        novoQuadrado.impriResultado();

    }
}
