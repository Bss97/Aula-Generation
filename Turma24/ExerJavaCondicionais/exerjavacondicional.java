package Turma24;

import java.util.Scanner;

public class exerjavacondicional {
	
	//1 - Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3,maior;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Digite um segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Digite um terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			maior = n1;
			System.out.println("Esse � o maior numero: "+maior);
			} else if(n2 > n1 && n2 > n3) { 
			maior = n2;
			System.out.println("Esse � o maior numero: "+maior);
			} else {
			maior = n3;
			System.out.println("Esse � o maior numero: "+maior);
			}
	}

}
