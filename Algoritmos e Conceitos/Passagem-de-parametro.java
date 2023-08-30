import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número natural:");
        int num = scanner.nextInt();
        imprimeDiaDaSemana(num);
    }

    public static void imprimeDiaDaSemana(int num) {
        switch (num) {
            case 1:
                System.out.println("DOM");
                break;
            case 2:
                System.out.println("SEG");
                break;
            case 3:
                System.out.println("TER");
                break;
            case 4:
                System.out.println("QUA");
                break;
            case 5:
                System.out.println("QUI");
                break;
            case 6:
                System.out.println("SEX");
                break;
            case 7:
                System.out.println("SAB");
                break;
            default:
                System.out.println("Erro: o número não corresponde a um dia da semana.");
        }
    }
}