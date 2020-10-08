package classes;

import java.util.Scanner;



public class Exercicio_2_10Numeros_Par_Impar{ 

	
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in); 
		
		int par=0,impar = 0,n = 0, contador=0;
	
		
		for(contador=0; contador<=10;contador++){
			System.out.println("Digite um número de 1 a 10");
			n=leia.nextInt();
		
			if(n % 2 == 0) 
			{
				
				par++;
				
			} 	
			else 
			{
				
				impar++;
				
			}
			
		}	
		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de ímpares: " + par);
		leia.close();

}

}
