package EstruturaSequencial;

/*
Para ler um caractere
Suponha uma variável tipo char declarada:
char x;
x = sc.next().charAt(0);
 */

import java.util.Scanner;

public class ExScannerNextCharAt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x); // Você digitou: D - eu escrevi meu nome, mas como passei charAt(0)
        // se eu passasse charAt(3) e digitasse meu nome ele retornaria = a,
        // pois ele busca como se fosse um array a posição passada

        sc.close();
    }
}
