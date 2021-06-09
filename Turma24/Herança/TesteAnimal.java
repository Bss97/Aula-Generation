package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro husky = new Cachorro ("Bob",5,"Husky Siberiano");
		husky.imprimirInfo();
		
		Cavalo white = new Cavalo ("Pé de Pano",15,88);
		white.imprimirInfo();
		
		Preguiça sid = new Preguiça ("Sid",12,"15 - 18");
		sid.imprimirInfo();
	}

}