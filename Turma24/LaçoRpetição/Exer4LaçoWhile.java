package Turma24;

import java.util.Scanner;

public class Exer4La�oWhile {
	
	/* 4-Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma 
	 * regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
	 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se 
	 * para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
	o n�mero de pessoas calmas; 
	o n�mero de mulheres nervosas; 
	o n�mero de homens agressivos; 
	o n�mero de outros calmos;
	o n�mero de pessoas nervosas com mais de 40 anos; 
	o n�mero de pessoas calmas com menos de 18 anos.*/

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int idade,sexo,pessoa,Npc=0,Nmn=0,Nha=0,Noc=0,Nn40=0,Nc18=0,cp=0;
		Scanner leia = new Scanner(System.in);
		
		while(cp<5) { 
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();	
			if(idade>1 || idade >100) {
			}
			System.out.println("\nSexo: \n1-Feminino:\n2-Masculino:\n3-Outros: ");
			sexo = leia.nextInt();
			if(sexo<1 || sexo>3) {
			}
			System.out.println("\nA pessoa �: \n1-Calma:\n2-Nervosa:\n3-Agressiva: ");
			pessoa = leia.nextInt();
			if(pessoa<1 || pessoa>3) {
			} 
			if(pessoa==1) {
				Npc++;
			}
			if(sexo==1 && pessoa==2) {
				Nmn++;
			}
			if(sexo==2 && pessoa==3) {
				Nha++;
			}
			if(sexo==3 && pessoa==1) {
				Noc++;
			}
			if(pessoa==2 && idade>40) {
				Nn40++;
			}
			if(pessoa==1 && idade<18) {
				Nc18++;
			}
			cp++;
		}
		System.out.println("\nN�mero de pessoas calmas: "+Npc);
		System.out.println("\nN�mero de mulheres nervosas: "+Nmn);
		System.out.println("\nN�mero de homens agressivos: "+Nha);
		System.out.println("\nN�mero de outros calmas: "+Noc);
		System.out.println("\nN�mero de pessoas nervosas com mais de 40 anos: "+Nn40);
		System.out.println("\nN�mero de pessoas calmas com menos de 18 anos: "+Nc18);

	}

}
