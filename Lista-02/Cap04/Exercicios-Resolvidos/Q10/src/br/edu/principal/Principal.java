package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos comparar duas datas!");
        System.out.println("Digite a primeira data:");
        System.out.print("Dia: ");
         int dia1 = sc.nextInt();
        System.out.print("Mês: ");
         int mes1 = sc.nextInt();
        System.out.print("Ano: ");
         int ano1 = sc.nextInt();

        System.out.println("\nDigite a segunda data:");
        System.out.print("Dia: ");
         int dia2 = sc.nextInt();
        System.out.print("Mês: ");
         int mes2 = sc.nextInt();
        System.out.print("Ano: ");
         int ano2 = sc.nextInt();

        System.out.println();
        if (ano1 > ano2 || (ano1 == ano2 && mes1 > mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 > dia2)) {
            System.out.printf("A data mais recente é: %02d/%02d/%04d\n", dia1, mes1, ano1);
        } else if (ano1 == ano2 && mes1 == mes2 && dia1 == dia2) {
            System.out.println("As duas datas são iguais!");
        } else {
            System.out.printf("A data mais recente é: %02d/%02d/%04d\n", dia2, mes2, ano2);
        }

        sc.close();
    }
}
