package Turma24;

import java.util.Scanner;

public class Exer6La�odowhile {
	
	/* 6-Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros 
	  m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE) */

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int num,cont=0,soma=0;
			float media;
			Scanner leia = new Scanner(System.in);
			  do {  
				  System.out.println("Insira um n�mero ou digite zero(0) para sair: ");
			  		num = leia.nextInt();
				  if(num!=0 && num%3==0) {
					  soma += num;
					  cont++;
			      }
				 } while(num!=0);
			  		media = soma / cont;
			  		System.out.printf("\nA m�dia dos n�meros m�ltiplos de 3: %.1f",media);
		}
}
