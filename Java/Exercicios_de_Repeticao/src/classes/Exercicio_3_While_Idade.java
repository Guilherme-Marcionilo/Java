package classes;

import java.util.Scanner;

public class Exercicio_3_While_Idade 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int idade = 1,x = 0,y = 0;
		
		while(idade != 99) 
		{
			 if(idade<21) x++;
             if(idade>50) y++;
             
             System.out.print("\n Digite a idade da pessoa (para Sair digite -99) : ");
             idade = leia.nextInt();
             System.out.printf("%d",idade);
		}
		System.out.printf("\n Total com menos de 21 anos:%d",x);
		
		System.out.printf("\n Total com mais de 50 anos E:%d",y);
		
		
		leia.close();
	}

}
