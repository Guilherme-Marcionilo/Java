package classes;

public class Exercicio_1_Mudando_Posicao_Vetor
{

	public static void main(String[] args)
	{
		int A[] = {1, 0, 5, -2, -5, 7}; 
		
		int soma = 0, modifica = 0;
		
		soma = (A[0] + A[1] + A[5]);
		
		modifica = (A[4] = 100);
		
		System.out.println("----------- VETORES -----------");
		for (int x = 0; x < A.length; x++)
		{
			System.out.println(A[x] + "\n");
		}
		
		System.out.printf("A soma entre os valores das posições A[0], A[1] e A[5] é:  %d",soma);
		
		
		

	}

}
