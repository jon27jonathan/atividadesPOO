public class SomaDasAreas {
    public static double someAreas(Figuras[] shapes) {
        double soma = 0;
        for (Figuras shape : shapes) {
            soma += shape.getArea();

        }
        return soma;

    }

}
