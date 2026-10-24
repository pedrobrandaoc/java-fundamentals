package conversordetemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        double temperatura;
        double novaTemperatura;
        String unidadeDeMedida;

        System.out.print("Digite a temperatura: ");
        temperatura = scanner.nextDouble();
        System.out.print("Deseja converter para qual unidade de medida? (C ou F) ");
        unidadeDeMedida = scanner.next().toUpperCase();

        novaTemperatura = (unidadeDeMedida.equals("C")) ? (temperatura - 32) * 5/9 : (temperatura * 9/5) + 32;

        System.out.printf("\n A temperatura convertida é de: %.1f%s", novaTemperatura, unidadeDeMedida);

        scanner.close();

    }
}
