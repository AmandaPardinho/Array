package exerciseone;

import java.util.Scanner;
import java.util.Random;

public class ExerciseOne {

    public static void main(String[] args) {
        /*Escreva um programa Java GUI ou console que declara, constrói e inicializa um vetor de 10 inteiros.
        Em seguida peça para que o usuário informe um valor a ser pesquisado. Faça uma varredura no vetor e
        informe quantas vezes o valor pesquisado é encontrado:

        int valores[] = {4, 21, 9, 8, 12, 21, 4, 4, 1, 10};
         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isEqual = false;
        int number;
        int[] values = new int[10];
        int[] draw = new int[22];


        for(int i = 0; i < values.length; i++) {
            int j;
            for (j = 1; j < 10; j++) {
                draw[j] = random.nextInt(22);
            }
            values[i] = draw[j];
            System.out.println(values[i]);
        }

        scanner.close();
    }
}
