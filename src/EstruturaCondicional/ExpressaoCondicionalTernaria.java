package EstruturaCondicional;
/*
Expressão condicional ternária
Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
condição.
Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso
 */
import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* ex em if else
        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.05;
        }

        System.out.println(desconto);
        sc.close();
        */
         // mesmo exemplo usando condição ternaria

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto); // 1.725
        sc.close();
    }
}
