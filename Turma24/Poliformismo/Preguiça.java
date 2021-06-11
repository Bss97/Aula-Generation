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
	@Override
	public void Som(String somAnimal) {
		System.out.println("\nQuando se sente amea�ada a pregui�a emite sons pelas narinas!!");
	}
	public void subirEmArvores() {
		System.out.println("A pregui�a adora subir em arvores!!");
	}
	public void imprimirInfo() {
		System.out.println("\nNome do bicho-pregui�a: "+getNome()+"\nIdade: "+getIdade()+" ano(s)"+"\nDorme de: "
	+sono+" horas");
	}
}
