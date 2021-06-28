import java.util.Scanner;

public class EX1 {
    // Limpa o buffer do enter que estava dando erro
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da agenda:");
        String nomeagenda = sc.nextLine();
        Agenda agenda = new Agenda(nomeagenda);

        System.out.println("Digite a quantidade de contatos:");
        int n = sc.nextInt();
        Contato[] contatos = new Contato[n];

        // Limpa o buffer do enter que estava dando erro
        clearBuffer(sc);
        for (int i = 0; i < n; i++) {
            Contato c = new Contato();
            System.out.println("Digite as informações do contato:");

            System.out.println("Entre com o nome:");
            String nome = sc.nextLine();
            c.setnome(nome);
            c.getnome();

            System.out.println("Entre com o telefone:");
            String telefone = sc.nextLine();
            c.settelefone(telefone);

            System.out.println("Entre com o email:");
            String email = sc.nextLine();
            c.setemail(email);

            contatos[i] = c;
        }
        agenda.setcontatos(contatos);
        if (agenda != null) {

            System.out.println(agenda.obterInfo());

        }
        sc.close();
    }

}
