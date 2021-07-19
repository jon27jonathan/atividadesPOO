import java.util.Scanner;

public class Ex3 {
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de contatos:");
        int n = sc.nextInt();
        Contato[] contatos = new Contato[n];

        clearBuffer(sc);
        for (int i = 0; i < n; i++) {
            System.out.println("[1] - Pessoa Física [2] - Pessoa Juridica");
            System.out.println("Escolha o tipo de pessoa:");
            int tipoDeContato = sc.nextInt();
            PessoaFisica pf = new PessoaFisica();
            PessoaJuridica pj = new PessoaJuridica();
            clearBuffer(sc);
            if (tipoDeContato == 1) {
                System.out.println("Digite as informações do contato:");
                System.out.println("Entre com o nome:");
                String nome = sc.nextLine();
                pf.setNome(nome);
                pf.getNome();

                System.out.println("Entre com o Cpf:");
                String cpf = sc.nextLine();
                pf.setCpf(cpf);
                pf.getCpf();

                System.out.println("Entre com o Endereço:");
                String endereco = sc.nextLine();
                pf.setEndereco(endereco);
                pf.getEndereco();

                System.out.println("Entre com o Nascimento:");
                String nascimento = sc.nextLine();
                pf.setNascimento(nascimento);
                pf.getNascimento();

                Agenda.addAgenda(pf);

            } else {

                System.out.println("Digite as informações do contato:");
                System.out.println("Entre com a Razão Social:");
                String razaosocial = sc.nextLine();
                pj.setRazaoSocial(razaosocial);
                pj.getRazaoSocial();

                System.out.println("Entre com o CNPJ:");
                String cnpj = sc.nextLine();
                pj.setCnpj(cnpj);
                pj.getCnpj();

                System.out.println("Entre com o Endereço:");
                String endereco = sc.nextLine();
                pj.setEndereco(endereco);
                pj.getEndereco();

                System.out.println("Entre com o Faturamento:");
                String faturamento = sc.nextLine();
                pj.setFaturamento(faturamento);
                pj.getFaturamento();
                Agenda.addAgenda(pj);
            }

        }

        System.out.println();
        Agenda.imprimeAgendaPF(Agenda.agendaPF);
        System.out.println();
        Agenda.imprimeAgendaPJ(Agenda.agendaPJ);

        System.out.println("Digite a Pessoa fisica que deseja buscar:");
        String cpf = sc.nextLine();
        PessoaFisica.buscaPF(cpf);
        System.out.println("Digite a Pessoa juridica que deseja buscar:");
        String cnpj = sc.nextLine();
        PessoaJuridica.buscaPJ(cnpj);

    }
}
