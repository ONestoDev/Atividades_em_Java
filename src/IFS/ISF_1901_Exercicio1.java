package IFS;

import java.util.Random;

public class ISF_1901_Exercicio1 {
    public static void main(String[] args) {
        int[] V1 = new int[5];
        int[] V2 = new int[5];
        int[] V3 = new int[10];
        Random rand = new Random();

        int j = 0;
// Preenchendo os vetores V1 e V2 com valores aleatórios

        for (int i = 0; i < 5; i++) {
            V1[i] = rand.nextInt(21);
            V2[i] = rand.nextInt(21);
        }
        // prenchendo o V3 com os valores pares de V1 e os valores ímpares de V2
        j = 0;
        for (int i = 0; i < 5; i++) {
            if (V1[i] % 2 == 0) {
                V3[j++] = V1[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            if (V2[i] % 2 != 0) {
                V3[j++] = V2[i];
            }
        }

        // Imprimindo os vetores
        System.out.println("Vetor V1:");
        for (int i = 0; i < 5; i++) {
            System.out.print(V1[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor V2:");
        for (int i = 0; i < 5; i++) {
            System.out.print(V2[i] + " ");
        }
        System.out.println();
        // Imprimindo o vetor V3 sem os valores não preenchidos
        System.out.println("Vetor V3 (Pares de V1 e Ímpares de V2):");
        for (j = 0; j < 10; j++) {
            if (V3[j] != 0) {
                System.out.print(V3[j] + " ");
            }
        }
    }
}
