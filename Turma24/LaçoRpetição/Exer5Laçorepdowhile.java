package Turma24;

import java.util.Scanner;

public class Exer5La�orepdowhile {
	
	/* 5-Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a 
	 somados n�meros digitados.(DO...WHILE) */
	 
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num,soma=0;
			Scanner leia = new Scanner(System.in);
			
			do { 
				System.out.println("Digite um n�mero:  ");
				num = leia.nextInt();
				soma += num;
				} while(num!=0);
			System.out.println("\nSoma de todos os n�meros �: "+soma);
	}
}
