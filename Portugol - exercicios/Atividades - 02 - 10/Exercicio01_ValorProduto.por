programa{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real resultado = 0.0, calculo=0.0,precoNormal = 0.0
		inteiro pagamento = 0
				
		escreva("Digite o valor do produto: ")
		leia(precoNormal)
		limpa()

		//pergunta ao usuario o código da condição de pagamento
		escreva("1 - À vista em dinheiro ou cheque, recebe 20% de desconto")
		escreva("\n2 - À vista no cartão de crédito, recebe 15% de desconto")
		escreva("\n3 - Em duas vezes, preço normal de etiqueta sem juros")
		escreva("\n4 - Em três vezes, preço normal de etiqueta mais juros de 10%")
		escreva("\n\nInforme a condição de pagamento: ")
		leia(pagamento)

		//laço condicional de acordo com o código da condição de pagamento digitado e sendo apresentado
		se (pagamento == 1){
			calculo = (20*precoNormal)/100
			resultado = precoNormal - calculo
			escreva("Você escolheu a condição de pagamento ", pagamento,
			" \nPARABÉNS VOCÊ ganhou 20% de desconto seu produto, gerando um total de: ",  resultado)
		}
		senao se (pagamento == 2){
			calculo = (precoNormal*15)/100
			resultado = precoNormal - calculo
			escreva("Você escolheu a condição de pagamento ", pagamento,
			" \nPARABÉNS VOCÊ ganhou 15% de desconto seu produto, gerando um total de: ",  resultado)
		}
		
		senao se (pagamento == 3){
			resultado = precoNormal / 2
			escreva("Você escolheu a condição de pagamento ", pagamento,
			" \nVocê irá parcelar seu produto em 2 vezes com Juros de 10%, gerando um total: ",  resultado)
		}
		senao se (pagamento == 4){
			calculo = (10*precoNormal)/100
			resultado = (precoNormal/3)+calculo
			escreva("Você escolheu a condição de pagamento ", pagamento,
			" \nParcelando seu produto em 3 vezes tendo um total de cada parcela de: ", resultado)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */