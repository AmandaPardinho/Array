package mega;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mega {
    public static void main(String[] args) {

        double ale = Math.random();
        Integer numeroSorteado = (int) (1 + ale * (60 - 1));
        System.out.println(numeroSorteado);
        int i;

        double[] mega = new double[5];
        //int size = mega.size();


        for(i = 0; i <= mega.length; i++){
            mega[i] = numeroSorteado;
            i++;
            System.out.println(mega);
        }
    }
}