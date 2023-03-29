package aplicacao;

import entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite a quantidade de produtos ");
        int n = sc.nextInt();
        Produto[] vetor = new Produto[n];

        for (int i=0; i< vetor.length; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vetor[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
        for (int i=0; i< vetor.length; i++){
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;
        System.out.printf(" A média dos produtos é = %.2f%n", media);

        sc.close();
    }
}
