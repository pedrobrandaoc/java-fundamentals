package quiz;

import java.util.Scanner;

public class Quiz {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        String[] questoes = {"Qual a capital do Brasil?",
                            "Quantas letras tem no alfabeto?",
                            "Quanto é 5 + 2 x 2 - 2?",
                            "Qual das seguintes cores não está na bandeira dos Estados Unidos?",
                            "Quem é o personagem de The Office que se deu uma caneca de 'WORLD'S BEST BOSS'?"};

        String[][] todasOpcoes = {{"1. Maranhão", "2. Minas Gerais", "3. Brasília", "4. São Paulo"},
                            {"1. 25", "2. 26", "3. 27", "4. 28"},
                            {"1. 18", "2. 7", "3. 9", "4. 0"},
                            {"1. Vermelho", "2. Branco", "3. Amarelo", "4. Azul"},
                            {"1. Michael Scott", "2. Dwight Schrute", "3. Jim Halpert", "4. Pam Beesly"}};

        int[] respostas = {3, 2, 2, 3, 1};

        int acertos = 0;
        int totalQuestoes = questoes.length;

        System.out.println("----- Quiz -----");

        for(int i = 0; i < questoes.length; i++ ){
            int chute = 0;

            // enunciado
            System.out.printf("Questão %d: %s\n", i, questoes[i]);

            // opções
            for(String opcao : todasOpcoes[i]){
                System.out.println(opcao);
            }

            // resposta
            System.out.print("Digite a opção que determina a resposta (1-4): ");
            chute = scanner.nextInt();

            if(chute > 0 && chute < 5){
                if(chute == respostas[i]){
                    System.out.println("Você acertou!");
                    acertos += 1;
                }
                else{
                    System.out.println("Você errou.");
                }
            }
            else{
                System.out.println("Opcao inválida!");
            }

        }

        System.out.printf("Você acertou %d de %d!", acertos, totalQuestoes);

    }
}
