package mega;

import java.util.Arrays;
import java.util.Random;

public class Mega {
    public static void main(String[] args) {
        Random random = new Random();

        int number[] = new int[6];

        for(int i = 0; i < number.length; i++){
            number[i] = random.nextInt(60);
            Arrays.stream(number).anyMatch(j -> j != random.nextInt(60));
            System.out.println(number[i]);
        }
    }
}
