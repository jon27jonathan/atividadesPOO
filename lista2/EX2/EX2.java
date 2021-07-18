import metodos.Pessoa;

public class EX2 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jonathan", 20);

        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        System.out.println(p1.getnome() + " " + p1.getidade());

    }

}
