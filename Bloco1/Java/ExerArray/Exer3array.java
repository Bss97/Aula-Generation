package Turma24;

import java.util.Scanner;

public class Exer3array {

	//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num = new int[3][3];
		int vmaior10=0,l,c;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.println("Digite um número: ");
				num[l][c] = leia.nextInt();
				if(num[l][c]>10) {
				vmaior10++;
				}
			} 
		}
		System.out.println("\nOs valores maiores que 10 são: "+vmaior10);
	}
}
