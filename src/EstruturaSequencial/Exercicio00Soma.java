package EstruturaSequencial;
/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */


import java.util.Scanner;

public class Exercicio00Soma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 30
        int y = sc.nextInt(); // 20

        int soma = x +y;

        System.out.println("resultado: " + soma); // resultado: 50
        sc.close();

    }
}
