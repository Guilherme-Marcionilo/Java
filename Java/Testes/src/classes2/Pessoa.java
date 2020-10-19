package classes2;

public abstract class Pessoa {
	
	private String nome;
	private int anoNascimento;
	private char sexo;	
	
	
	public Pessoa() {
		
	}
	
	
	public Pessoa(String nome) {
		this.sexo = sexo;
	}
	
	public Pessoa(char sexo) {
		this.sexo = sexo;
	}
	
	public Pessoa(String nome, int anoNascimento, char sexo) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.sexo = sexo;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int idade(int anoAtual) {
		int idade = anoAtual - anoNascimento;		
		return idade;
	}

	public void trocarSexo() {
		// TODO Auto-generated method stub
		
	}
	
	
}
