import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] contador = new int[2];
        for (int i = 0; i < 9; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            int linha = numero % 2;
            if (contador[linha] < 3) {
                matriz[linha][contador[linha]] = numero;
                contador[linha]++;
            } else {
                System.out.println("Não há mais espaço para armazenar um número " + (linha == 0 ? "par" : "ímpar"));
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
