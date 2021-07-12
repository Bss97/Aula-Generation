package Turma24;

import java.util.Scanner;

public class Exer1Laçorepetição {
	
	// 1-Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
			for(int num=1000;num<2000;num++) {
				if(num%11==5) {
					System.out.println(num);
				}
		   }	 
	}
}