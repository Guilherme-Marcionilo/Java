package classes;

public class Empregado1 {
	private String nome;
	private int horas;
	private double valorPorHora;
	
	public Empregado1() {
		
	}
	
	public Empregado1(String nome) {
		this.nome = nome;
	}
	public Empregado1(String nome, int horas, double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public double pagamento() {
		return this.horas * this.valorPorHora;
	}
}



