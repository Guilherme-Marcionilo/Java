package classes;

import java.util.Scanner;

public class Exercicio_4 
{

	public static void main(String[] args)
	{
		int n;		
		Scanner leia = new Scanner(System.in);
		
		System.out.print ("--------   �MPAR OU PAR? --------- \n\n");
		System.out.print("Digite um n�mero (inteiro): ");
		n = leia.nextInt();
		
		if (n > 0) {				
			if ((n % 2) == 0) {
				System.out.println("O valor � positivo e PAR");
				System.out.print("A raiz quadrada deste n�mero �: "+ (Math.sqrt(n)));
			}
			else {
				System.out.println("O valor � positivo e �MPAR!");
				System.out.print("Este n�mero elevado ao quadrado resulta: "+ (Math.pow(n,2)));
			}
		}
		else if(n < 0) {
			System.out.print("O valor � negativo");
		}
		else {
			System.out.print("Voc� digitou 0, e � PAR!");
		}
		
		leia.close();

	}
}