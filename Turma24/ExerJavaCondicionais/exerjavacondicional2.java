package Turma24;

import java.util.Scanner;

public class exerjavacondicional2 {
	
	//2 - Faça um programa que entre com três números e coloque em ordem crescente.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		n1 = leia.nextInt();
		System.out.println("Digite um segundo número: ");
		n2 = leia.nextInt();
		System.out.println("Digite um terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1 >= n2 && n2 >= n3){
			System.out.println("\nOrdem: "+n3+","+n2+","+n1);
		} else if(n1 >= n3 && n3 >= n2) {
			System.out.println("\nOrdem: "+n2+","+n3+","+n1);
		} else if(n2 >= n1 && n1 >= n3) {
			System.out.println("\nOrdem: "+n3+","+n1+","+n2);
		} else if(n2 >= n3 && n3 >= n1) {
			System.out.println("\nOrdem: "+n1+","+n3+","+n2);
		} else if(n3 >= n1 && n1 >= n2) {
			System.out.println("\nOrdem: "+n2+","+n1+","+n3);
		} else {
			System.out.println("\nOrdem: "+n1+","+n2+","+n3);
		} 
	}

}
