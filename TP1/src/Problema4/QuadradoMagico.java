package Problema4;
import java.util.Scanner;

public class QuadradoMagico {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os numeros para a matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }



        boolean[] novo = new boolean[17];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int v = matriz[i][j];
                if (v < 1 || v > 16 || novo[v]) {
                    System.out.println("Matriz inválida");
                    return;
                }
                novo[v] = true;
            }
        }

        int s = 0;
        for (int i = 0; i < 4; i++) {
            s += matriz[i][0];
        }

        for (int i = 0; i < 4; i++) {
            int sL = 0;
            int sC = 0;
            for (int j = 0; j < 4; j++) {
                sL += matriz[i][j];
                sC += matriz[j][i];
            }
            if (sL != s || sC != s) {
                System.out.println("Matriz inválida");
                return;
            }
        }

        int sD1 = 0;
        int sD2 = 0;
        for (int i = 0; i < 4; i++) {
            sD1 += matriz[i][i];
            sD2 += matriz[i][3 - i];
        }
        if (sD1 != s || sD2 != s) {
            System.out.println("Matriz inválida");
            return;
        }

        System.out.println("Matriz válida: é um quadrado mágico");
    }

}
