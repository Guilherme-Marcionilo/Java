programa
{
	
	funcao inicio()
	{
		const inteiro X= 3,Y=3

		inteiro i,j,matriz[X][Y],soma = 0, diagonal = 0

		para (i=0; i < X; i++) {
			para(j=0; j<Y; j++) {
				escreva("Digite um valor para a posição "+ i + " " + j +" da matriz: ")
				leia(matriz[i][j])

				soma = soma + matriz[i][j]			
				
			}
			

			
			
			
		}
		escreva ("\n A soma dos valores das matrizes deu: " + soma)
		diagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]

		escreva("\n O valor somado da diagonal é: " + diagonal)
		
			
		
		
		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */