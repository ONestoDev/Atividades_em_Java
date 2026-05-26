package Javanauta;

public class Strings {
    public static void main(String[] args) {
        String nome = "Ernesto Santana";
        String sobrenome = "Santana";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Tamanho do Nome Completo: " + nomeCompleto.length());
        System.out.println("Primeira letra do Nome: " + nome.charAt(0));
        System.out.println("Última letra do Sobrenome: " + sobrenome.charAt(sobrenome.length() - 1));
        System.out.println("Nome em Maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Nome em Minúsculas: " + nomeCompleto.toLowerCase());
        // trabalhando com Strings
        String nome3 = "João";
        String nome2 = "Ernesto";
        int tamanhoNome = nome.length();
        int tamanhoNome2 = nome2.length();
        boolean saoIguais = nome.equals(nome2);

        System.out.println("Olá, " + nome + "! Bem-vindo ao Java!");
        System.out.println("" + nome + ", o seu nome tem " + tamanhoNome + " letras. E o do " + nome2 + " tem " + tamanhoNome2 + " letras.");
        System.out.println("Os nomes são iguais? " + saoIguais);
    }
}
