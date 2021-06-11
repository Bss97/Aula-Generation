package POO;

public class Pregui�a extends Animal {
	
	private String sono;

	public Pregui�a(String nome,int idade,String sono) {
	
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
		System.out.println("\nNome do bicho-pregui�a: "+getNome()+"\nIdade: "+getIdade()+" ano(s)"+"\nDorme de: "
	+sono+" horas");
	}
}
