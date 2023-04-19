package Problema8;
import java.util.Random;

public class Resistencia {
    public static void main(String[] args) {
        double nominal = 6200;
        double tolerancia = 0.05;
        double min = nominal - (nominal * tolerancia);
        double max = nominal + (nominal * tolerancia);

        System.out.printf("Valor mínimo: %.2f kΩ\n", min / 1000);
        System.out.printf("Valor nominal: %.2f kΩ\n", nominal / 1000);
        System.out.printf("Valor máximo: %.2f kΩ\n", max / 1000);

        System.out.println("\nValores para resistências de 330 Ω ± 10%:");
        for (int i = 0; i < 10; i++) {
            double valor = 330;
            double tol = 0.1;
            double rMin = valor - (valor * tol);
            double rMax = valor + (valor * tol);

            Random r = new Random();
            double resistencia = rMin + (rMax - rMin) * r.nextDouble();

            System.out.printf("Resistência %d: %.2f Ω\n", i+1, resistencia);
        }
    }
}

