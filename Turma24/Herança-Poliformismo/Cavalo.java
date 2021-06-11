package POO;

public class Cavalo extends Animal {
	
	private int velocidademax;
	
	public Cavalo(String nome,int idade,int vel) {
		
		super(nome,idade);
		this.velocidademax=vel;
	}
	public int getVelocidade() {
		return velocidademax;
	}

	public void setVelocidade(int vel) {
		this.velocidademax = vel;
	}
	public void imprimirInfo() {
		System.out.println("\nNome do cavalo: "+getNome()+"\nIdade: "+getIdade()+" ano(s)"+"\nVelociade máxima: "
	+velocidademax+" km/h");
	}
	@Override
	public void Som(String somAnimal) {
		System.out.println("\nO cavalo se comunica relinchando");
	}
	public void Correr() {
		System.out.println("O cavalo gosta de correr!!");
	}
}
