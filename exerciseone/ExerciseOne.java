package exerciseone;

import java.util.Random;

public class ExerciseOne {

    public static void main(String[] args) {
        /*Escreva um programa Java GUI ou console que declara, constrói e inicializa um vetor de 10 inteiros.
        Em seguida peça para que o usuário informe um valor a ser pesquisado. Faça uma varredura no vetor e
        informe quantas vezes o valor pesquisado é encontrado:

        int valores[] = {4, 21, 9, 8, 12, 21, 4, 4, 1, 10};
         */
        Random random = new Random();

        int vector[] = new int[10];

        for(int i = 0; i < vector.length; i++){
            vector[i] = random.nextInt(100);
        }

    }
}
