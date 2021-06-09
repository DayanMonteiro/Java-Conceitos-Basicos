package EstruturaSequencial;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04EstoqueCompra {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1, numberPeca1, quantidadePeca1, codPeca2, numberPeca2, quantidadePeca2;
        double valorUnitarioPeca1, valorUnitarioPeca2, valorAPagar;

        codPeca1 = sc.nextInt();
        quantidadePeca1 = sc.nextInt();
        valorUnitarioPeca1 = sc.nextDouble();

        codPeca2 = sc.nextInt();
        quantidadePeca2 = sc.nextInt();
        valorUnitarioPeca2 = sc.nextDouble();

        valorAPagar = valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2;

        System.out.printf("TOTAL = U$ %.2f%n", valorAPagar);

        /*
        1292
        5
        53.50
        2587
        3
        99.99
        TOTAL = U$ 567.47
         */


        sc.close();
    }
}
