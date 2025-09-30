package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println(" Sistema de Calculo de Salários ");
        System.out.println("==================================");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n--- Funcionário %d ---\n", i);

            System.out.print("Informe o código do funcionário: ");
            int codigo = sc.nextInt();

            System.out.print("Informe o número de horas trabalhadas: ");
            int horas = sc.nextInt();

            char turno = ' ';
            while (turno != 'M' && turno != 'V' && turno != 'N') {
                System.out.print("Turno (M - Matutino | V - Vespertino | N - Noturno): ");
                String input = sc.next().trim().toUpperCase();
                if (!input.isEmpty()) {
                    turno = input.charAt(0);
                }
                if (turno != 'M' && turno != 'V' && turno != 'N') {
                    System.out.println("Turno inválido. Digite M, V ou N.");
                }
            }

            char categoria = ' ';
            while (categoria != 'O' && categoria != 'G') {
                System.out.print("Categoria (O - Operário | G - Gerente): ");
                String input = sc.next().trim().toUpperCase();
                if (!input.isEmpty()) {
                    categoria = input.charAt(0);
                }
                if (categoria != 'O' && categoria != 'G') {
