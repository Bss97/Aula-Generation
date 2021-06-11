package POO;

public class Cavalo extends Animal {
	
	private int velocidade;
	
	public Cavalo(String nome,int idade,int vel) {
		
		super(nome,idade);
		this.velocidade=vel;
	}
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int vel) {
		this.velocidade = vel;
	}
	public void imprimirInfo() {
		System.out.println("\nNome do cavalo: "+getNome()+"\nIdade: "+getIdade()+" ano(s)"+"\nVelociade: "
	+velocidade+" km/h");
	}
}
