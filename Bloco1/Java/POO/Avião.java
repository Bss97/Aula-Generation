package POO;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o,
defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/

public class Avi�o {
	private String modelo;
	private String ciaAerea;
	private int quantidadeDePassageiros;

	public Avi�o(String modelo, String linha, int passageiros) {

		this.modelo = modelo;
		this.ciaAerea = linha;
		this.quantidadeDePassageiros = passageiros;

	}

	public void imprimirInfo() {
		System.out.println("\nO voo com o modelo " + modelo + ",da linha " + ciaAerea + ",tem a capacidade de "
				+ quantidadeDePassageiros + " passageiros");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCiaAerea() {
		return ciaAerea;
	}

	public void setCiaAerea(String ciaAerea) {
		this.ciaAerea = ciaAerea;
	}

	public int getQuantidadeDePassageiros() {
		return quantidadeDePassageiros;
	}

	public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
		this.quantidadeDePassageiros = quantidadeDePassageiros;
	}
}
