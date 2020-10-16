package classes;

import java.util.Scanner;

public class Loja
{
	public static void main(String[] args) {
	//CRIANDO OBJETO
	Scanner leia = new Scanner(System.in);
	
	Pessoa cliente1 = new Pessoa("Oi",2015,'M');
	Pessoa cliente2 = new Pessoa("Oi",2020,'F');
	
	System.out.println(cliente1.getNome());
	
	System.out.println(cliente2.getNome());
	
	
	
	
	
	
	
	
	
	leia.close();
	}

	
}
