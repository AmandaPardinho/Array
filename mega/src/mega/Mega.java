package mega;

import java.util.Scanner;
import java.util.Random;

public class Mega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isEqual = false;
        int i;
        int j;
        int[] mega = new int[6];
        int numberRandom;


        for(i = 0; i < 6; i++){
            numberRandom = random.nextInt(60);
            for(j = 0; j < 6; j++){
                if(mega[j] == numberRandom){
                    j = 6;
                    isEqual = true;
                }
            }
            if(!isEqual){
                mega[i] = numberRandom;
            }else{
                isEqual = false;
                i--;
            }
            System.out.println(mega[i]);
        }

        scanner.close();
    }
}