package HerançaPoliformismo;

import java.util.Scanner;

public class TesteAnimalHp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		CachorroHp husky = new CachorroHp ("Bob",5,"Husky Siberiano");
		husky.imprimirInfo();
		husky.Som(null);
		husky.Correr();
		System.out.println("---------------------------------------------------------");
		
		CavaloHp white = new CavaloHp ("Pé de Pano",15,88);
		white.imprimirInfo();
		white.Som(null);
		white.Correr();
		System.out.println("---------------------------------------------------------");
		
		PreguicaHp sid = new PreguicaHp ("Sid",12,"15 - 18");
		sid.imprimirInfo();
		sid.Som(null);
		sid.subirEmArvores();
		
	}

}
