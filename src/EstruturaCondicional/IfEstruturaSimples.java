package EstruturaCondicional;
/* REGRA:
V: executa o bloco de comandos
F: pula o bloco de comandos

 */
public class IfEstruturaSimples {

    public static void main(String[] args) {

        int x = 5;

        System.out.println("Bom dia!");

        if (x < 0) {
            System.out.println("Boa tarde!");
        }

        System.out.println("Boa noite!");
    }
}
