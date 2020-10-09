package classes;

import java.util.Scanner;

public class Exercicio_6_Do_While_Multiplos_3 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int n, soma = 0, contador = 0, media = 0;
		do 
		{
			
			System.out.print("Digite um número: ");
			n = leia.nextInt();
			
			if(n%3 ==0) 
			{
				contador = contador + 1;
				soma = soma+ n;
				media = soma/contador;
			}
			
		}while(n !=0);		
			
		System.out.printf("A média dos valores digitados que são múltiplos de 3 é: %d",media);
				
		leia.close();
	}
}
