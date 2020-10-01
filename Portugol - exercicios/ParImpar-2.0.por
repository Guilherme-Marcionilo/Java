programa
{
	funcao mostra(cadeia frase) {
		escreva(frase)
	}
	
	funcao inicio()
	{
		inteiro n		
		mostra ("--------   ÍMPAR OU PAR? --------- \n\n")
		mostra("Digite um número (inteiro): ")
		leia(n)
		
		parImpar(n)
		
	}

	funcao parImpar(inteiro n)
	{	
		
		se (n > 0) {				
			se ((n % 2) == 0) {
				mostra("O valor é positivo e PAR")
			}
			senao {
				mostra("O valor é positivo e ÍMPAR!")
			}
		}
		senao se (n < 0) {
			mostra("O valor é negativo")
		}
		senao {
			mostra("Você digitou 0, e é PAR!")
		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */