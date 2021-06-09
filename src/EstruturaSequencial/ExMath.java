package EstruturaSequencial;

/* Algumas funções matemáticas em Java
         Exemplo     Significado
A = Math.sqrt(x);    Variável A recebe a raiz quadrada de x
A = Math.pow(x, y);  Variável A recebe o resultado de x elevado a y -pow de power potencia
A = Math.abs(x);     Variável A recebe o valor absoluto de x

 */

public class ExMath {

    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A); // Raiz quadrada de 3.0 = 1.7320508075688772
        System.out.println("Raiz quadrada de " + y + " = " + B); // Raiz quadrada de 4.0 = 2.0
        System.out.println("Raiz quadrada de 25 = " + C); // Raiz quadrada de 25 = 5.0

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A); // 3.0 elevado a 4.0 = 81.0
        System.out.println(x + " elevado ao quadrado = " + B); // 3.0 elevado ao quadrado = 9.0
        System.out.println("5 elevado ao quadrado = " + C); // 5 elevado ao quadrado = 25.0

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A); // Valor absoluto de 4.0 = 4.0
        System.out.println("Valor absoluto de " + z + " = " + B); // Valor absoluto de -5.0 = 5.0
    }
}
