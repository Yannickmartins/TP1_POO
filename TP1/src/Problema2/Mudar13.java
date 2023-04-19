package Problema2;
import java.util.Scanner;

public class Mudar13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        String palavraEncriptada = rodarTexto(palavra);
        System.out.println("Palavra encriptada: " + palavraEncriptada);
    }

    private static String rodarTexto(String texto) {
        String novoTexto = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra >= 'A' && letra <= 'Z') {
                letra = (char)('A' + ((letra - 'A' + 13) % 26));
            } else if (letra >= 'a' && letra <= 'z') {
                letra = (char)('a' + ((letra - 'a' + 13) % 26));
            }
            novoTexto += letra;
        }
        return novoTexto;
    }

}
