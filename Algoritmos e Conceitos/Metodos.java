public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int resultadoInterno = adicionarInterno(num1, num2);
        int resultadoExterno = adicionarExterno(num1, num2);
        System.out.println("A adição interna de " + num1 + " e " + num2 + " é " + resultadoInterno);
        System.out.println("A adição externa de " + num1 + " e " + num2 + " é " + resultadoExterno);
    }

    public static int adicionarInterno(int x, int y) {
        return x + y;
    }

    public static int adicionarExterno(int x, int y) {
        Calculadora calc = new Calculadora();
        return calc.adicionar(x, y);
    }
}

class Calculadora {
    public int adicionar(int x, int y) {
        return x + y;
    }
}
