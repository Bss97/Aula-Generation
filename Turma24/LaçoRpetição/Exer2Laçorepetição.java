package Turma24;

import java.util.Scanner;

public class Exer2La�orepeti��o {
	
	// 2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,contpar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=1;x<=10;x++) {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			if(num%2==0) {
				contpar++;	
			} else {
				contimpar++;	
			}
		}	
			System.out.println("\nQuantidade dos n�meros pares: "+contpar);
			System.out.println("\nQuantidade dos n�meros �mpares: "+contimpar);
	}
}
