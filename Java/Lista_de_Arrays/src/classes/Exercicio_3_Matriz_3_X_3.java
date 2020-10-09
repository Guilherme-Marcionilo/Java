package classes;

import java.util.Scanner;

public class Exercicio_3_Matriz_3_X_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		
		int x = 0, y = 0, n = 0;
		
		for(x =0; x < 3; x++) 
		{
			for (y=0; y < 3; y++)
			{
				System.out.println("Posição: "+ matriz[x+1][y+1] + " Digite um número:");
				n = leia.nextInt();
			}
		}
		
		
		
		
		
		leia.close();
	}

}
