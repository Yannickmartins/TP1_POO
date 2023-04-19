package Problema3;
import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {

        int[] randomArray = new int[10];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }

        System.out.println("Todo elementos que estão num índice par: \n");
        for (int i = 0; i < randomArray.length; i++) {
            if (i % 2 == 0) {
                System.out.print(randomArray[i] + " ");
            }
        }
        System.out.println("\n\n");

        System.out.println("Todo elemento par: \n");
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0) {
                System.out.print(randomArray[i] + " ");
            }
        }
        System.out.println("\n\n");

        System.out.println("Todos os elementos na ordem inversa: \n");
        for (int i = randomArray.length - 1; i >= 0; i--) {
            System.out.print(randomArray[i] + " ");
        }
        System.out.println("\n\n");

        System.out.println("Apenas o primeiro e último elemento: \n");
        System.out.print(randomArray[0] + " " + randomArray[randomArray.length - 1]);

    }
}
