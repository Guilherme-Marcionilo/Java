package classes;

import java.util.Scanner;

public class Exercicio_1
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Digite um n�mero (inteiro):  ");
		a = leia.nextInt();
		
		System.out.print("Digite um n�mero (inteiro): ");
		b = leia.nextInt(); 
		
		System.out.print("Digite um n�mero (inteiro): ");
		c = leia.nextInt();
		
		if ((a > b) && (a>c)){
			System.out.print("O maior n�mero �: " + a);
		}	
		else if ((b > a) && (b>c)) {
			System.out.print("O maior n�mero �: " + b);
		}
		else {
			System.out.print("O maior n�mero �: " + c);
		}
		
		
		
		
		leia.close();

	}

}
