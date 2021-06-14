package EstruturaCondicional;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro e
dizer se este número é par ou ímpar.
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Numero = sc.nextInt();

        if (Numero % 2 == 0) {
            System.out.println("NÚMERO PAR");
        }
        else
            System.out.println("NÚMERO IMPAR");
        sc.close();
    }
}
