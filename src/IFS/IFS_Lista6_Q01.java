package IFS;/* Elabore um programa para gerar 100 números (até 200) que representam as velocidades
registradas por diversos carros em um radar na BR 101 próximo a cidade de Estância/SE. Considere os
50 valores iniciais no turno da manhã e os demais no turno da tarde. Ao final, informe:
- número de carros com velocidade acima de 100Km/h no turno da manhã;
- maior velocidade registrada no turno da tarde;
- total do valor que será arrecadado das multas dos carros nos dois turnos:
- velocidade entre 100 km/k e 140 km/h  multa de R$ 100,00
- velocidade acima de 140 km/h  multa de R$ 200,00 */

import java.util.Random;

public class IFS_Lista6_Q01 {

    public static void main(String[] args) {

        Random random = new Random();

        int cont100Manha = 0;
        int totalMultaManha = 0;
        int totalMultaTarde = 0;
        int maiorVelocidadeTarde = 0;

        // manhã: veículos 1 a 50
        for (int i = 1; i <= 50; i++) {
            int velocidade = random.nextInt(200) + 1; // Número aleatório entre 1 e 200
            if (velocidade > 100) {
                cont100Manha++;
            }
            if (velocidade >= 100 && velocidade <= 140) {
                int multa = 100;
                totalMultaManha += multa;
            }
        }
        // tarde: veículos 51 a 100
        for (int i = 51; i <= 100; i++) {
            int velocidade = random.nextInt(200) + 1;
            if (velocidade > maiorVelocidadeTarde) {
                maiorVelocidadeTarde = velocidade;
            }
            if (velocidade > 140) {
                int multa = 200;
                totalMultaTarde += multa;
            }
        }
        System.out.println("Quantidade de veículos que excederam 100 km/h pela manhã: " + cont100Manha);
        System.out.println("Total de multas aplicadas pela manhã e tarde: R$ " + (totalMultaManha + totalMultaTarde));
        System.out.println("Maior velocidade registrada à tarde: " + maiorVelocidadeTarde + " km/h");
    }
}
