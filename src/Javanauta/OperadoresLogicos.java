package Javanauta;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        boolean resultado1 = (a < b) && (b < c); // true && true -> true
        boolean resultado2 = (a > b) || (b < c); // false || true -> true
        boolean resultado3 = !(a < b); // !true -> false

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}
