programa  
{
	
	funcao inicio()
	{
		inteiro n
		escreva ("--------   ÍMPAR OU PAR? --------- \n\n")
		escreva("Digite um número: ")
		leia(n)
		se (n > 0) {				
			se ((n % 2) == 0) {
				escreva("O valor é positivo e PAR")
			}
			senao {
				escreva("O valor é positivo e ÍMPAR!")
			}
		}
		senao se (n < 0) {
			escreva("O valor é negativo")
		}
		senao {
			escreva("Você digitou 0, e é par!")
		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */