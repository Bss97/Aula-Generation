package POO;

public class Cachorro extends Animal {
	
	private String raça;
	
	public Cachorro(String nome,int idade, String raça) {
		
		super(nome,idade);
		this.raça=raça;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}
	public void imprimirInfo() {
		System.out.println("Nome do cachorro: "+getNome()+"\nIdade: "+getIdade()+" ano(s)"+"\nRaça: "+raça);
	}
	@Override
	public void Som(String somAnimal) {
		System.out.println("\nO som que o cachorro emite latindo é au auu!!");
	}
	public void Correr() {
		System.out.println("O cachorro gosta de correr e brincar!!");	
	}

}
