package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite a quantidade de pessoa(s), ex(3): ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i=0; i<n; i++){
            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma += vetor[i];
        }

        double media = soma / n;
        System.out.printf(" A média das idades é: %.2f%n", media);

    }
}
