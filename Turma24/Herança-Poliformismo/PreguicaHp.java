package HerançaPoliformismo;

public class PreguicaHp extends AnimalHp {

	private String sono;

	public PreguicaHp (String nome,int idade,String sono) {
	
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
		System.out.println("Quando se sente ameaçada a preguiça emite sons pelas narinas!!");
	}
	public void subirEmArvores() {
		System.out.println("A preguiça adora subir em arvores!!");
	}
	public void imprimirInfo() {
		System.out.println("Nome do bicho-preguiça: "+getNome()+"\nIdade: "+getIdade()+" ano(s)"+"\nDorme de: "
	+sono+" horas");
	}
}
