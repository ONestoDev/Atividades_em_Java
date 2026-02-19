package IFS;/* Em uma viagem de Lagarto/Recife/Lagarto existem 10 radares que captam a velocidade instantânea
dos veículos. Considerando a velocidade máxima de 80 km/h neste percurso, elabore um programa para
gerar e armazenar em dois vetores 10 velocidades registradas por um carro tanto na IDA (vetor 1) quanto
na VOLTA (vetor 2).
 Considerações:
- As velocidades geradas devem ser entre 60 km/h e 140 km/h;
- Informe a quantidade de vezes que o carro teve a mesma velocidade em radares consecutivos na
viagem de ida (vetor 1);
- Informe o total de multas a ser paga pelo motorista do carro na viagem de IDA (vetor 1), considerando
que a multa para excessos de velocidades até 20% custa R$ 100,00 e excessos acima de 20% custa R$
300,00;
- Em quais radares houve o registro da mesma velocidade (IDA e VOLTA);
Exemplo:
Velocidades do carro na IDA: 60 60 120 70 120 100 90 80 70 100
Velocidades do carro na VOLTA: 80 90 60 100 100 60 60 120 100 120
Número de Velocidades Iguais Consecutivas na IDA: 1 Vez(es)
Total de Multas (R$) na IDA: R$ 1300.00
Radares com Velocidades Iguais: 3, 6 (destacados em amarelo e vermelho) */

public class IFS_Lista8_Q02 {
    public static void main(String[] args) {

        int[] ida = new int[10];
        int[] volta = new int[10];
        int qtdConsecutivas = 0;
        double totalMultas = 0.0;
        String radaresIguais = "";

        for (int i = 0; i < 10; i++) {
            // Gerando as velocidades aleatórias entre 60 e 140
            ida[i] = (int) (Math.random() * (140 - 60 + 1)) + 60;
            volta[i] = (int) (Math.random() * (140 - 60 + 1)) + 60;

            // Lógica de Multas (Apenas na IDA)
            // Estácio.Velocidade Máxima permitida: 80 km/h
            if (ida[i] > 80) {
                // Até 20% acima (80 + 16 = 96 km/h)
                if (ida[i] <= 96) {
                    totalMultas += 100.00; // Multa Leve
                } else {
                    totalMultas += 300.00; // Multa Pesada (> 96 km/h)
                }
            }

            // Comparando a velocidade IDA vs VOLTA no mesmo radar
            if (ida[i] == volta[i]) {
                radaresIguais += (i + 1) + " ";
            }
        }
        for (int i = 0; i < 9; i++) {
            if (ida[i] == ida[i + 1]) {
                qtdConsecutivas++;
            }
        }
        System.out.println("====== RELATÓRIO DE VIAGEM (Lagarto -> Recife) ======\n");

        System.out.print("Velocidades IDA:   ");
        for (int v : ida) System.out.printf("%-4d", v);
        System.out.println();

        System.out.print("Velocidades VOLTA: ");
        for (int v : volta) System.out.printf("%-4d", v);
        System.out.println("\n");

        System.out.println("-----------------------------------------------------");
        System.out.println("Estatísticas:");
        System.out.println("-> Velocidades iguais consecutivas (IDA): " + qtdConsecutivas + " vez(es)");
        System.out.printf("-> Total de Multas a pagar (IDA): R$ %.2f%n", totalMultas);

        if (radaresIguais.equals("")) {
            System.out.println("-> Radares com mesma velocidade (Ida/Volta): Nenhum");
        } else {
            System.out.println("-> Radares com mesma velocidade (Ida/Volta): " + radaresIguais);
        }
    }
}