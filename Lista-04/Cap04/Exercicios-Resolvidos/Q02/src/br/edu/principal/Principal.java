package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1 = lerNota(sc, "primeira");
        double nota2 = lerNota(sc, "segunda");
        double nota3 = lerNota(sc, "terceira");

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.printf("Média aritmética: %.2f%n", media);

        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Exame");
            double notaExame = 12 - media;
            System.out.printf("Deve tirar pelo menos %.2f no exame para ser aprovado%n", notaExame);
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Média inválida");
        }

        sc.close();
    }

    public static double lerNota(Scanner sc, String ordem) {
        System.out.printf("Digite a %s nota: ", ordem);
        double nota = sc.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Digite novamente (entre 0 e 10): ");
            nota = sc.nextDouble();
        }

        return nota;
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0
