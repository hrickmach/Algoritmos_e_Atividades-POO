package application;

import java.util.Scanner;

import entities.Aviao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String modelo, fabricante, companhia;
		int qtPassageiros, preco;
		
		System.out.println("digite o modelo do avi�o: ");
		modelo = sc.next();
		System.out.println("digite o fabricante do avi�o: ");
		fabricante = sc.next();
		System.out.println("digite a companhia do avi�o: ");
		companhia = sc.next();
		System.out.println("digite a quantidade de passageiros do avi�o: ");
		qtPassageiros = sc.nextInt();
		System.out.println("digite o pre�o do avi�o: ");
		preco = sc.nextInt();
		
		Aviao aviao = new Aviao(modelo, fabricante, companhia, qtPassageiros, preco);
		System.out.println(aviao.toString());
		
		sc.close();

	}

}