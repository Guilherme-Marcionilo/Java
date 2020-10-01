programa
{
	funcao inicio()
	{
		//exercicio 222222
		inteiro n
		const inteiro LIMITE=500
		inteiro totalImpares = 0


		para (inteiro x= 1; x <=LIMITE; x++) {
			se (((x%3) == 0) e ((x%2)!=0)) {
				totalImpares = totalImpares + x
			}
			 	
		}
		
		escreva("Total de Ímpares multiplos de 3 = " + totalImpares)	
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */