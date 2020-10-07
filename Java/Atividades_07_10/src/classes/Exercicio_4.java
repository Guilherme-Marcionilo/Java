package classes;

import java.util.Scanner;

public class Exercicio_4 
{

	public static void main(String[] args)
	{
		int n;		
		Scanner leia = new Scanner(System.in);
		
		System.out.print ("--------   ÍMPAR OU PAR? --------- \n\n");
		System.out.print("Digite um número (inteiro): ");
		n = leia.nextInt();
		
		if (n > 0) {				
			if ((n % 2) == 0) {
				System.out.println("O valor é positivo e PAR");
				System.out.print("A raiz quadrada deste número é: "+ (Math.sqrt(n)));
			}
			else {
				System.out.println("O valor é positivo e ÍMPAR!");
				System.out.print("Este número elevado ao quadrado resulta: "+ (Math.pow(n,2)));
			}
		}
		else if(n < 0) {
			System.out.print("O valor é negativo");
		}
		else {
			System.out.print("Você digitou 0, e é PAR!");
		}
		
		leia.close();

	}
}