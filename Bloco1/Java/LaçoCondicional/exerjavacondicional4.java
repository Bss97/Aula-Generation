package Turma24;

import java.util.Scanner;

public class exerjavacondicional4 {
	
	/*4 - Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
	Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextDouble();
		
		if(num % 2 ==  0) {
			System.out.println("\nEsse número: "+num+" , é par");
			num = Math.sqrt(num);
			System.out.printf("Sua raiz quadrada é: %.1f",num);
		} else {
			System.out.println("\nEsse numéro: "+num+", é impar");
			num = Math.pow(num, 2);
			System.out.println("Elevado ao quadrado é: "+num);
		}
			
	}

}
