import java.util.Random;
import java.util.Scanner;

public class IFS_1501_Exercicio3 {
    public static void main(String[] args) {
        int N = 10;
        int[][] tabuleiro = new int[N][N];

        Random rand = new Random();

        // Posicionando 5 navios aleatoriamente
        int naviosPosicionados = 0;
        while (naviosPosicionados <= 5) {
            int linha = rand.nextInt(N);
            int coluna = rand.nextInt(N);
            if (tabuleiro[linha][coluna] == 0) {
                tabuleiro[linha][coluna] = 1; // Coloca um navio
                naviosPosicionados++;
            }
        }

        // Gerando coordenadas do tiro
        // int tiroLinha = rand.nextInt(N);
        // int tiroColuna = rand.nextInt(N);
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a linha do tiro (0-9): ");
        int tiroLinha = scan.nextInt();
        System.out.print("Digite a coluna do tiro (0-9): ");
        int tiroColuna = scan.nextInt();

        // Exibindo o tabuleiro
        System.out.println("* * * Tabuleiro de Batalha Naval * * *");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("\t");
        }

        // Verificando o resultado do tiro
        System.out.println("* * * Simulação de Tiro * * *");
        if (tabuleiro[tiroLinha][tiroColuna] == 1) {
            System.out.println("Tiro em [" + tiroLinha + ", " + tiroColuna + "]... FOGO! Você acertou um navio!");
        } else {
            System.out.println("Tiro em [" + tiroLinha + ", " + tiroColuna + "]... ÁGUA!");
        }
    }
}
