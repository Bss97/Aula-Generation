package Heran�aPoliformismo;

public class CachorroHp extends AnimalHp {

	private String ra�a;

	public CachorroHp(String nome, int idade, String ra�a) {

		super(nome, idade);
		this.ra�a = ra�a;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public void imprimirInfo() {
		System.out.println("Nome do cachorro: " + getNome() + "\nIdade: " + getIdade() + " ano(s)" + "\nRa�a: " + ra�a);
	}

	@Override
	public void Som(String somAnimal) {
		System.out.println("O som que o cachorro emite latindo � au auu!!");
	}

	public void Correr() {
		System.out.println("O cachorro gosta de correr e brincar!!");
	}

}
