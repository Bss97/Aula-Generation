package HerançaPoliformismo;

public class CavaloHp extends AnimalHp {

private int velocidademax;
	
	public CavaloHp(String nome,int idade,int vel) {
		
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
		System.out.println("Nome do cavalo: "+getNome()+"\nIdade: "+getIdade()+" ano(s)"+"\nVelociade máxima: "
	+velocidademax+" km/h");
	}
	@Override
	public void Som(String somAnimal) {
		System.out.println("O cavalo se comunica relinchando");
	}
	public void Correr() {
		System.out.println("O cavalo gosta de correr!!");
	}
}
