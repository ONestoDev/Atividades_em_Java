import java.util.Random;

public class IFS_Avaliacao2_PT1 {
    public static void main(String[] args) {

        int [] vetorA = new int [20];
        int [] vetorB = new int [10];
        int [] frequencia = new int [20];
        int [] intersecao = new int [10];
        int qtdIntersecao = 0;

        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            vetorA[i] = rand.nextInt(20);

            int num = vetorA[i];
            frequencia[num]++;
        }

        for (int i = 0; i < 10; i++) {
            vetorB[i] = rand.nextInt(20);
        }

        int moda = 0;
        int frequenciaModa = 0;

        for (int i = 0; i < 20; i++) {
            if (frequencia[i] > frequenciaModa) {
                frequenciaModa = frequencia[i];
                moda = i;
            }
        }

        for (int i = 0; i < 10; i++) {
            int numDeB = vetorB[i];
            if (frequencia[numDeB] > 0) {
                intersecao[qtdIntersecao] = numDeB;
                qtdIntersecao++;
                frequencia[numDeB] = 0;
            }
        }

        System.out.println("* * * Vetores Gerados * * *");

        System.out.print("Vetor A: [ ");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("]");

        System.out.print("Vetor B: [ ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("]");

        System.out.println("\n * * * Análise de Dados * * *");
        System.out.println("Moda do Vetor A: O número " + moda + " foi o mais frequente, aparecendo " + frequenciaModa + "vezes.");

        System.out.println("\n* * * Inteseção (Elementos de B que estão em A) * * *");
        System.out.print("Vetor Interseção: [ ");
        for (int i = 0; i < qtdIntersecao; i++) {
            System.out.print(intersecao[i] + " ");
        }
        System.out.println("]");

    }
}
