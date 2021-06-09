package EstruturaSequencial;

import java.util.Scanner;

/*
Para ler um texto ATÉ A QUEBRA DE LINHA

 */
public class ExNextLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");  // DADOS DIGITADOS:
        System.out.println(s1); //bom dia
        System.out.println(s2); //boa tarde
        System.out.println(s3); //boa noite

        sc.close();
    }
}
