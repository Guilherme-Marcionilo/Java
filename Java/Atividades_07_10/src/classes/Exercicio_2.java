package classes;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Digite um número (inteiro): ");
		a = leia.nextInt();
		
		System.out.print("Digite um número (inteiro): ");
		b = leia.nextInt();
		
		System.out.print("Digite um número (inteiro): ");
		c = leia.nextInt();
		
		if (a < b) {
			if(b < c) {
				System.out.println("Ordem crescente: " + "\n" + a + "\n" + b + "\n"+ c);
			}
			else if (a < c) {
				System.out.println("Ordem crescente: " + "\n" + a + "\n" + c + "\n"+ b);
			}
			else {
				System.out.println("Ordem crescente: " + "\n" + c + "\n" + a + "\n"+ b);
			}
		}
		
		else if (b < c) 
		{
			if (a < c) {
				System.out.println("Ordem crescente: " + "\n" + b + "\n" + a + "\n"+ c);
			}
			else {
				System.out.println("Ordem crescente: " + "\n" + b + "\n" + c + "\n"+ a);
			}
		}
		
		else {
			System.out.println("Ordem crescente: " + "\n" + c + "\n" + b + "\n"+ a);
		}
		
		
		
		
		leia.close();
	}

}
