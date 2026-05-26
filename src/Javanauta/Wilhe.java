package Javanauta;

public class Wilhe {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 10) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        do {
            System.out.println("Contador do while: " + contador);
            contador++;
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Contador do for: " + i);
        }
    }
}
