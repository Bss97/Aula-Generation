package Turma24;

import java.util.Scanner;

public class Exer2array {
	
	/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,somapar=0,contimpar=0;
		int [] n = new int [6];
		
		Scanner leia = new Scanner(System.in);
		 
		for(i=0;i<n.length;i++) {
			System.out.println("\nDigite um n�mero inteiro: ");
			n[i] = leia.nextInt();
			if(n[i]%2==0) {
				somapar += n[i];
				System.out.println(+n[i]+" � Par");
			} else {
				contimpar++;
				System.out.println(+n[i]+" � �mpar");
			}
		}
		System.out.println("\nSoma dos n�meros pares: "+somapar);
		System.out.println("Quantidade de n�meros �mpares digitados: "+contimpar);
	}
}