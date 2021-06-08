package Turma24;

import java.util.Scanner;

public class Exer2array {
	
	/*2- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,somapar=0,contimpar=0;
		int [] n = new int [6];
		
		Scanner leia = new Scanner(System.in);
		 
		for(i=0;i<n.length;i++) {
			System.out.println("\nDigite um número inteiro: ");
			n[i] = leia.nextInt();
			if(n[i]%2==0) {
				somapar += n[i];
				System.out.println(+n[i]+" é Par");
			} else {
				contimpar++;
				System.out.println(+n[i]+" é ímpar");
			}
		}
		System.out.println("\nSoma dos números pares: "+somapar);
		System.out.println("Quantidade de números ímpares digitados: "+contimpar);
	}
}