package classes;

public class ClienteExercicio {
	
	//ATRIBUTOS
	public String nome;
	public char sexo;
	public int anoNascimento;
	public char tipo;
	
	//CONSTRUTOR
	public ClienteExercicio (String nome){
		this.nome = nome;
		
		
	}
	
	//SOBRECARGA
	public ClienteExercicio (String nome,char sexo){
		this.nome = nome;
		this.sexo = sexo;		
		
	}
	//SOBRECARGA DO CONSTRUTOR
	public ClienteExercicio (String nome,char sexo, int anoNascimento){
		this.nome = nome;
		this.sexo = sexo;	
		this.anoNascimento = anoNascimento;
		
	}
	
	//M�TODO
	public int idade() {
		
		return (2020 - anoNascimento);
	}
	
}
