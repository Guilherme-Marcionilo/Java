package classes;

import java.util.Scanner;

public class Exercicio_3_While_Idade 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int  mais50 =0, menos21 =0, idade =0;		
		
		while(idade != -99) 
		{
			System.out.println("Digite sua idade: (Digite -99 para sair)");
			idade = leia.nextInt();
			if(idade> 50)
			{
				mais50++;
			}else if(idade < 21 && idade > 0)
			{
				menos21++;
			}
			
		}
		
		System.out.printf("\nAo total foram %d pessoas com menos de 21 anos e %d pessoas com mais de 50 anos", menos21, mais50);
		
		
		leia.close();
	}

}
