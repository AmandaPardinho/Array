package mega;

import java.util.Scanner;

public class Mega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float ale = (float) Math.random();
        float numeroSorteado;
        numeroSorteado = 1 + (ale * (60 - 1));

        int i;

        Integer[] mega = new Integer[5];
        float [] sorteio = new float[60];


        for(i = 0; i <= 5; i++){
            for(j = 1; j <= 60; j++){

            }
            mega[i] = Float.(numeroSorteado);
            i++;
            System.out.println(mega[i]);
        }
    }
}