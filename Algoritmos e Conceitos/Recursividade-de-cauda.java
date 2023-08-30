public class Main {
    public static void main(String[] args) {
        int m = 2;
        int n = 5;
        int resultado = produtoIntervalo(m, n);
        System.out.println("O produto de todos os números no intervalo [" + m + ", " + n + "] é: " + resultado);
    }

    public static int produtoIntervalo(int m, int n) {
        if (m > n) {
            return 1;
        } else {
            return m * produtoIntervalo(m + 1, n);
        }
    }
}