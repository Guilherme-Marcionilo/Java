programa
{
	inclua biblioteca Util --> U
	//CRIA UM VETOR COM NÚMEROS ALEATÓRIOS, IMPRIME O VETOR NA TELA, E DEPOIS IMPRIME O VETOR ORDENADO
	funcao inicio()
	{
	 const inteiro LIMITE = 10
	 inteiro vetor[10],x=0,auxiliar1 = 0,auxiliar2 = 0,vetor2[LIMITE]
	 logico ordenado = verdadeiro

	 escreva("Vetor sorteado: \n")
	 
	 para(x=0;x<LIMITE;x++)
	 {
		vetor[x] = U.sorteia(1, 100)	
		escreva("[ ",vetor[x]," ]")	 	
	 }
	 
	 para(x=0;x<LIMITE;x++)
	 {
		vetor2[x] = vetor[x]			 	
	 } 
	 
	 escreva("\n")
	 

	enquanto (ordenado)
	{
		ordenado = falso
	       para(x=0;x<LIMITE-1;x++)
		  {
			se (vetor[x] > vetor[x+1])
			{
		       ordenado = verdadeiro
			  auxiliar1 = vetor[x]
			  auxiliar2 = vetor[x+1]	
			  vetor[x] = auxiliar2
			  vetor[x+1] = auxiliar1
			  //escreva(" Valor maior: ",auxiliar1," Valor menor: ",auxiliar2 ,"\n")
			  para(x=0;x<LIMITE;x++)
			  {
				escreva("[ ",vetor[x]," ]")	 	
			  }	 
			 	escreva("\n")
				U.aguarde(1000)
			}
			
		  }	 
	}
	escreva("\n")
	
	para(x=0;x<LIMITE;x++)
	{
		escreva("[ ",vetor2[x]," ]")	 	
	}	 
	 escreva("\n")
	 escreva("Vetor Ordenado: \n")
	 
	para(x=0;x<LIMITE;x++)
	{
		escreva("[ ",vetor[x]," ]")	 	
	}	 
	 escreva("\n")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1078; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 8, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */