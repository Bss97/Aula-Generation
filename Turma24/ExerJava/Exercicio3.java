package Turma24;

import java.util.Scanner;

public class Exercicio3 {
	
	//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, 
	//minutos e segundos.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seg,hr,min,segundos;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Qual a dura��o do evento em segundos: ");
		seg = leia.nextInt();
		
		hr = seg/3600;
		min = (seg%3600)/60;
		segundos = (seg%3600)%60;
		
		System.out.println("\nO evento durou: "+hr+"hr e "+min+"min e "+segundos+"seg.");
	}

}
