package classes;
import java.util.Scanner;


public class Classe_Professores {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Professor primeiro = new Professor();
		Aluno alunos = new Aluno();
		char info;
		
		System.out.print("Digite o nome:");
		primeiro.nome = leia.next().toUpperCase();
		System.out.print("Digite o sexo M-masculino, F-feminino ou O-outros:");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite a especialidade do professor: ");
		primeiro.especialidade = leia.next().toUpperCase();
		System.out.print("Digite o ano de nascimento do professor:");
		primeiro.anoNascimento = leia.nextInt();
		System.out.print("O professor é F-fixo ou C-convidado :");
		info = leia.next().toUpperCase().charAt(0);
		if (info == 'C') {
			primeiro.convidado = true;
			
		} else {
			primeiro.convidado = false;
		}
		
		System.out.println("DADOS DO PRIMEIRO PROFESSOR:");
		System.out.println("Nome: " +primeiro.nome);
		System.out.print("Sexo: ");
		System.out.println((primeiro.sexo=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros");
		System.out.println("Idade: "+(2020-primeiro.anoNascimento));
		
		
		System.out.println("\n\nDigite o seu nome: ");
		alunos.nome = leia.next();
		
		System.out.print("Digite o sexo M-masculino, F-feminino ou O-outros:");
		alunos.sexo = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Digite o curso: ");
		alunos.curso = leia.next();
		
		
		if (alunos.nota < 5) {
			System.out.println("\nVocê foi reprovado.");
		}
		else {
			System.out.println("\nVocê foi aprovado");
		}
		
		System.out.println("Curso: " + alunos.curso);
				
		System.out.println((primeiro.sexo=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros");
		
		
		leia.close();
		
	}
}