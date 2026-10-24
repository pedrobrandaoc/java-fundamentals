package pedrapapeltesoura;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] pedraPapelTesoura = {"pedra", "papel", "tesoura"};
        String jogarNovamenteString = "sim";

        do{
            String escolhaComputador = pedraPapelTesoura[random.nextInt(3)];
            String escolhaUsuario = "";

            System.out.println("----- Pedra papel ou tesoura -----");
            System.out.print("Digite um item (pedra, papel, tesoura): ");
            escolhaUsuario = scanner.nextLine().trim().toLowerCase();

            if (!escolhaUsuario.equals("pedra") && 
                !escolhaUsuario.equals("papel") &&
                !escolhaUsuario.equals("tesoura")){
                System.out.println("Opção inválida!");
                continue;
            }
            
            System.out.println("Computador: " + escolhaComputador);
            System.out.println("Você: " + escolhaUsuario);
            System.out.println();
            
            if(escolhaUsuario.equals(escolhaComputador)){
                System.out.println("Empate!");
            }
            else if ((escolhaComputador.equals("pedra") && escolhaUsuario.equals("papel")) ||
                    (escolhaComputador.equals("papel") && escolhaUsuario.equals("tesoura")) ||
                    (escolhaComputador.equals("tesoura") && escolhaUsuario.equals("pedra"))){
                System.out.println("Você venceu!");
            }
            else{
                System.out.println("Você perdeu!");
            }

            System.out.print("Deseja jogar novamente? (sim, não)");
            jogarNovamenteString = scanner.nextLine().trim().toLowerCase();

        } while(jogarNovamenteString.equals("sim"));

        scanner.close();

    }
}
