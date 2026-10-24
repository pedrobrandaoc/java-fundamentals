package slotmachine;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldoTotal = 100;
        double aposta = 0;
        double pagamento = 0;
        String jogarNovamente = "sim";
        String[] slots;

        while(saldoTotal > 0){
            System.out.println("----- Slot Machine -----");
            System.out.println("❤️ ☀️ 🍀 ⭐ 💵");
            System.out.println("Saldo atual: " + saldoTotal);
            System.out.print("Digite o valor que deseja apostar: ");
            aposta = scanner.nextDouble();
            scanner.nextLine();

            if(aposta > saldoTotal){
                System.out.println("Valor da aposta superior ao valor do seu saldo!");
                break;
            }
            else if(aposta <= 0){
                System.out.println("Valor da aposta deve ser superior a 0!");
                break;
            }

            System.out.println("Rodando slots...");
            slots = rodarSlot();
            mostrarSlot(slots);

            pagamento = pagamento(slots, aposta);
            if(pagamento > 0){
                System.out.printf("Você ganhou R$%.2f!\n", pagamento);
                saldoTotal += pagamento;
            }
            else{
                System.out.printf("Você perdeu: %.2f.\n", aposta);
                saldoTotal -= aposta;
            }

            System.out.print("Deseja jogar novamente? (sim, não)\n");
            jogarNovamente = scanner.nextLine().trim().toLowerCase();

            if (jogarNovamente.equals("não") || jogarNovamente.equals("nao")) {
                break;
            }
        }

        scanner.close();

    }

    static String[] rodarSlot(){

        Random random = new Random();
        String[] simbolos = {"❤️", "☀️", "🍀", "⭐", "💵"};
        String[] rolagem = new String[3];

        for(int i = 0; i < 3; i++ ){
            rolagem[i] = simbolos[random.nextInt(simbolos.length)];
        }

        return rolagem;
    }
    static void mostrarSlot(String[] slots){
        System.out.println("***********");
        System.out.println(" " + String.join("|", slots));
        System.out.println("***********");
    }
    static double pagamento(String[] slots, double aposta){
        if(slots[0].equals(slots[1]) && slots[1].equals(slots[2])){
            return switch(slots[0]){
                case "❤️" -> aposta * 5;
                case "☀️" -> aposta * 10;
                case "🍀" -> aposta * 20;
                case "⭐" -> aposta * 50;
                case "💵" -> aposta * 999;
                default -> 0;
            };
        }
        else {
            return 0;
        }
    }
}
