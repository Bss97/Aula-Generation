package POO;

public class ClienteMain {
	public static void main(String args[]) {
		Cliente cliente1 = new Cliente("Sarah", "Cristyna", "Amaral", 21);
		System.out.println(cliente1.getNomeCompleto());

		Cliente cliente2 = new Cliente("\nBruce", "Wayne", "Silva", 19);
		System.out.println(cliente2.getNomeCompleto());
	}
}
