package HerançaPoliformismo;

public class CachorroHp extends AnimalHp {

	private String raça;

	public CachorroHp(String nome, int idade, String raça) {

		super(nome, idade);
		this.raça = raça;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public void imprimirInfo() {
		System.out.println("Nome do cachorro: " + getNome() + "\nIdade: " + getIdade() + " ano(s)" + "\nRaça: " + raça);
	}

	@Override
	public void Som(String somAnimal) {
		System.out.println("O som que o cachorro emite latindo é au auu!!");
	}

	public void Correr() {
		System.out.println("O cachorro gosta de correr e brincar!!");
	}

}
