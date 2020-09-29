programa
{
	funcao pulaLinha() {
		escreva("\n \n")
		escreva("******")
	}
	funcao mostra(frase) {
		escreva (mostra())
	}
	
	funcao inicio()
	{
		cadeia nomeUsuario
		caracter opcao

		
		escreva("Digite o seu nome: ")
		leia(nomeUsuario)
		escreva("Digite M - masculino ou F - feminino: ")
		leia(opcao)
		

		se (opcao == 'F') {
			escreva ("Bom dia, Senhora " + nomeUsuario)
		}	
		senao se (opcao == 'M') {
			escreva("Bom dia, Senhor " + nomeUsuario)
		}
		senao se (opcao == 'm') {
			escreva("Oi Senhorx, ", nomeUsuario)
		}
		senao {
			mostra ("Oi SenhorX " + nomeUsuario)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */