package IFS;

import java.util.Random;

public class IFS_1901_Exercicio1 {
    public static void main(String[] args) {
        int V1[] = new int[5];
        int V2[] = new int[5];
        int V3[] = new int[10];

        Random random = new Random();
        // Preencher V1 e V2 com valores aleatórios entre 1 e 20
        for (int i = 0; i < 5; i++) {
            V1[i] = random.nextInt(21);
            V2[i] = random.nextInt(21);
        }
        // Prencher V3 com os valores pares de V1
        int j = 0;
        for (int i = 0; i < 5; i++) {
            if (V1[i] % 2 == 0) {
                V3[j++] = V1[i];
            }
        }
        // Preencher V3 com os valores ímpares de V2
        for (int i = 0; i < 5; i++) {
            if (V2[i] % 2 != 0) {
                V3[j++] = V2[i];
            }
        }
        // Criar o V4 com o maior valor de V1 e o menor valor de V2 e os multiplos de 4 entre eles
        int V4[] = new int[20];
        int minV1 = 999;
        int maxV2 = -1;

        for (int i = 0; i < 5; i++) {
            if (V1[i] < minV1) {
                minV1 = V1[i];
            }
            if (V2[i] > maxV2) {
                maxV2 = V2[i];
            }
        }

        int k = 0;
        for (int i = minV1; i <= maxV2; i++) {
            if (i % 4 == 0) {
                V4[k++] = i;
            }
        }

        // Imprimir os vetores
        System.out.println("Vetor V1:");
        for (int i = 0; i < 5; i++) {
            System.out.print(V1[i] + " ");
        }
        System.out.println("\nVetor V2:");
        for (int i = 0; i < 5; i++) {
            System.out.print(V2[i] + " ");
        }
        System.out.println("\nVetor V3:");
        for (int i = 0; i < j; i++) {
            System.out.print(V3[i] + " ");
        }
        System.out.println("\nVetor V4:");
        for (int i = 0; i < k; i++) {
            System.out.print(V4[i] + " ");
        }
    }
}
