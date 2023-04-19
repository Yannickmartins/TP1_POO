package Problema1;
import java.util.ArrayList;
import java.util.Scanner;
public class Coordenadas {
    public static void main(String[] args) {
        ArrayList<Ponto> pontos = new ArrayList<Ponto>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos pontos deseja inserir? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Coordenadas do ponto " + i + " (x y): ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            pontos.add(new Ponto(x, y));
        }

        for (int i = 1; i < n; i++) {
            Ponto p1 = pontos.get(i - 1);
            Ponto p2 = pontos.get(i);
            double distancia = distanciaDePontos(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            System.out.println("Distância entre ponto " + i + " e ponto " + (i + 1) + ": " + distancia);
        }
    }

    private static double distanciaDePontos(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    private static class Ponto {
        private double x;
        private double y;

        public Ponto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
}
