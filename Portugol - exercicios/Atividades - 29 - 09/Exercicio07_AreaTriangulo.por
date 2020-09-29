programa
{
	
	funcao inicio()
	{
		inteiro base,altura,triangulo = 0

		escreva("Digite um número para base de um triângulo: ")
		leia(base)

		escreva("Digite um número para altura de um triângulo: ")
		leia(altura)

		se (base > 0 e altura > 0) {
			triangulo = (base * altura) / 2
			escreva("A área do triângulo é: " + triangulo)
		}

		senao {
			triangulo = 0
			escreva (triangulo)
		}

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 217; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */