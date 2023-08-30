import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class Aluno {
            String nome;
            int idade;
            double nota;
        }

        Aluno[] alunos = new Aluno[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i].nome = scanner.nextLine();
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            alunos[i].idade = scanner.nextInt();
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            alunos[i].nota = scanner.nextDouble();
            scanner.nextLine();
        }
        scanner.close();

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Nome: " + alunos[i].nome);
            System.out.println("Idade: " + alunos[i].idade);
            System.out.println("Nota: " + alunos[i].nota);
            System.out.println();
        }
    }
}
