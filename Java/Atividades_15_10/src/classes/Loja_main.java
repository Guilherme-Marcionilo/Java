package classes;


import java.util.Scanner;

public class Loja_main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ClienteExercicio cliente1 = new ClienteExercicio("Gui");
		ClienteExercicio cliente2 = new ClienteExercicio("Dev",'M');
		ClienteExercicio cliente3 = new ClienteExercicio("Java",'M',2002);
		
		System.out.println("Digite o nome usuário: ");
		cliente1.nome = leia.next();
		System.out.println("Digite o seu ano de nascimento: ");
		cliente2.anoNascimento = leia.nextInt();
		
		
		System.out.println(cliente2.idade() + " " + cliente1.nome + " " + cliente1.sexo);
		
		
		
		
		leia.close();

	}

}
