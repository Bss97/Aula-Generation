package Turma24;

import java.util.Scanner;

public class Exer2Laçorepetição {
	
	// 2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,contpar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=1;x<=10;x++) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num%2==0) {
				contpar++;	
			} else {
				contimpar++;	
			}
		}	
			System.out.println("\nQuantidade dos números pares: "+contpar);
			System.out.println("\nQuantidade dos números ímpares: "+contimpar);
	}
}
