package classes;

import java.util.Scanner;

public class Exercicio_5_Do_While_0_Encerra {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n,contador = 0;
		
		do 	{
				System.out.println("Digite um n�mero: ");
				n = leia.nextInt();
				contador = contador + n;				
			
			} while(n != 0);		
		
		System.out.printf("A soma dos valores digitados �: %d",contador);
				
		leia.close();

	}

}
