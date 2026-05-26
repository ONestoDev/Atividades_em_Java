package Javanauta;

public class SwitchCase {
    public static void main(String[] args) {
        int numero = 3;

        switch (numero) {
            case 1:
                System.out.println("Número é 1");
                break;
            case 2:
                System.out.println("Número é 2");
                break;
            case 3:
                System.out.println("Número é 3");
                break;
            default:
                System.out.println("Número não é 1, 2 ou 3");
        }
    }
}
