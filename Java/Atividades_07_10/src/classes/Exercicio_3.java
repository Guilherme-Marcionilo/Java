package classes;

import java.util.Scanner;

public class Exercicio_3 
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >=10 && idade <=14) 
		{
			System.out.printf("Sua idade é %d . Sua categoria é Infantil",idade);
		}
		else if (idade >=15 && idade <= 17)
		{
			System.out.printf("Sua idade é %d . Sua categoria é Juvenil",idade);
		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.printf("Sua idade é %d . Sua categoria é Adulto",idade);
		}
		else 
		{
			System.out.print("Valor inválido! Fim do programa.");
		}
	
		
		leia.close();

	}

}
