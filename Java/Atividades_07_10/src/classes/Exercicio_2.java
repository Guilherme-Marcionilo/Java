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
		
		if (a <= b && a <= c) {
			if(b <= c) {
				System.out.printf("Em ordem crescente: %d; %d e %d", a, b, c);
			}
			else {
				System.out.printf("Em ordem crescente: %d; %d e %d", a, c, b);
			}
		}
		else if(b <= a && b <= c) {
			if (a <= c) {
				System.out.printf("Em ordem crescente: %d; %d e %d", b, a, c);
			}
			else {
				System.out.printf("Em ordem crescente: %d; %d e %d", b, c, a);
			}
		}
		else if(c <= a && c <= b) {
			if (a <= b) {
				System.out.printf("Em ordem crescente: %d; %d e %d", c, a, b);
			}
			else {
				System.out.printf("Em ordem crescente: %d; %d e %d", c, b, a);
			}
		}
		else {
			System.out.printf("Em ordem crescente: %d; %d e %d", a, b, c);
		}
		
		
		
		leia.close();
	}

}
