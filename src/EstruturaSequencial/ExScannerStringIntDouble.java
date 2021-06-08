package EstruturaSequencial;

/*
Para ler vários dados na mesma linha
string x;
int y;
double z;
x = sc.next();
y = sc.nextInt();
z = sc.nextDouble();
 */

import java.util.Locale;
import java.util.Scanner;

public class ExScannerStringIntDouble {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        /* Dados digitados:
            Dayan
            33
            10.5
*/
        

        sc.close();
    }
}
