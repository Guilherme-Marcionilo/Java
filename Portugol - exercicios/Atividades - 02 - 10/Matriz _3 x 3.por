programa
{
	inclua biblioteca Util --> U
	
	funcao inicio()
	{
		inteiro vetor[3]= {U.sorteia(1, 10),U.sorteia(1, 10),U.sorteia(1, 10)}
		const inteiro LIMITE = 3
		/*{U.sorteia(1, 10),U.sorteia(1, 10),U.sorteia(1, 10)},
		  {U.sorteia(1, 10),U.sorteia(1, 10),U.sorteia(1, 10)},
		  {U.sorteia(1, 10),U.sorteia(1, 10),U.sorteia(1, 10)}*/
		  
		inteiro matriz[3][3] = {{3,3,3},{3,3,3},{3,3,3}}	
		inteiro res = 0
		para(inteiro coluna=0;coluna<3;coluna++)
		{
			
			para(inteiro linha=0; linha<3;linha++)
			{
				escreva(matriz[linha][coluna] * vetor[linha] ,"\n")
				
			}
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 7, 10, 5}-{matriz, 13, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */