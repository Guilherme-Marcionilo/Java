package classes;

import java.util.Scanner;

public class Exercicio_2_10Numeros_Par_Impar {

	public static void main(String[] args) {
		int n;		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print ("--------   �MPAR OU PAR? --------- \n\n");
		System.out.print("Digite um n�mero (inteiro): ");
		n = leia.nextInt();
		for(int x = 0; x <= 10; x++) 
		{
			if (n > 0) {				
				if ((n % 2) == 0) {
					System.out.print("O valor � positivo e PAR");
				}
				else {
					System.out.print("O valor � positivo e �MPAR!");
				}
			}
			else if(n < 0) {
				System.out.print("O valor � negativo");
			}
			else {
				System.out.print("Voc� digitou 0, e � PAR!");
			}
		}
		
		leia.close();

	}

}
