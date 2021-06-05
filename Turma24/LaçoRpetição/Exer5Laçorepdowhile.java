package Turma24;

import java.util.Scanner;

public class Exer5Laçorepdowhile {
	
	/* 5-Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a 
	 somados números digitados.(DO...WHILE) */
	 
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num,soma=0;
			Scanner leia = new Scanner(System.in);
			
			do { 
				System.out.println("Digite um número:  ");
				num = leia.nextInt();
				soma += num;
				} while(num!=0);
			System.out.println("\nSoma de todos os números é: "+soma);
	}
}
