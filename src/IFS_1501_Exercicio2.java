/* Objetivo: Simular a criação de um mapa de batalha naval e verificar se um "tiro" acertou um navio.
Descrição: Crie um programa que represente um tabuleiro de batalha naval de 10x10. Neste tabuleiro, "navios" são representados
pelo número 1 e a "água" pelo número 0 . O programa deve primeiro posicionar aleatoriamente alguns navios no tabuleiro e, em
seguida, simular um "tiro" em uma coordenada específica, informando se acertou um navio ou a água.
Requisitos:
1. Declare uma matriz int de 10x10 para representar o tabuleiro. Inicialize todos os seus valores com 0 (água).
2. Posicione aleatoriamente 5 "navios" no tabuleiro. Um navio ocupa apenas uma célula e é representado pelo número 1 . Para
isso, gere 5 pares de coordenadas (linha, coluna) aleatórias e altere o valor da célula correspondente para 1 . Certifique-se
de que uma nova posição não sobrescreva um navio já existente.
3. Gere um par de coordenadas aleatórias para o "tiro" (uma linha e uma coluna entre 0 e 9).
4. Exiba o tabuleiro completo no console (mostrando os 0 s e 1 s).
5. Verifique a coordenada do tiro:
Se o valor na posição do tiro for 1 , exiba a mensagem: Tiro em [linha, coluna]... FOGO! Você acertou um
navio! .
Se o valor for 0 , exiba: Tiro em [linha, coluna]... ÁGUA! .

Exemplo de saída:
--- Tabuleiro de Batalha Naval ---
[0, 0, 0, 0, 0, 0, 1, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 1, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 1, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[1, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
--- Simulação de Tiro ---
Tiro em [2, 1]... FOGO! Você acertou um navio! */

public class IFS_1501_Exercicio2 {
    public static void main(String[] args) {
        int N = 10;
        int[][] tabuleiro = new int[N][N];

        // Posicionando 5 navios aleatoriamente
        int naviosPosicionados = 0;
        while (naviosPosicionados < 5) {
            int linha = (int) (Math.random() * N);
            int coluna = (int) (Math.random() * N);
            if (tabuleiro[linha][coluna] == 0) {
                tabuleiro[linha][coluna] = 1; // Coloca um navio
                naviosPosicionados++;
            }
        }

        // Gerando coordenadas do tiro
        int tiroLinha = (int) (Math.random() * N);
        int tiroColuna = (int) (Math.random() * N);

        // Exibindo o tabuleiro
        System.out.println("--- Tabuleiro de Batalha Naval ---");
        for (int i = 0; i < N; i++) {
            System.out.print("[");
            for (int j = 0; j < N; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < N - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        // Verificando o resultado do tiro
        System.out.println("--- Simulação de Tiro ---");
        if (tabuleiro[tiroLinha][tiroColuna] == 1) {
            System.out.println("Tiro em [" + tiroLinha + ", " + tiroColuna + "]... FOGO! Você acertou um navio!");
        } else {
            System.out.println("Tiro em [" + tiroLinha + ", " + tiroColuna + "]... ÁGUA!");
        }
    }
}
