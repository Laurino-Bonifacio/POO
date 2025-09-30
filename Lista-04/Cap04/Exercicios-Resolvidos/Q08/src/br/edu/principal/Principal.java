package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        exibirMenu();
        System.out.print("Digite uma opção: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                somar(sc);
                break;
            case 2:
                raizQuadrada(sc);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }

    public static void exibirMenu() {
        System.out.println("======= MENU =======");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Raiz quadrada de um número");
        System.out.println("====================");
    }

    public static void somar(Scanner sc) {
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        System.out.println("A soma de " + n1 + " e " + n2 + " é " + soma);
    }

    public static void raizQuadrada(Scanner sc) {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Não é possível calcular a raiz quadrada de número negativo.");
        } else {
            double raiz = Math.sqrt(n);
            System.out.printf("A raiz quadrada de %d é %.2f%n", n, raiz);
        }
    }
}
