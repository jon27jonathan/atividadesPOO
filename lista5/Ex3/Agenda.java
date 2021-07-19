import java.util.ArrayList;

public class Agenda {
    public static ArrayList<PessoaFisica> agendaPF = new ArrayList<>();
    public static ArrayList<PessoaJuridica> agendaPJ = new ArrayList<>();

    public static void addAgenda(PessoaJuridica pessoaJuridica) {
        agendaPJ.add(pessoaJuridica);
    }

    public static void addAgenda(PessoaFisica pessoaFisica) {
        agendaPF.add(pessoaFisica);
    }

    public static void imprimeAgendaPF(ArrayList<PessoaFisica> agendaPF) {
        String pessoaFisica = null;
        System.out.println("[Agenda de Pessoa Física]");
        for (int i = 0; i < agendaPF.size(); i++) {
            pessoaFisica = "Nome: " + Agenda.agendaPF.get(i).getNome() + "\nCPF: " + Agenda.agendaPF.get(i).getCpf()
                    + "\n" + "Endereço: " + Agenda.agendaPF.get(i).getEndereco() + "\nAniversário: "
                    + Agenda.agendaPF.get(i).getNascimento() + "\n";
            System.out.println(pessoaFisica);

        }
    }

    public static void imprimeAgendaPJ(ArrayList<PessoaJuridica> agendaPJ) {
        String pessoaJuridica = null;
        System.out.println("[Agenda de Pessoa Jurídica]");
        for (int i = 0; i < agendaPJ.size(); i++) {
            pessoaJuridica = "Razão social: " + Agenda.agendaPJ.get(i).getRazaoSocial() + "\nCNPJ: "
                    + Agenda.agendaPJ.get(i).getCnpj() + "\n" + "Endereço: " + Agenda.agendaPJ.get(i).getEndereco()
                    + "\nFaturamento: " + Agenda.agendaPJ.get(i).getFaturamento() + "\n";
            System.out.println(pessoaJuridica);
        }
    }

    public static void add(int i) {
    }
}