programa
{
	
	funcao inicio()
	{
		inteiro n[5]
		inteiro x,maior = 0

		para (x=0; x< 5; x++){
			escreva("\nDigite um valor: ")
			leia(n[x])

			se (n[x] > maior) {
				maior = n[x]
			}
		}
		escreva("\nO maior valor é: "+maior)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 184; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */