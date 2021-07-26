public class Ex1 {

    public static void main(String[] args) {
        Circulo novoCirculo = new Circulo(5);
        novoCirculo.calculaArea();
        novoCirculo.calcularPerimetro();
        novoCirculo.impriResultado();
        Quadrado novoQuadrado = new Quadrado(5, 5);
        novoQuadrado.calculaArea();
        novoQuadrado.calcularPerimetro();
        novoQuadrado.impriResultado();
        Retangulo novoRetangulo = new Retangulo(5, 2);
        novoRetangulo.calculaArea();
        novoRetangulo.calcularPerimetro();
        novoRetangulo.impriResultado();
        Triangulo novoTriangulo = new Triangulo(6, 7, 8, 9);
        novoTriangulo.calculaArea();
        novoTriangulo.calcularPerimetro();
        novoTriangulo.impriResultado();

    }
}
