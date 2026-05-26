package IFS;
// Elabore um programa para gerar 100 números (até 200) que representam as velocidades
// registradas por diversos carros em um radar na BR 101 próximo a cidade de Estância/SE.
// Considere os 50 valores iniciais no turno da manhã e os demais no turno da tarde.
// Ao final, informe:
//	- número de carros com velocidade acima de 100Km/h no turno da manhã;
//	- maior velocidade registrada no turno da tarde;
//	- total do valor que será arrecadado das multas dos carros nos dois turnos:
//- velocidade entre 100 km/k e 140 km/h  multa de R$ 100,00
//- velocidade acima de 140 km/h   multa de R$ 200,00

import java.util.Random;

public class Monitoria_2105 {
    public static void main(String[] args) {
        Random random = new Random();
        int N = 200;
        int carrosManha = 0;
        int maiorVelocidadeTarde = 0;
        double totalArrecado = 0.0;

        //processamento das velocidades
        for (int i =1; i <= N; i++) {
            int velocidade = random.nextInt(201);

            if (i <= 50) {
                if (velocidade > N) {
                    carrosManha++;
                }
            }
            else {
                if (velocidade > maiorVelocidadeTarde) {
                    maiorVelocidadeTarde = velocidade;
                }
            }

            //calculando as multas
            if (velocidade > 100 && velocidade <= 140) {
                totalArrecado += 100.00;
            } else if (velocidade > 140){
                totalArrecado += 200.00;
            }
        }

        System.out.println("=========== RELÁTORIO FINAL ===========");
        System.out.println("Carros acima de 100Km/h no turno da manhã: " + carrosManha);
        System.out.println("Maoir velocidade no turno da tarde: " + maiorVelocidadeTarde);
        System.out.printf("Total arrecadado com as multas (Manhã e Tarde): R$ %.2f\n", totalArrecado);
        System.out.println("===========================================");

    }
}
