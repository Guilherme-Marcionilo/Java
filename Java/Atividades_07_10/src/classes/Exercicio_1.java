package classes;

import java.util.Scanner;

public class Exercicio_1
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Digite um número (inteiro):  ");
		a = leia.nextInt();
		
		System.out.print("Digite um número (inteiro): ");
		b = leia.nextInt(); 
		
		System.out.print("Digite um número (inteiro): ");
		c = leia.nextInt();
		
		if ((a > b) && (a>c)){
			System.out.print("O maior número é: " + a);
		}	
		else if ((b > a) && (b>c)) {
			System.out.print("O maior número é: " + b);
		}
		else {
			System.out.print("O maior número é: " + c);
		}
		
		
		
		
		leia.close();

	}

}
