package EstruturaSequencial;

/*
Scanner
Para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner" da seguinte forma:

Scanner sc = new Scanner(System.in);
            OBS
            para funcionar é necessário realizar o import = import java.util.Scanner;
           e fazer o fechamento sc.close() quando não precisar mais do objeto sc
 */

import java.util.Scanner;

public class ExScannerNext {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x); // Você digitou: Dayan

        sc.close();

    }
}
