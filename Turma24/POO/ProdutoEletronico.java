package POO;

import java.text.NumberFormat;

/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida 
crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no 
console.*/

public class ProdutoEletronico {
	private String console;
	private String marca;
	private double valor;
	
	public ProdutoEletronico(String con,String ma,double v) {
		
		this.setConsole(con);
		this.setMarca(ma);
		this.setValor(v);
	}
	public void setConsole(String con) {
		console = con;
	}
	public void setMarca(String ma) {
		marca = ma;
	}
	public void setValor(double v) {
		valor = v;
	}
	public String getConsole() {
		return console;
	}
	public String getMarca() {
		return marca;
	}
	public double getValor() {
		return valor;
	}
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoValor = nf.format(valor);
		return formatoValor;	
	}
	public void imprimirInfo() {
		System.out.println("\nO console "+console+" da marca "+marca+ " custa: "+this.formatarMoeda());
	}
}
