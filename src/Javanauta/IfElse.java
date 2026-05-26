package Javanauta;

public class IfElse {
    public static void main(String[] args) {
        // utilizando estruturas de controle if-else
        int idade = 37;

        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }

        boolean temDinheiro = false;
        boolean temCartao = false;

        if (temDinheiro && temCartao) {
            System.out.println("Pede um ifood e um Zé Delivery!");
        } else if (temCartao || temDinheiro) {
            System.out.println("Pede um ifood!");
        } else {
            System.out.println("Não pede nada, vai ter que cozinhar!");
        }

    }
}
