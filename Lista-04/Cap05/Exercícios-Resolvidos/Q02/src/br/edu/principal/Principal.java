package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Cálculo do número 'e' =====");
        System.out.print("Informe até qual valor de n deseja calcular (ex: 10): ");
        int n = sc.nextInt();

        double e = 1.0; 
        long fatorial;

        for (int i = 1; i <= n; i++) {
            fatorial = 1;

            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }

            e += 1.0 / fatorial;
        }

        System.out.printf("\nO valor aproximado de 'e' com %d termos é: %.6f\n", n, e);
        System.out.println("=================================");

        sc.close();
    }
}
