/* criar uma matriz que gere valores aleatórios até 99.
considerando que a distancia entre a cidade 0 e 1 é a mesma entre a cidade 1 e 0.
e que a distancia entre uma cidade e ela mesma é 0.
exibir a matriz na tela.
gerar um percurso aleatório entre 3 cidades distintas e exibir a distancia total do percurso.
informar as cidades que tem a maior distancia.
criar um vetor que contenha a soma de 2 linhas seguidas. caso a matriz seja impar, a ultima linha deve ser somada só
*/

import java.util.Random;

public class IFS_Avaliacao2_PT2 {
    public static void main(String[] args) {
        int N = 5;
        int[][] matriz = new int[N][N];
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else if (i < j) {
                    matriz[i][j] = rand.nextInt(99) + 1;
                    matriz[j][i] = matriz[i][j];
                }
            }
        }
        System.out.println("* * * Matriz de Distâncias * * *");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        int cidade1 = rand.nextInt(N);
        int cidade2;
        do {
            cidade2 = rand.nextInt(N);
        } while (cidade2 == cidade1);
        int cidade3;
        do {
            cidade3 = rand.nextInt(N);
        } while (cidade3 == cidade1 || cidade3 == cidade2);
        int distanciaTotal = matriz[cidade1][cidade2] + matriz[cidade2][cidade3];
        System.out.println("Percurso entre as cidades: " + cidade1 + " - " + cidade2 + " - " + cidade3);
        System.out.println("Distância total: " + distanciaTotal);

        int maxDistancia = Integer.MIN_VALUE;
        int cidadeA = -1;
        int cidadeB = -1;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (matriz[i][j] > maxDistancia) {
                    maxDistancia = matriz[i][j];
                    cidadeA = i;
                    cidadeB = j;
                }
            }
        }
        System.out.println("A maior distância é entre a cidade " + cidadeA + " e a cidade " + cidadeB + ": " + maxDistancia);

        int tamanhoVetor = (N + 1) / 2;
        int[] somaLinhas = new int[tamanhoVetor];
        for (int i = 0; i < N; i += 2) {
            int soma = matriz[i][0];
            for (int j = 1; j < N; j++) {
                soma += matriz[i][j];
            }
            if (i + 1 < N) {
                for (int j = 0; j < N; j++) {
                    soma += matriz[i + 1][j];
                }
            }
            somaLinhas[i / 2] = soma;
        }
        System.out.println("* * * Soma das linhas * * *");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Soma de 2 em 2 linhas " + (i * 2) + " e " + (i * 2 + 1) + ": " + somaLinhas[i]);
        }
    }
}
