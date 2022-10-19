package mega;

import java.util.ArrayList;
import java.util.List;

public class Mega {
    public static void main(String[] args) {

        double ale = Math.random();
        Integer numeroSorteado = (int) (1 + ale * (60 - 1));
        int i;

        List<Integer> mega = new ArrayList<>();
        int size = mega.size();

        for(i = 0; i <= mega.size(); i++){
            while (i != i + 1){
                mega.add(i, numeroSorteado);
                i++;
            }
        }

        System.out.println(mega);

    }
}