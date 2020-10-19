package classes;

public class Pessoa {
	private String nome;
	private int matricula;
	private char sexo;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome,int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	
	
	//Encapsulamento
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
