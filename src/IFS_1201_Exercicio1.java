/* Elabore um programa para ler uma frase e adicionar em um vetor
a quantidade de ocorrencias de cada vogal
 */

import java.util.Scanner;
public class IFS_1201_Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int[] vogaisCount = new int[5]; // Índices: 0 - a, 1 - e, 2 - i, 3 - o, 4 - u

        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            switch (caractere) {
                case 'a':
                    vogaisCount[0]++;
                    break;
                case 'e':
                    vogaisCount[1]++;
                    break;
                case 'i':
                    vogaisCount[2]++;
                    break;
                case 'o':
                    vogaisCount[3]++;
                    break;
                case 'u':
                    vogaisCount[4]++;
                    break;
            }
        }

        System.out.println("Ocorrências de vogais:");
        System.out.println("A: " + vogaisCount[0]);
        System.out.println("E: " + vogaisCount[1]);
        System.out.println("I: " + vogaisCount[2]);
        System.out.println("O: " + vogaisCount[3]);
        System.out.println("U: " + vogaisCount[4]);

        scanner.close();
    }

}
