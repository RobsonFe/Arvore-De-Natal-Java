import java.util.Scanner;

public class Natal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos montar uma Árvore de Natal?\n");
        System.out.println("Qual o tamanho da sua Árvore? ");
        int tamanho = scanner.nextInt();

        for (int i = 1; i <= tamanho; i++) {

            for (int j = 1; j <= tamanho - i; j++) {
                System.out.print(" ");
            }

            for (int a = 1; a <= i * 2 - 1; a++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < tamanho / 3; i++) {
            for (int j = 0; j < tamanho - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        System.out.println("Feliz Natal!!");

        scanner.close();
    }
}
