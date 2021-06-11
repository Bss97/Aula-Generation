package HerançaPoliformismo;

public abstract class AnimalHp {


		private String nome;
		private int idade;
		abstract public void Som(String somAnimal);

		public AnimalHp(String nome, int idade) {
			super();
			this.nome = nome;
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;	
	}
}
