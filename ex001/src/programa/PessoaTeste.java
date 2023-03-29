package programa;

import entidade.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class PessoaTeste {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Qual a sua idade? ");
        int idade = sc.nextInt();
        System.out.print("Qual é a sua altura? ");
        double altura = sc.nextDouble();
        System.out.print("Qual o seu peso? ");
        double peso = sc.nextDouble();

        Pessoa ps = new Pessoa( nome, idade, altura, peso);
        System.out.println();

        if (ps.imc() < 18.05) {
            System.out.println(" Você está abaixo do peso! O IMC recomendável é entre 18,5 e 24,9. ");
        } else if (ps.imc() <= 24.09) {
            System.out.println(" Que ótimo! Peso normal. " );
        } else if (ps.imc() <= 29.09) {
            System.out.println(" Cuidado! Você está acima do peso. O IMC recomendável é entre 18,5 e 24,9. " );
        }else {
            System.out.println(" Cuidado! Obesidade. O IMC recomendável é entre 18,5 e 24,9. ");
        }

        System.out.printf(ps.toString());

        sc.close();
    }
}
