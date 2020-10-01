programa
{	
	funcao inicio()
	{
		inteiro n = 0, soma = 0, media = 0, total = 0
		
		enquanto(n >= 0){
		escreva("Digite um numero positivo, ou negativo para encerrar: ")
		leia(n)	
		
			se(n > 0){
					soma = soma + n
					total++
				}
		
		}
		media = soma / total

		escreva("\n A Soma dos números é: " + soma) 
		escreva("\n A Média dos valores é: " + media)
		escreva("\n O Total de números positivos digitados é: " + total)
		}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */