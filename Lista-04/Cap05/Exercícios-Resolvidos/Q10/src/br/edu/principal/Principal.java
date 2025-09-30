package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_TIMES = 5;
        final int JOGADORES_POR_TIME = 11;
        int totalJogadores = NUM_TIMES * JOGADORES_POR_TIME;

        int jogadoresMenores18 = 0;
        double somaAlturas = 0;
        int jogadoresAcima80kg = 0;

        System.out.println("===== Estatísticas do Campeonato =====");

        for (int time = 1; time <= NUM_TIMES; time++) {
            int somaIdadesTime = 0;

            System.out.println("\n--- Time " + time + " ---");
            for (int jogador = 1; jogador <= JOGADORES_POR_TIME; jogador++) {
                System.out.println("Jogador " + jogador + ":");

                System.out.print("Idade (anos): ");
                int idade = sc.nextInt();

                System.out.print("Peso (kg): ");
                double peso = sc.nextDouble();

                System.out.print("Altura (metros): ");
                double altura = sc.nextDouble();

                if (idade < 18) {
                    jogadoresMenores18++;
                }
                if (peso > 80) {
                    jogadoresAcima80kg++;
                }

                somaIdadesTime += idade;
                somaAlturas += altura;
            }

            double mediaIdadeTime = (double) somaIdadesTime / JOGADORES_POR_TIME;
            System.out.printf("Média das idades do time %d: %.2f anos\n", time, mediaIdadeTime);
        }

        double mediaAlturaCampeonato = somaAlturas / totalJogadores;
        double porcentagemAcima80 = (jogadoresAcima80kg * 100.0) / totalJogadores;

        System.out.println("\n=== Estatísticas Gerais do Campeonato ===");
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + jogadoresMenores18);
        System.out.printf("Média das alturas de todos os jogadores: %.2f metros\n", mediaAlturaCampeonato);
        System.out.printf("Porcentagem de jogadores com mais de 80kg: %.2f%%\n", porcentagemAcima80);

        sc.close();
    }
}
