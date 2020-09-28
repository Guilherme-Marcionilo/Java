programa
{
	
	funcao inicio()
	{
		inteiro evento,horas,minutos,segundos
		
		escreva("Digite em segundos a duração de todo o evento: ")
		leia(evento)

		
		horas = (evento / 3600)
		minutos = ((evento%3600)/60)
		segundos = ((evento % 3600)%60)
		escreva("Toda a duração ao término do evento foi de: " + horas + " horas " + minutos + " minutos " + " e " + segundos + " segundos")
		
		
	
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */