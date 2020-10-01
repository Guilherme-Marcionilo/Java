programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro a,b,c
		inteiro r = 0, s = 0, d =0

		escreva("Digite o primeiro número: ")
		leia(a)
		escreva("Digite o segundo número: ")
		leia(b)
		escreva("Digite o terceiro número: ")
		leia(c)

		r = mat.potencia((a+b),2)
		s = mat.potencia((b+c),2)
		d = mat.potencia((b+c), 2)

		d = (r+s) / 2

		escreva("O resultado do cálculo é: " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */