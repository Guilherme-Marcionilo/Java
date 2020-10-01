programa
{

	
	
	funcao inicio()
	{
		inteiro nFilhos = 02,habitantes
		real salPopulacao = 0.0, mediaFilhos = 0.0, mediaSal = 0.0, maiorSalario = 0.0, percentSal = 0.0
		
		para (habitantes = 1; habitantes<=20; habitantes++){
			escreva ("Digite a quantidade de filhos: ")
			leia(nFilhos)
			limpa()
						
			escreva("Digite seu salário: ")
			leia(salPopulacao)
			limpa()

			se (salPopulacao <= 100) {
				percentSal++	
			}
			se (salPopulacao > maiorSalario) {
				maiorSalario = salPopulacao	
			}
					
		}
		
		escreva("A média dos salários é de: ", mediaSal, "\n")	
		escreva("A média do número de filhos é: ",nFilhos "\n")
		escreva("\nO maior salário foi: ",maiorSalario, "\n")
		escreva("\nO percentual das pessoas com salários até R$ 100,00 foram: ", percentSal)
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 705; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */