package classes2;

public class Aluno extends Pessoa {
	private int matricula;
	private double notaFinal;
	
	public Aluno(String nome, int anoNascimento, char sexo, int matricula, double notaFinal) {
		super(nome, anoNascimento, sexo);
		this.matricula = matricula;
		this.notaFinal = notaFinal;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
	public void trocarSexo() {
		if(super.getSexo() == 'M') {
			
		}
		
	}
	
}
