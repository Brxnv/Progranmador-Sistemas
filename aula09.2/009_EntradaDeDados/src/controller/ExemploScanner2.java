package controller;

import java.util.Scanner;

public class ExemploScanner2 {

	public static void main(String []args) {
		String nome;
		System.out.println("Digite seu nome");
		Scanner sc = new Scanner(System.in);
        nome = sc.next();
		System.out.println("Nome digitado " + nome.toUpperCase());
		

		double salario;
		System.out.println("Digite o salario que deseja: ");
		Scanner sc2 = new Scanner(System.in);
		salario = sc2.nextDouble();
		System.out.println("Sal�rio Digitado: " + salario);
		
		sc.close();
		sc2.close();
		
	}
}
