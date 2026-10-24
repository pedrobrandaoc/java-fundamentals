package jogodedados;

import java.util.Random;
import java.util.Scanner;

public class JogoDeDados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int quantidadeDeDados = 0;
        int total = 0;

        System.out.println("---- Jogo de Dados ----");
        System.out.print("Digite a quantidade de dados que deseja rolar: ");
        quantidadeDeDados = scanner.nextInt();

        if (quantidadeDeDados > 0) {

            for (int i = 1; i <= quantidadeDeDados; i++) {
                int numeroAleatorio = random.nextInt(1, 7);
                System.out.printf("%d° dado: \n", i);
                desenhoDoDado(numeroAleatorio);
                total += numeroAleatorio;
            }

            System.out.println("Valor total: " + total);
        }
        else{
            System.out.println("O número de dados precisa ser maior que 0.");
        }

    }

    static void desenhoDoDado(int valor){
        String dado1 = """
                 ---------
                |         |
                |    ●    |
                |         |
                 ---------
                """;

        String dado2 = """
                 ---------
                | ●       |
                |         |
                |       ● |
                 ---------
                """;

        String dado3 = """
                 ---------
                | ●       |
                |    ●    |
                |       ● |
                 ---------
                """;

        String dado4 = """
                 ---------
                | ●     ● |
                |         |
                | ●     ● |
                 ---------
                """;

        String dado5 = """
                 ---------
                | ●     ● |
                |    ●    |
                | ●     ● |
                 ---------
                """;

        String dado6 = """
                 ---------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 ---------
                """;

        switch(valor){
            case 1 -> System.out.println(dado1);
            case 2 -> System.out.println(dado2);
            case 3 -> System.out.println(dado3);
            case 4 -> System.out.println(dado4);
            case 5 -> System.out.println(dado5);
            case 6 -> System.out.println(dado6);
            default -> System.out.println("sem imagem");
        }
    }
}
