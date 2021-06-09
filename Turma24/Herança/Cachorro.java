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
}
