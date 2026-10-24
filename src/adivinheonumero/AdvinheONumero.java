package adivinheonumero;

import java.util.Random;
import java.util.Scanner;

public class AdvinheONumero {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroChute;
        int tentativas = 0;
        int numeroCorreto = random.nextInt(1, 100);

        System.out.println("---- Advinhe o número ----");
        System.out.print("Digite um número de 1 a 100: ");

        do{
            numeroChute = scanner.nextInt();

            if (numeroChute > numeroCorreto){
                System.out.println("Errou! O número é menor do que " + numeroChute);
                tentativas++;
            }
            else if(numeroChute < numeroCorreto){
                System.out.println("Errou! O número é maior do que " + numeroChute);
                tentativas++;
            }

        } while(numeroChute != numeroCorreto);

        System.out.println("Acertou! O número era: " + numeroChute);
        System.out.println("Número de tentativas: " + tentativas);

        scanner.close();

    }
}
