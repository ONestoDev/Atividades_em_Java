import java.util.Random;

public class IFS_1201_Exercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int D[] = new int[81];
        int M[] = new int[101];

        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(81);
        System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        int maior = matriz[0][0];
        for (int i = 0; i < 4; i += 2) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.print("Vetor D (" + maior + "): ");
            for (int d = 1; d <= maior; d++) {
                if (maior % d == 0) {
                    System.out.print(D[maior] +d + " ");
                }
            }
            System.out.println();

        int menor = matriz[0][1];
        for (int j = 1; j < 4; j += 2) {
            for (int i = 0; i < 4; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.print("Vetor M (" + menor + "): ");
            for (int m = 0; m <= 100; m += menor) {
                System.out.print(M[menor] + m + " ");
            }
            System.out.println();
    }
}
