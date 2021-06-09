package POO;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie 
um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
*/
public class Cliente {
	private String primeiroNome;
	private String nomeDoMeio;
	private String ultimoNome;
	private int idade;

	public Cliente(String primeiro, String meio, String ultimo, int idade) {

		this.primeiroNome = primeiro;
		this.nomeDoMeio = meio;
		this.ultimoNome = ultimo;
		this.idade = idade;
	}

	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + nomeDoMeio + " " + ultimoNome + " " + idade;
		return nomeCompleto;
	}
}
