package conversordepeso;

import java.util.Scanner;

public class ConversosDePeso {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double peso;
        double novoPeso;
        int opcao;

        System.out.println("Conversor de peso");
        System.out.println("1. Converter de Libras para Quilogramas;");
        System.out.println("2. Converter de Quilogramas para Livras;");
        System.out.print("Digite uma opção: ");
        opcao = scanner.nextInt();

        if (opcao == 1){
            System.out.print("Digite o peso em Libras: ");
            peso = scanner.nextDouble();
            novoPeso = peso * 0.453592;
            System.out.printf("O novo peso em Quilogramas é de: %.2f.", novoPeso);
        }
        else if (opcao == 2){
            System.out.print("Digite o peso em Quilogramas: ");
            peso = scanner.nextDouble();
            novoPeso = peso * 2.65821499;
            System.out.printf("O novo peso em Libras é de: %.2f.", novoPeso);
        }
        else{
            System.out.println("Opção inválida! Programa finalizado.");
        }

        scanner.close();

    }
}
