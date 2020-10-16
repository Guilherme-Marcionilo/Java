package classes;

//Abstract
public abstract class Animal {
	private String nome;
	private int idade;
	
		
	//Get e setters
	public  String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// Método
	public String emitirSom () {
		return "Silêncio: ";
	}
	
	
	
	
	
	
}
