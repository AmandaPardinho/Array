package exerciseone;

import java.util.Scanner;

public class SolvedExercise {

    public static void main(String[] args) {
        /*Crie uma classe TestaArrays e, no método main, crie uma array de contas de tamanho 10.
        Em seguida, faça um laço para criar dez contas com saldos distintos e colocá-las na array.
        Por exemplo, você pode utilizar o índice do laço e multiplicá-lo por cem para gerar o saldo de cada conta: */

        /*Conta[] contas = new Conta[10];

        for (int i = 0; i < contas.length; i++) {
            Conta conta = new ContaCorrente();
            conta.deposita(i * 100.0);
            // escreva o código para guardar a conta na posição i do array
        }*/

        double[] contas = new double[10];

        for(int i = 0; i < contas.length; i++) {
            double contaCorrente;
            contaCorrente = i * 100.0;
            contas [i] = contaCorrente;
            
        }

    }
}
