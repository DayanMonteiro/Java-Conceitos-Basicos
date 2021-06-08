package EstruturaSequencial;

/*
Casting
É a conversão explícita de um tipo para outro.
É necessário quando o compilador não é capaz de “adivinhar” que o
resultado de uma expressão deve ser de outro tipo.
 */

public class ExCast {
    public static void main(String[] args) {

        // ex 00
        int a, b;
        double resultado;
        a = 5;
        b = 2;
        // expecifiquei o (double) pq o resultado daria um numero com virgula e isso é o conceito de cast
        resultado = (double) a / b;


        // ex 01
        double c;
        int d;
        c = 5.0;
        d = (int) a;


        // ex 00
        System.out.println(resultado); // 2.5

        // ex 01
        System.out.println(d); // 5

    }
}
