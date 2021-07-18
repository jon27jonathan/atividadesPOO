public class Ex2 {
    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo(10, 20);
        novoRetangulo.calculaArea();
        novoRetangulo.impriArea();
        System.out.println("--------------------------------------");
        Quadrado novoQuadrado = new Quadrado(10, 10);
        novoQuadrado.calculaArea();
        novoQuadrado.impriArea();
        System.out.println("--------------------------------------");
        Triangulo novoTriangulo = new Triangulo(3, 4, 5, 30);
        novoTriangulo.verificaTriangulo(3, 4, 5);
        novoTriangulo.calculaArea();
        novoTriangulo.impriArea();
        System.out.println("--------------------------------------");
        Circulo novoCirculo = new Circulo(2);
        novoCirculo.calculaArea();
        novoCirculo.impriArea();

    }

}
