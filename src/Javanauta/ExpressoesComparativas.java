package Javanauta;

public class ExpressoesComparativas {
    public static void main(String[] args) {
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
    }
}
