package controller;

import java.util.Scanner;

public class ExemploScanner {
	public static void main(String args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ol� digite seu nome: ") ;
		String s1 = scan.nextLine();
		
		System.out.println("Obrigado " +s1);
	
		System.out.println("Nome da sua Cidade:");
		String s2 = scan.next();
		
		System.out.println("Sua cidade se chama " +s2);
		
		System.out.println("Por favor insira um numero inteiro: ");
		int x = scan.nextInt();
		
		System.out.println("Aqui insira um n�mero inteiro duplo: ");
		double y = scan.nextDouble();
		
        System.out.println("Os n�meros s�o " + x + " e " + y + " e o seu produto � "+ (x * y));

		scan.close();
		
		System.out.println(" Obrigado e volte sempre! ");
		
	}

}
