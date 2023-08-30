import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String anterior = "";
        String atual;
        int contador = 0;
        int maiorTamanho = 0;
        StringBuilder concatenacao = new StringBuilder();
        do {
            System.out.print("Digite uma string: ");
            atual = scanner.nextLine();
            contador++;
            if (atual.length() > maiorTamanho) {
                maiorTamanho = atual.length();
            }
            concatenacao.append(atual);
            if (atual.equals(anterior)) {
                break;
            }
            anterior = atual;
        } while (true);
        concatenacao.setLength(concatenacao.length() - atual.length());
        System.out.println("Número de strings lidas: " + contador);
        System.out.println("Tamanho da maior string lida: " + maiorTamanho);
        System.out.println("Concatenação de todas as strings lidas exceto a última: " + concatenacao.toString());
    }
}
