package EstruturaSequencial;

/* ATENÇÃO: quebra de linha pendente
Quando você usa um comando de
leitura diferente do nextLine() e
dá alguma quebra de linha, essa
quebra de linha fica "pendente"
na entrada padrão.
Se você então fizer um nextLine(),
aquela quebra de linha pendente
será absorvida pelo nextLine().

Solução:
Faça um nextLine() extra antes de
fazer o nextLine() de seu
interesse.
 */
import java.util.Scanner;

public class ExNextLineNextInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // esse é o extra pra dar certo
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:"); // DADOS DIGITADOS:
        System.out.println(x); //25
        System.out.println(s1); //Bom dia
        System.out.println(s2); //Boa tarde
        System.out.println(s3); //Boa noite

    }
}
