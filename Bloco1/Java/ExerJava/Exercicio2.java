package Turma24;

import java.util.Scanner;

public class Exercicio2 {
	
	//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,meses,dias,anos;

		Scanner leia = new Scanner (System.in);
				
		System.out.println("\nSua idade em dias: ");
		dias = leia.nextInt();
				
		anos = dias/365;
		System.out.println("\nAnos: "+anos);
			
		meses = (dias%365)/30;
		System.out.println("\nMeses: "+meses);
				
		dias = (dias%365)%30;
		System.out.println("\nDias: "+dias);
				
		}

}
	
	