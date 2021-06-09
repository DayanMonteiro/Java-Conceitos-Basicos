package EstruturaSequencial;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

import java.util.Scanner;

public class Exercicio02Diferenca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, Diferenca;

        A = sc.nextInt(); // 8
        B = sc.nextInt(); // 10
        C = sc.nextInt(); // 4
        D = sc.nextInt(); // 2

        Diferenca = (A * B - C * D); // Diferença: 72

        System.out.println("Diferença: " + Diferenca);

        sc.close();

    }
}
