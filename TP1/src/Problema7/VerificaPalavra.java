package Problema7;

import java.util.Scanner;

public class VerificaPalavra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra: ");
        String palavra = scanner.next();

        System.out.print("Digite a combinação de caracteres: ");
        String combinacao = scanner.next();

        if (verificaPalavra(palavra, combinacao)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean verificaPalavra(String palavra, String combinacao) {
        int i = 0;
        for (char c : combinacao.toCharArray()) {
            if (i < palavra.length() && c == palavra.charAt(i)) {
                i++;
            }
        }
        return i == palavra.length();
    }
}

