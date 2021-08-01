public class Ex7 {

    public static void main(String[] args) {
        Figuras[] array = new Figuras[4];

        array[0] = new Circulo();
        ((Circulo) array[0]).calculaArea(2);
        array[1] = new Quadrado();
        ((Quadrado) array[1]).calculaArea(20, 20);
        array[2] = new Retangulo();
        ((Retangulo) array[2]).calculaArea(27, 50);
        array[3] = new Triangulo();
        ((Triangulo) array[3]).calculaArea(4, 5, 6, 8);

        System.out.println(SomaDasAreas.someAreas(array));

    }

}
