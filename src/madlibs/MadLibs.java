package madlibs;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjetivo1;
        String substantivo1;
        String adjetivo2;
        String verbo1;
        String adjetivo3;

        System.out.print("Digite um adjetivo masculino: ");
        adjetivo1 = scanner.nextLine();
        System.out.print("Digite um substantivo masculino: ");
        substantivo1 = scanner.nextLine();
        System.out.print("Digite um adjetivo masculino: ");
        adjetivo2 = scanner.nextLine();
        System.out.print("Digite um verbo no presente contínuo: ");
        verbo1 = scanner.nextLine();
        System.out.print("Digite um adjetivo: ");
        adjetivo3 = scanner.nextLine();

        System.out.println("Hoje eu fui ao zoológico mais " + adjetivo1 + " da cidade.");
        System.out.println("Em exibição, eu vi um " + substantivo1 + ".");
        System.out.println(substantivo1 + " estava " + adjetivo2 + " e " + verbo1 + "!");
        System.out.println("Eu fiquei " + adjetivo3 + "!");

        scanner.close();
    }
}
