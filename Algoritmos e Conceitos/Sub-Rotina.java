import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("CALCULADORA - V1");
            System.out.println();
            System.out.println("1- Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Fim do Programa");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            if (opcao != 5) {
                switch (opcao) {
                    case 1 -> rotinaAdicao();
                    case 2 -> rotinaSubtracao();
                    case 3 -> rotinaMultiplicacao();
                    case 4 -> rotinaDivisao();
                    default -> {
                        System.out.println();
                        System.out.println("Opção inválida - Tente novamente");
                        System.out.println();
                    }
                }
            }
        }
        scanner.close();
    }

    public static void rotinaAdicao() {
        double resultado, primeiroValor, segundoValor;
        System.out.println();
        System.out.println("Rotina de Adição");
        System.out.println();
        primeiroValor = lerDouble("Entre o 1º valor: ");
        segundoValor = lerDouble("Entre o 2º valor: ");
        resultado = primeiroValor + segundoValor;
        imprimirResultado(resultado);
    }

    public static void rotinaSubtracao() {
        double resultado, primeiroValor, segundoValor;
        System.out.println();
        System.out.println("Rotina de Subtração");
        System.out.println();
        primeiroValor = lerDouble("Entre o 1º valor: ");
        segundoValor = lerDouble("Entre o 2º valor: ");
        resultado = primeiroValor - segundoValor;
        imprimirResultado(resultado);
    }

    public static void rotinaMultiplicacao() {
        double resultado, primeiroValor, segundoValor;
        System.out.println();
        System.out.println("Rotina de Multiplicação");
        System.out.println();
        primeiroValor = lerDouble("Entre o 1º valor: ");
        segundoValor = lerDouble("Entre o 2º valor: ");
        resultado = primeiroValor * segundoValor;
        imprimirResultado(resultado);
    }

    public static void rotinaDivisao() {
        double resultado, primeiroValor, segundoValor;
        System.out.println();
        System.out.println("Rotina de Divisão");
        System.out.println();
        primeiroValor = lerDouble("Entre o 1º valor: ");
        segundoValor = lerDouble("Entre o 2º valor: ");
        if (segundoValor == 0) {
            System.out.println("O resultado da operação é: ERRO");
            return;
        }
        resultado = primeiroValor / segundoValor;
        imprimirResultado(resultado);
    }

    public static double lerDouble(String mensagem) {
        double valor;
        System.out.print(mensagem);
        valor = scanner.nextDouble();
        return valor;
    }

    public static void imprimirResultado(double resultado) {
        System.out.printf("\nO resultado da operação é: %.2f\n\n", resultado);
    }
}
