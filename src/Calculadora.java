import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("CALCULADORA BÁSICA");
        System.out.println("------------------\n");

        System.out.println("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();
        System.out.println();

        System.out.println("Digite o segundo número:");
        double n2 = entrada.nextDouble();
        System.out.println();

        System.out.println("Escolha o tipo de operação: \n" +
                "1 - Adição          (+)\n" +
                "2 - Subtração       (-)\n" +
                "3 - Multiplicação   (*)\n" +
                "4 - Divisão         (/)\n" +
                "5 - Módulo          (%)\n" +
                "6 - Potenciação     (^)\n");
        int operacao = entrada.nextInt();

        var     resultado = (operacao == 1) ? n1+n2 : (operacao == 2) ? n1-n2 :
                (operacao == 3) ? n1*n2 : (operacao == 4) ? n1/n2 : (operacao == 5)
                ? n1%n2 : (operacao == 6) ? Math.pow (n1, n2) : "Entrada Inválida!";

        System.out.println();
        System.out.println("Resultado: " + resultado);

        entrada.close();
    }

}
