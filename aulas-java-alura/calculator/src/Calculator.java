import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double x = sc.nextDouble();
        System.out.print("Digite a operação desejada: ");
        String operator = sc.next();
        System.out.print("Digite outro número: ");
        double y = sc.nextDouble();

        switch (operator) {
            case "+" -> System.out.println(x + y);
            case "-" -> System.out.println(x - y);
            case "*" -> System.out.println(x * y);
            case "/" -> System.out.println(x / y);
            default -> System.out.println("Digite uma das operações básicas, ex: +, - ... ");
        }
    }
}
