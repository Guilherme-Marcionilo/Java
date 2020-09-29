programa
{
	
	funcao inicio()
	{
		inteiro num1,num2,num3,num4
		inteiro quadrado1 = 0,quadrado2 = 0,quadrado3 = 0,quadrado4 = 0
		escreva("Digite o primeiro número ")
		leia(num1)
		escreva("Digite o segundo número ")
		leia(num2)
		escreva("Digiteo terceiro número ")
		leia(num3)
		escreva("Digite o quarto número ")
		leia(num4)
		
		quadrado1 = num1 * num1
		quadrado2 = num2 * num2
		quadrado3 = num3 * num3
		quadrado4 = num4 * num4
		
		se ((quadrado3 * quadrado3) >= 1000) {
			escreva("O valor do terceiro quadrado é: " + quadrado3)
		}
		senao {
			escreva("\nO valor 1 " + num1 + " seu quadrado é: " + quadrado1)
			escreva("\nO valor 2 " + num2 + " seu quadrado é: " + quadrado2)
			escreva("\nO valor 3 " + num3 + " seu quadrado é: " + quadrado3)
			escreva("\nO valor 4 " + num4 + " seu quadrado é: " + quadrado4)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */