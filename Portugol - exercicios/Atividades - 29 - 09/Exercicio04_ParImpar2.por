programa
{
	
	funcao inicio()
	{
		inteiro n

		escreva ("--------   ÍMPAR OU PAR? --------- \n\n")
		escreva("Digite um número: ")
		leia(n)

		se ((n>0) e ((n % 2) == 0)){
			escreva("O valor é positivo e PAR")
		}
		senao se ((n<0) e ((n % 2) == 0)) {
			escreva("O valor é negativo e PAR")
		}
		senao se ((n>0) e ((n % 2) != 0)){
			escreva("O valor é positivo e ÍMPAR")
		}
		senao se ((n<0) e ((n % 2) != 0)) {
			escreva("O valor é negativo e ÍMPAR")
		}
		senao {
			escreva("Você digitou 0, e zero é PAR")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */