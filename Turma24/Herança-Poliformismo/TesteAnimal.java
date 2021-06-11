package POO;

import java.util.Scanner;

public class TesteAnimal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro husky = new Cachorro ("Bob",5,"Husky Siberiano");
		husky.imprimirInfo();
		husky.Som(null);
		husky.Correr();
			
		Cavalo white = new Cavalo ("Pé de Pano",15,88);
		white.imprimirInfo();
		white.Som(null);
		white.Correr();

		Preguiça sid = new Preguiça ("Sid",12,"15 - 18");
		sid.imprimirInfo();
		sid.Som(null);
		sid.subirEmArvores();
		
	}
}
