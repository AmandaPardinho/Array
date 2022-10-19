package mega;

import java.util.ArrayList;
import java.util.List;

public class Mega {
    public static void main(String[] args) {

        double ale = Math.random();
        Integer numeroSorteado =  Integer.valueOf((int) (1 + ale * (60 - 1)));
        int i;

        List<Integer> mega = new ArrayList<>();
        for(i = 0; i <= 5; i++){
            mega.get(i).add(numeroSorteado);
            i++;
        }

        System.out.println(mega);

    }
}