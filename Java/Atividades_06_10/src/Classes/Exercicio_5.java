package Classes;

import java.util.Scanner;

public class Exercicio_5 
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double nota1,nota2,nota3,media;

		System.out.print("Digite a sua primeira nota: ");	
		nota1 = leia.nextDouble();
		System.out.print("Digite a sua segunda nota: ");	
		nota2 = leia.nextDouble();
		System.out.print("Digite a sua terceira nota: ");	
		nota3 = leia.nextDouble();

		
		media = ((nota1*2) + (nota2*3) + (nota3*5)/10);
		System.out.print("Sua média final foi a seguinte: ");
		System.out.print(media);
				
		leia.close();
				
		
	}

}
