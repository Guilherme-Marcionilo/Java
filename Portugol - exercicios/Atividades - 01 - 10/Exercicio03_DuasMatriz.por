programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro X = 2,Y = 2
		inteiro N1[X][Y]
		inteiro N2[X][Y]
		inteiro M1soma[X][Y]
		inteiro M2sub[X][Y]

		para(inteiro x = 0; x < X; x++)
		{
			para(inteiro y = 0; y < Y; y++){
				escreva("Digite um número ")
				leia	(N1[x][y])
				escreva("Digite um número ")
				leia(N2[x][y]) 
				
				M1soma[x][y] = N1 [x][y] + N2[x][y]
				M2sub[x][y] = N1 [x][y] - N2[x][y]
				escreva("\n")

				escreva("O valor de N1 na posição["+x+"]["+y+"] é de: "+ N1[x][y])
				escreva("\n")
				escreva("O valor de N2 na posição["+x+"]["+y+"] é de: "+ N2[x][y])
				escreva("\n")
				escreva("O valor de M1 na posição["+x+"]["+y+"] é de: "+ M1soma[x][y])
				escreva("\n")
				escreva("O valor de M1 na posição["+x+"]["+y+"] é de: "+ M2sub[x][y])
				escreva("\n\n")
	
				
			}
			escreva("\n\n")
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */