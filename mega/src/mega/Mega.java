package mega;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Mega {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> mega = new HashSet<Integer>();

        while(mega.size() < 6){
            mega.add(random.nextInt(60) + 1);
        }
        System.out.println(mega);
    }
}
