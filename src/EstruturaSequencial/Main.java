package EstruturaSequencial;

import java.util.Locale;

public class Main {
    // define o ponto de entrada do programa
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;

        String nome = "Laryssa";
        int idade = 24;
        double renda = 3200.0;




        System.out.print("Bom dia!"); // Bom dia! (print n da quebra de linha)
        System.out.println("Olá mundo!"); // Olá mundo!

        System.out.println(y); // 32
        System.out.println(x); // 10.35784

        // controlando casas decimais printf
        // a quebra de linha pode ser %n ou \n
        System.out.printf("%.2f%n", x); // 10,36
        System.out.printf("%.4f\n", x); // 10,3578
        // printf por padrão usa , para usar . usamos Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", x); // 10.3578 assim ele passa 10. ao inves de 10,

        // concatenar
        System.out.println("RESULTADO = " + x + " METROS");  // RESULTADO = 10.35784 METROS
        System.out.printf("RESULTADO = %.2f metros%n", x); // RESULTADO = 10.36 metros

        // Marcadores
        // %f = ponto flutuante
        //%d = inteiro
        //%s = texto
        //%n = quebra de linha
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // Laryssa tem 24 anos e ganha R$ 3200.00 reais
        //

    }

}
