programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/* Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 *  Faça um programa que gere um vetor com os lançamentos, 
		 *  escreva esse vetor. A seguir determine e imprima a média aritmética dos 
		lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/

		const inteiro LIMITE = 10
		inteiro vetor[LIMITE]   
		inteiro x = 0,media = 0,contador = 0, maior = 0, soma = 0
		

		para(x=0; x<LIMITE;x++)
		{
			vetor[x] = Util.sorteia(1, 6)
			escreva("[ ",vetor[x]," ]")
										  		
		}
		escreva("\n")
		
		para(x=0; x<LIMITE;x++)
		{
			soma += vetor[x]	
			se (maior < vetor[x])
			{
				maior = vetor[x]
				contador = 1											  		
			}
			senao se (maior == vetor[x]) 
			{
				contador++
			}
			
		}
		escreva("\n")
		escreva("\nA média é: " ,(soma/LIMITE))
		escreva("\nA quantidade de vezes é: ", contador)
		escreva("\nA maior nota foi: ",maior)
		
		
		
		

								
						
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 969; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */