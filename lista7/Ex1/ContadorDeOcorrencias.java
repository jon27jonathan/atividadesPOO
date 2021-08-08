import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class ContadorDeOcorrencias {
    private Map<String, Integer> mapa;
    private Scanner sc;

    public ContadorDeOcorrencias() {
        mapa = new HashMap<String, Integer>(); // Cria o HashMap
        sc = new Scanner(System.in); //
        criarMapa(); // Cria o Mapa baseado na frase
        mostrarMapa();// Exibe conteudo do Mapa
    }

    // Cria o Mapa baseado na frase
    private void criarMapa() {
        System.out.println("Entre com a frase");
        String input = sc.nextLine();

        // Cria StringTokenizer para a frase de entrada
        StringTokenizer quebraFrase = new StringTokenizer(input);

        // Processamento de texto de entrada
        while (quebraFrase.hasMoreTokens()) {
            String palavra = quebraFrase.nextToken().toLowerCase(); // Obtem palavra

            // Se o mapa tiver a palavra
            if (mapa.containsKey(palavra)) // Palavras esta no mapa
            {
                int contador = mapa.get(palavra); // Obtem contagem atual
                mapa.put(palavra, contador + 1); // Incrementa a contagem
            } else
                mapa.put(palavra, 1); // Adiciona uma nova palavra com contagem de 1 ao mapa
        }
    }

    // Exibe conteudo do mapa
    private void mostrarMapa() {
        Set<String> keys = mapa.keySet(); // Obtem as classes

        // Classifica as classes
        TreeSet<String> orderedKeys = new TreeSet<String>(keys);
        System.out.println("Palavras Contidas na frase: \nPalavras\t Ocorrencias");

        // Gera a saida de cada chave no mapa
        for (String key : orderedKeys)
            System.out.printf("%-10s%10s\n", key, mapa.get(key));

    }

}