/* Elabore um programa para controlar os treinos de 20 clientes de uma academia. Para cada cliente
foi perguntado: dia do treino (1- Domingo, 2 – Segunda, ....) e o tipo do treino (P – Posterior, I –
Inferior, A - Ambos). Ao final, informe:
- Percentual de pessoas treinaram no fim de semana;
- Percentual de pessoas que treinaram de Segunda a Quarta somente posterior;
- Percentual de pessoas que treinaram de Segunda a Sexta somente inferior;
- Percentual de pessoas que treinaram ambos os tipos de treino em qualquer dia da semana. */

import java.util.Scanner;

public class IFS_Lista6_Q03 {

    public static void main(String[] args) {
        int N = 7;
        Scanner scanner = new Scanner(System.in);

        int contFimSemana = 0;
        int contSegQuaPosterior = 0;
        int contSegSexInferior = 0;

        for (int i = 1; i <= N; i++) {

            System.out.println("* * * Academia IFSLife * * *");
            System.out.println("Informe o dia do treino (1- Domingo, 2 – Segunda, 3 - Terça, 4 - Quarta, 5 - Quinta, 6 - Sexta, 7 - Sábado):");
            int diaTreino = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.println("Informe o tipo do treino (P – Posterior, I – Inferior, A - Ambos):");
            String tipoTreino = scanner.nextLine();

            if (diaTreino == 1 || diaTreino == 7) {
                contFimSemana++;
            }
            if ((diaTreino >= 2 && diaTreino <= 4) && tipoTreino.equalsIgnoreCase("P")) {
                contSegQuaPosterior++;
            }
            if ((diaTreino >= 2 && diaTreino <= 6) && tipoTreino.equalsIgnoreCase("I")) {
                contSegSexInferior++;
            }
        }

        float percentFimSemana = ((float) contFimSemana / N) * 100;
        float percentSegQuaPosterior = ((float) contSegQuaPosterior / N) * 100;
        float percentSegSexInferior = ((float) contSegSexInferior / N) * 100;

        System.out.println("Percentual de pessoas que treinaram no fim de semana: " + percentFimSemana + "%");
        System.out.println("Percentual de pessoas que treinaram de Segunda a Quarta somente posterior: " + percentSegQuaPosterior + "%");
        System.out.println("Percentual de pessoas que treinaram de Segunda a Sexta somente inferior: " + percentSegSexInferior + "%");
    }
}
