package Turma24;

import java.util.Scanner;

public class exerjavacondicional2 {
	
	//2 - Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Digite um segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Digite um terceiro n�mero: ");
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
