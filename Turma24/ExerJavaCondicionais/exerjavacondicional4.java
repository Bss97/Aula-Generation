package Turma24;

import java.util.Scanner;

public class exerjavacondicional4 {
	
	/*4 - Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
	Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextDouble();
		
		if(num % 2 ==  0) {
			System.out.println("\nEsse n�mero: "+num+" , � par");
			num = Math.sqrt(num);
			System.out.printf("Sua raiz quadrada �: %.1f",num);
		} else {
			System.out.println("\nEsse num�ro: "+num+", � impar");
			num = Math.pow(num, 2);
			System.out.println("Elevado ao quadrado �: "+num);
		}
			
	}

}
