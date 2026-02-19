package IFS;/* Objetivo: Praticar a manipulação de índices para acessar elementos específicos de uma matriz quadrada.
Descrição: Escreva um programa que crie uma matriz quadrada de ordem N x N (onde N é um número inteiro definido no código,
por exemplo, N = 4). A matriz deve ser preenchida com números inteiros aleatórios. Em seguida, o programa deve calcular a soma
dos elementos da diagonal principal e da diagonal secundária.
Requisitos:
1. Declare uma matriz quadrada de int de ordem N x N (sugestão: use N = 4 ou N = 5 ).
2. Preencha a matriz com números inteiros aleatórios no intervalo de 1 a 50. Calcule e exiba:
3. A soma dos elementos da diagonal principal (onde o índice da linha é igual ao índice da coluna).
4. A soma dos elementos da diagonal secundária (onde a soma dos índices da linha e da coluna é igual a N - 1 ). Mostre a
matriz na tela para que o usuário possa verificar os resultados.
Exemplo de Saída (para uma matriz 4x4):
Matriz Gerada:
[10, 2, 45, 13]
[ 5, 22, 18, 31]
[19, 33, 11, 28]
[42, 17, 9, 49]
--- Resultados ---
Soma da Diagonal Principal (10 + 22 + 11 + 49): 92
Soma da Diagonal Secundária (13 + 18 + 33 + 42): 106 */

import java.util.Random;

public class IFS_1501_Exercicio1 {
    public static void main(String[] args) {
        int N = 4;
        int[][] matriz = new int[N][N];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        Random rand = new Random();

        // Preenchendo a matriz com números aleatórios e calculando as somas
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = rand.nextInt(50) + 1; // Números entre 1 e 50
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
                if (i + j == N - 1) {
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz Gerada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j]);
                if (j < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("\t");
        }

        // Exibindo os resultados
        System.out.println("* * * Resultados * * *");
        System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}
