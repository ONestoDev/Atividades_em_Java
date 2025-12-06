/* Elabore um programa para controlar os serviços prestados pela “Barbearia Inho”. Nesta barbearia
trabalham os profissionais Dilsinho (D) e os irmãos Betinho (B) e Netinho (N). Os serviços prestados
são: corte cabelo (SC), barba (SB), cabelo e barba (CB). Elabore um programa para ler os dados
(profissional e serviço) de 10 clientes. Ao final, informe:
- número de serviços prestados pelos irmãos para “SC”;
- percentual de serviços prestados por Dilsinho;
- Total arrecadado pela barbearia considerando os seguintes valores:
SC  R$ 30,00 SB R$ 20,00 CB  40,00 */

import java.util.Scanner;

public class IFS_Lista6_Q02 {
    public static void main(String[] args) {
        int N = 10;
        Scanner scanner = new Scanner(System.in);
        int contSC = 0;
        int contSB = 0;
        int contCB = 0;
        int contD = 0;

        for (int i = 1; i <= N; i++) {

            System.out.println("*** Barbearia Inho ***!");
            System.out.println("Informe o serviço desejado:");
            System.out.println("SC - Corte de Cabelo");
            System.out.println("SB - Só Barba");
            System.out.println("CB - Corte de Cabelo e Barba");
            String servico = scanner.nextLine();

            System.out.println("Agora informe o profissional desejado:");
            System.out.println("D - Dilsinho");
            System.out.println("B - Betinho");
            System.out.println("N - Netinho");
            String profissional = scanner.nextLine();

            if (servico.equalsIgnoreCase("SC")) {
                contSC++;
            }
            if (profissional.equalsIgnoreCase("D")) {
                contD++;
            }
            if (servico.equalsIgnoreCase("SB")) {
                contSB++;
            }
            if (servico.equalsIgnoreCase("CB")) {
                contCB++;
            }

        }
        float totalSB = contSB * 20.0f;
        float totalSC = contSC * 30.0f;
        float totalCB = contCB * 40.0f;
        float percentDilsinho = ((float) contD / N) * 100.0f;

        System.out.println("Total de cortes de cabelo (SC): " + contSC);
        System.out.println("Total arrecadado com serviços do dia: R$ " + (totalSB + totalSC + totalCB));
        System.out.println("Percentual de atendimentos realizados por Dilsinho: " + percentDilsinho + "%");
    }
}
