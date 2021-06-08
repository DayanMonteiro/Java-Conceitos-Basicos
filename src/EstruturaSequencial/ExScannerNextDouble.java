package EstruturaSequencial;

/*
Para ler um número com ponto flutuante
Suponha uma variável tipo double declarada:
double x;
x = sc.nextDouble();
Localidade do sistema
ATENÇÃO:
Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner, faça:
Locale.setDefault(Locale.US);
*/

import java.util.Locale;
import java.util.Scanner;

public class ExScannerNextDouble {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n",  x); // Você digitou: 10.52

        sc.close();
    }
}
