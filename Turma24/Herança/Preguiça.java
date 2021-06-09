package POO;

public class Preguiça extends Animal {
	
	private String sono;

	public Preguiça(String nome,int idade,String sono) {
	
		super(nome,idade);
		this.sono=sono;
	}

	public String getSono() {
		return sono;
	}

	public void setSono(String sono) {
		this.sono = sono;
	}
	public void imprimirInfo() {
		System.out.println("\nNome do bicho-preguiça: "+getNome()+"\nIdade: "+getIdade()+" ano(s)"+"\nDorme de: "
	+sono+" horas");
	}
}
