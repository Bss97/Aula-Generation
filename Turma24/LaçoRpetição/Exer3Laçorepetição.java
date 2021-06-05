package Turma24;

import java.util.Scanner;

public class Exer3Laçorepetição {
	
	/*3 -Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int idade,total21=0,total50=0;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			while(idade!=-99) {
				System.out.println("Digite sua idade: ");
				idade = leia.nextInt();
				if(idade>=0 && idade<21) {
					total21++;
				}
				else if(idade>50) {
					total50++;
				}	
			}
			System.out.println("Total de pessoas com menos de 21 anos: "+total21);
			System.out.println("Total de pessoas com mais de 50 anos: "+total50);		
	}

}
