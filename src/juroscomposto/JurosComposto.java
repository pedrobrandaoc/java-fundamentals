package juroscomposto;

import java.util.Scanner;

public class JurosComposto {
    public static void main(String[] args){
        /*
        * Fórmula: M = C * (1 + i/n)^n*t
        * M -> montante
        * C -> capital
        * i -> taxa
        * n -> quantas vezes o juros é aplicado (ex: anual = 1, diario = 365, etc.)
        * t -> tempo (em anos)
        */

        Scanner scanner = new Scanner(System.in);

        double capital;
        double taxa;
        int numeroDeVezes;
        int tempoEmAnos;
        double montante;

        System.out.println("Digite o capital inicial: ");
        capital = scanner.nextDouble();
        System.out.println("Digite a taxa que será aplicada: ");
        taxa = scanner.nextDouble() / 100;
        System.out.println("Digite o número de vezes que a taxa será aplicada por ano: ");
        numeroDeVezes = scanner.nextInt();
        System.out.println("Digite em quanto tempo (em anos) que o juros será aplicado: ");
        tempoEmAnos = scanner.nextInt();

        montante = capital * Math.pow(1 + taxa/numeroDeVezes, numeroDeVezes * tempoEmAnos);

        System.out.printf("O valor final é de %.2f.", montante);

        scanner.close();
    }
}
