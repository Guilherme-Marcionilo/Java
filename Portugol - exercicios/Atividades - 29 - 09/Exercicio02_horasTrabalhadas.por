programa 
{
	
	funcao inicio()
	{
		real C,N
		real ST = 0.00,E = 0.00

		escreva("Digite o número de horas trabalhadas: \n")
		leia(N)
		
		se (N > 50){
			E = (N * 20)
			ST = (E + (N * 10))
		escreva("O seu numero de horas trabalhas excedeu e o seu salário excedente é: R$ ", E," reais ")
		escreva("\nO salario total é: R$ ", ST, " reais")
		}
		
		senao {
			ST = N * 10
			escreva("Suas horas não excederam \nSalario total: R$ ", ST, " reais ")			
			escreva("\nSalario excedente: R$ ", E, " reais")
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */