package Exerc.Propostos;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a média de um aluno e informar a situação.");
        System.out.print("Digite a primeira nota: ");
     double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
     double n2 = sc.nextDouble();

     double media = (n1 + n2) / 2;
        System.out.println("A média do aluno é: " + media);

        if (media < 3) {
            System.out.println("O aluno está reprovado.");
        } else if (media < 7) {
            System.out.println("O aluno ficou para exame.");
     double notaExame = 6 - media;
            System.out.println("Para ser aprovado, precisa tirar pelo menos: " + notaExame);
        } else {
            System.out.println("Parabéns! O aluno foi aprovado!");
        }

    sc.close();
    }
}


