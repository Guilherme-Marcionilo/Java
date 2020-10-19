package ExCursoLoiane;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso: ");
		String nome = leia.nextLine();
		
		System.out.println("Digite o horário do curso: ");
		String horario = leia.nextLine();
		
		System.out.println("Digite o nome do professor: ");
		String nomeProf = leia.nextLine();
		
		System.out.println("Digite o departamento do professor: ");
		String depProf = leia.nextLine();
		
		System.out.println("Digite o email do professor: ");
		String emailProf = leia.nextLine();
		
		Curso curso = new Curso();
		
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		
		
		curso.setProfessor(professor);
		
		System.out.println("------ Alunos ------");
		
		Aluno[] alunos = new Aluno[5];
		
		for(int i = 0; i<5; i++) {
			
			leia.nextLine();
			
			
			System.out.println("Digite o nome do aluno " + (i+1));
			String nomeAluno = leia.nextLine();
			
			System.out.println("Digite a matrícula do aluno: ");
			String matAluno = leia.nextLine();
			
			double[] notas = new double[4];
			
			for (int j=0; j < 4; j++) {
				System.out.println("Digite a nota " + (j+1));
				notas[j] = leia.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas); 
			
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
		

	}

}

