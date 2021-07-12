package HerançaPoliformismo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDados {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> estoque = new ArrayList<String> ();
		estoque.add("Dodge70");
		estoque.add("Mustang69");
		estoque.add("Ferrari812");
		estoque.add("Porsche911");
		
		for(String lista:estoque) {
			System.out.println(lista);
		}
		System.out.println("\nInfelizmente temos que remover um carro da sua coleção...");
		System.out.println();
		estoque.remove("Ferrari812");
		
		System.out.println("Agora o seu estoque ficou assim: "+estoque);
	}
}
