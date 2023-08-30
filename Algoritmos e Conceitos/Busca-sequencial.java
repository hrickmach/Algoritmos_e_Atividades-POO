import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.println("Digite os números da lista (digite -999 para parar):");
        int num = scanner.nextInt();
        while (num != -999) {
            lista.add(num);
            num = scanner.nextInt();
        }
        System.out.println("Digite o número a ser procurado na lista:");
        int procurado = scanner.nextInt();
        int posicao = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == procurado) {
                posicao = i;
                break;
            }
        }
        if (posicao == -1) {
            System.out.println("O número não foi encontrado na lista.");
        } else {
            System.out.println("O número foi encontrado na posição " + posicao + " da lista.");
        }
    }
}
