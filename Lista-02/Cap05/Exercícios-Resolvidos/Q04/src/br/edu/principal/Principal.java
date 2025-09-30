package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codCidade, numVeiculos, numAcidentes;
        int maiorIndice = 0, menorIndice = 0;
        int codMaior = 0, codMenor = 0;
        int somaVeiculos = 0, somaAcidentesPequenas = 0;
        int contadorPequenas = 0;

        System.out.println("=== Levantamento de Dados de Trânsito ===\n");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Cidade %d:\n", i);

            System.out.print("→ Código da cidade: ");
        codCidade = sc.nextInt();

            System.out.print("→ Número de veículos de passeio: ");
        numVeiculos = sc.nextInt();

            System.out.print("→ Número de acidentes com vítimas: ");
         numAcidentes = sc.nextInt();
            System.out.println();

            if (i == 1) {
                maiorIndice = numAcidentes;
                 menorIndice = numAcidentes;
                 codMaior = codCidade;
                  codMenor = codCidade;
            } else {
                if (numAcidentes > maiorIndice) {
                    maiorIndice = numAcidentes;
                    codMaior = codCidade;
                }
                if (numAcidentes < menorIndice) {
                    menorIndice = numAcidentes;
                    codMenor = codCidade;
                }
            }

            somaVeiculos += numVeiculos;

            if (numVeiculos < 2000) {
                somaAcidentesPequenas += numAcidentes;
                contadorPequenas++;
            }
        }

        double mediaVeiculos = somaVeiculos / 5.0;

        System.out.println("=== RESULTADOS FINAIS ===");
        System.out.printf(" Cidade com MAIOR número de acidentes: %d (%d acidentes)\n", codMaior, maiorIndice);
        System.out.printf(" Cidade com MENOR número de acidentes: %d (%d acidentes)\n", codMenor, menorIndice);
        System.out.printf(" Média de veículos nas cinco cidades: %.2f\n", mediaVeiculos);

        if (contadorPequenas == 0) {
            System.out.println(" Nenhuma cidade com menos de 2000 veículos registrada.");
        } else {
            double mediaAcidentesPequenas = somaAcidentesPequenas / (double) contadorPequenas;
            System.out.printf(" Média de acidentes em cidades com menos de 2000 veículos: %.2f\n", mediaAcidentesPequenas);
        }

        System.out.println("\nObrigado por usar o sistema!");
        sc.close();
    }
}
