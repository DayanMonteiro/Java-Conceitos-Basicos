package EstruturaSequencial;

/* Exercício de fixação
Em um novo programa, inicie as
seguintes variáveis:

String product1 = "Computer";
String product2 = "Office desk";
int age = 30;
int code = 5290;
char gender = 'F';
double price1 = 2100.0;
double price2 = 650.50;
double measure = 53.234567;

Em seguida, usando os valores das variáveis, produza a
seguinte saída na tela do console:
Products:
Computer, which price is $ 2100,00
Office desk, which price is $ 650,50
Record: 30 years old, code 5290 and gender: F
Measue with eight decimal places: 53,23456700
Rouded (three decimal places):

*/

public class ExFixacao1 {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products"); // Products
        System.out.printf("Computer, which price is $  %.2f %n", price1); // Computer, which price is $  2100,00
        System.out.printf("Office desk, which price is $ %.2f \n", price2); // Office desk, which price is $ 650,50
        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender); // Record: 30 years old, code 5290 and gender: F
        System.out.printf("Measue with eight decimal places: %.8f %n", measure); // Measue with eight decimal places: 53,23456700
        System.out.printf("Rouded (three decimal places): %.3f %n", measure); // Rouded (three decimal places): 53,235

    }

}
