package POO;

public class ProdutoEletronicoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProdutoEletronico videogame1 = new ProdutoEletronico ("Ps4", "sony", 3000);
		videogame1.imprimirInfo();
		
		ProdutoEletronico videogame2 = new ProdutoEletronico ("Xbox One", "microsoft", 2500);
		videogame2.imprimirInfo();
	}

}
