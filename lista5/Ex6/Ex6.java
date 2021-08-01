public class Ex6 {
    public static void main(String[] args) {
        Par novoPar = new Par(1.1998, 777.7);
        System.out.println(novoPar.getPrimeiroElemento());
        System.out.println(novoPar.getSegundoElemento());

        novoPar.setPrimeiroElemento("Jonathan");
        novoPar.setSegundoElemento(27);

        System.out.println(novoPar.getPrimeiroElemento());
        System.out.println(novoPar.getSegundoElemento());
    }

}
