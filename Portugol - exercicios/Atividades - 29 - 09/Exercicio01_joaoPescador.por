programa
{
	
	funcao inicio()
	{
		real P,E = 0.00,M = 0.00

		escreva(" ------ João pescador ------ \n\n")
		
		escreva("Digite a quantidade de peso: \n")
		leia(P)

		se (P > 50){
			E = P - 50
			M = E * 4
			escreva("O peso dos tomates foi excedido em: ", E, 
			" kilos \n Você terá que pagar: R$ ", M, " reais")
		}
		senao{
			escreva("O peso dos tomates não excedeu !! \n Peso dos tomates: ", P, 
			"\n Taxa de Excesso: ", E, "\n Valor da Multa: ", M) )
			
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */