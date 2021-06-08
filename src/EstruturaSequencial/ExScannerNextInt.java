package EstruturaSequencial;
/*
Para ler um número inteiro
Suponha uma variável tipo int declarada:
int x;
 */
import java.util.Scanner;

public class ExScannerNextInt {
    public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);

        int x;
        x = sc1.nextInt();
        System.out.println("Você digitou: " + x); // Você digitou: 100

        sc1.close();
    }
}
