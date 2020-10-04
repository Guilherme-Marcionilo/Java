programa
{
	/* Faça um programa que leia um vetor de 5 posições para números 
	 *  reais e, depois, um código inteiro. Se o código for zero, finalize o programa; 
	 *  se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor 
	 *  na ordem inversa. Caso, o código 
	for diferente de 1,2 e 0, escreva uma mensagem informando que o código inválido.*/

	funcao inicio()
	{
		const inteiro LIMITE = 5
		real vetor[LIMITE]
		inteiro codigo = 0,x=0
		logico teste = falso

		
		para(x=0; x<LIMITE; x++)
		{
			escreva("Digite a ",x+1,"º um número: ")
			leia(vetor[x])
			
		}
		limpa()
		faca
		{
			se (teste) 
			{
				escreva("Código errado, tente novamente: \n") 			
			}
			teste = verdadeiro
			escreva(" C Ó D I G O S \n")
			escreva("0 - Encerrar sistema \n")
			escreva("1 - Mostre o vetor na ordem direta \n")
			escreva("2 - mostre o vetor na ordem inversa \n")
			escreva("Digite o código: ")
			leia(codigo)
		} enquanto (codigo < 0 ou codigo >2)

		se (codigo == 1)
		{
			limpa()
			para(x=0; x<LIMITE; x++)
			{
				
			  escreva("[ ",vetor[x]," ]")				
			}
			
		}
		senao se (codigo == 2)
		{
			limpa()
			para(x=4; x > -1; x--)
			{
				
			  escreva("[ ",vetor[x]," ]")				
			}
			
		}

		senao {
			limpa()
			escreva("FIM DO PROGRAMA")
		}

		
	
		
		
		

		


		
		

		




		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1265; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */