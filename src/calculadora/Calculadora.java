package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operador;
        double resultado = 0;
        boolean operacaoValida = true;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.print("Digite um operador: (+, -, ^, *, /) ");
        operador = scanner.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        switch(operador){
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '^' -> resultado = Math.pow(num1, num2);
            case '*' -> resultado = num1 * num2;
            case '/' -> {
                if (num1 == 0 || num2 == 0){
                    System.out.println("Nenhum número pode dividir ou ser divido por 0.");
                    operacaoValida = false;
                }
                else {
                    resultado = num1 / num2;
                }
            }
            default -> {
                System.out.println("Operador inválido!");
                operacaoValida = false;
            }
        }

        if (operacaoValida){
            System.out.printf("Resultado: %.2f", resultado);
        }

        scanner.close();

    }
}
