package banco;

import java.util.Scanner;

public class Banco {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double saldo = 0;
        boolean estaRodando = true;
        int opcao;



        while(estaRodando){

            System.out.println("\n---- Sistema Bancário ----");
            System.out.println("1. Mostrar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Sair");
            System.out.print("Digite uma opção (1-4): ");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1 -> mostrarSaldo(saldo);
                case 2 -> saldo += depositar();
                case 3 -> saldo -= retirar(saldo);
                case 4 -> estaRodando = false;
                default -> System.out.println("Opcão inválida!");
            }
        }

        System.out.println("Obrigado! Tenha um bom dia. :D ");

        scanner.close();
    }

    static void mostrarSaldo(double saldo){
        System.out.printf("Saldo atual: R$%.2f\n", saldo);
    }

    static double depositar(){

        double valor;
        System.out.print("Digite o valor que você deseja depositar: ");
        valor = scanner.nextDouble();

        return valor;
    }

    static double retirar(double saldo){

        double valor;
        System.out.print("Digite o valor que deseja retirar: ");
        valor = scanner.nextDouble();

        if (valor > saldo){
            System.out.println("Fundos insuficientes!");
            return 0;
        }
        else if(valor < 0){
            System.out.println("O valor não pode ser negativo!");
            return 0;
        }
        else{
            return valor;
        }

    }

}
