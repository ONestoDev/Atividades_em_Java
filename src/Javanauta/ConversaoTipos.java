package Javanauta;

public class ConversaoTipos {
    public static void main(String[] args)  {
        int idade = 25;
        double salarioMensal = 3500.50;
        char genero = 'M';
        boolean empregadoJava = true;
// Exibindo as variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salarioMensal);
        System.out.println("Gênero: " + genero);
        System.out.println("Empregado em Java: " + empregadoJava);
// realizando cálculos
        double pao = 9.50;
        double leite = 5.30;
        double queijo = 8.80;
        double acucar = 3.20;
        double desconto = 0.10; // 10% de desconto
        int totalDiasDoMes = 30;

        double total = pao + leite + queijo + acucar;
        double valorDesconto = total * desconto;
        double valorFinal = total - valorDesconto;
        double valorTotalMensal = valorFinal * totalDiasDoMes;

        System.out.println("Valor Total: R$" + valorTotalMensal);

// trabalhando com Strings
        String nome = "João";
        String nome2 = "Ernesto";
        int tamanhoNome = nome.length();
        int tamanhoNome2 = nome2.length();
        boolean saoIguais = nome.equals(nome2);

        System.out.println("Olá, " + nome + "! Bem-vindo ao Java!");
        System.out.println("" + nome + ", o seu nome tem " + tamanhoNome + " letras. E o do " + nome2 + " tem " + tamanhoNome2 + " letras.");
        System.out.println("Os nomes são iguais? " + saoIguais);

// utilizando estruturas de controle if-else
        int idade2 = 37;

        if (idade2 < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade2 >= 18 && idade2 < 65) {
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
