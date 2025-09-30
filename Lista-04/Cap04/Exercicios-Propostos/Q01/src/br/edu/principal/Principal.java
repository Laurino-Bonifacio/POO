package Exerc.Propostos;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Vamos calcular a média de um aluno.");
        System.out.print("Digite a primeira nota: ");
     double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
     double n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
     double n3 = sc.nextDouble();

        System.out.print("Digite a quarta nota: ");
     double n4 = sc.nextDouble();

     double media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média do aluno é: " + media);

        if (media >= 7) {
            System.out.println("Parabéns! O aluno foi aprovado!");
        } else {
            System.out.println("Infelizmente, o aluno foi reprovado.");
        }

        sc.close();
    }
}


