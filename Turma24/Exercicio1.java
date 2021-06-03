package Turma24;

import java.util.Scanner;

public class Exercicio1 {
	
	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anos,meses,dias,totalDias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a sua idade: ");
		anos = leia.nextInt();
		
		System.out.println("\nDigite a sua idade em meses: ");
		meses = leia.nextInt();
		
		System.out.println("\nDigite a sua idade em dias: ");
		dias = leia.nextInt();
		
		totalDias = anos * 365 + meses * 30 + dias;
		System.out.println("\nTotal de dias: "+totalDias);
	}
}











