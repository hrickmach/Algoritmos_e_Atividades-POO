package application;

import java.util.Scanner;

import entities.Conta;

public class Programa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Conta conta = new Conta(numero, cpf, ativo);

		int numero, opConta, opMovimentacao;
		String cpf;
		boolean ativo;
		double saque, deposito;

		System.out.println("Digite o numero da conta:");
		numero = leia.nextInt();

		leia.nextLine();
		System.out.println("Digite o seu cpf:");
		cpf = leia.nextLine();

		System.out.println("A conta: 1-ativada 2-desativada ");
		opConta = leia.nextInt();

		while (true) {

			if (opConta == 1 || opConta == 2) {
				break;
			} else {
				System.out.println("escolha uma opcão: 1-ativada 2-desativada ");
				opConta = leia.nextInt();
			}
		}

		if (opConta == 1) {
			ativo = true;
		} else {
			ativo = false;
		}

		Conta conta = new Conta(numero, cpf, ativo);

		System.out.println("Você tem " + conta.getSaldo());
		System.out.println("Você pretende: 1-sacar 2-depositar ");
		opMovimentacao = leia.nextInt();
		
		while (true) {

			if (opMovimentacao == 1 || opMovimentacao == 2) {
				break;
			} else {
				System.out.println("escolha uma opcão: 1-sacar 2-depositar ");
				opMovimentacao = leia.nextInt();
			}
		}
		if (opMovimentacao == 1) {
			System.out.println("Quanto você deseja sacar: ");
			saque = leia.nextDouble();

			System.out.println("Novo saldo é: " + conta.sacar(saque));

		} else {
			System.out.println("Quanto você deseja depositar: ");
			deposito = leia.nextDouble();

			System.out.println("Novo saldo é: " + conta.deposito(deposito));
		}
		
		

		
		
		System.out.println(conta.toString());
		
		
		leia.close();

	}


		
	}

