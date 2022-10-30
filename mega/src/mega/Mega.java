package mega;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mega {
    public static void main(String[] args) {

        Integer ale = Math.random();
        Integer numeroSorteado = (Integer) (1 + ale * (60 - 1));
        System.out.println(numeroSorteado);
        int i;

        Integer[] mega = new Integer[5];
        //int size = mega.size();


        for(i = 0; i <= 5; i++){
            mega[i] = numeroSorteado;
            i++;
            System.out.println(mega[i]);
        }
    }
}