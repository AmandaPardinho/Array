package mega;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mega {
    public static void main(String[] args) {

        float ale = (float) Math.random();
        float numeroSorteado;
        numeroSorteado = (float) (1 + (ale * (60 - 1)));
        System.out.println(numeroSorteado);
        int i;

        Integer[] mega = new Integer[5];
        //int size = mega.size();


        for(i = 0; i <= 5; i++){
            mega[i] = Float.(numeroSorteado);
            i++;
            System.out.println(mega[i]);
        }
    }
}