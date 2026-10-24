package carrinhodecompras;

import java.util.Scanner;

public class CarrinhoDeCompras {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String produto;
    double preco;
    String moeda = "R$";
    int quantidade;
    double total;

    System.out.print("Digite o nome do item que você deseja comprar: ");
    produto = scanner.nextLine();
    System.out.print("Digite o valor deste produto: ");
    preco = scanner.nextDouble();
    System.out.print("Digite a quantidade de " + produto + " você quer: ");
    quantidade = scanner.nextInt();

    total = preco * quantidade;

    System.out.printf("Você comprou " + quantidade + " " + produto + "(s)\n");
    System.out.printf("O valor total foi de: %s%.2f.", moeda, total);

    scanner.close();

    }
}
