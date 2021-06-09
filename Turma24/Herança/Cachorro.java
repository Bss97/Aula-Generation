package POO;

public class Cachorro extends Animal {
	
	private String ra�a;

	public Cachorro(String nome,int idade, String ra�a) {
		
		super(nome,idade);
		this.ra�a=ra�a;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	public void imprimirInfo() {
		System.out.println("Nome do cachorro: "+getNome()+"\nIdade: "+getIdade()+" ano(s)"+"\nRa�a: "+ra�a);
	}
}
