package EstruturaCondicional;

import java.util.Scanner;

/* REGRA:
V: executa somente o bloco do if
F: executa somente o bloco do else
 */
public class IfElse00 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else {
            System.out.println("Boa tarde!");
        }

       sc.close();
    }
}
