package classes;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um nome para a Agenda: ");
		String nome = leia.nextLine();
		
		Agenda agenda = new Agenda(nome);
		Contato contatos[] = new Contato[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com as informações do contato " + (i+1));
			Contato c = new Contato();
			
			System.out.println("Entre com o nome: ");
			nome = leia.nextLine();
			c.setNome(nome);
			
			System.out.println("Entre com o telefone: ");
			String telefone = leia.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Entre com o email: ");
			String email = leia.nextLine();
			c.setEmail(email);
			
			
			contatos[i] = c;
			
			
		}
		
		agenda.setContatos(contatos);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
		}
		
		
		
		
		
		
		
		leia.close();
	}

}
