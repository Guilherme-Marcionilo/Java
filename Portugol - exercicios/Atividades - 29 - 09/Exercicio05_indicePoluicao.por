programa
{
	
	funcao inicio()
	{
		 
		 cadeia grupo1 = " Grupo 1"
		 cadeia grupo2 = " Grupo 2"
		 cadeia grupo3 = " Grupo 3"
		 real indice = 0.0
		 		
		 escreva("Digite o índice de poluição: ")
		 leia(indice)
		 
		 se (indice >= 0.5 ou indice <= 0.25){
		 	escreva("Atenção" + grupo1 + grupo2 + grupo3 + 
		 	" cancelem as suas atividades imediatamente, pois o índice de poluição "
		 	, indice,  "ultrapassou o limite de 0,5")
		 }
		 senao se(indice >= 0.4){
		 	escreva("Atenção", grupo1,grupo2, " cessem as suas atividades imediatamente, pois o índice de poluição "
		 	, indice,  " ultrapassou o limite de 0,4")
		 }
		 senao se(indice >= 0.3){
		 	escreva("Atenção", grupo1, " parem com suas atividades, seu índice está ", indice)
		 }
		 senao{
		 	escreva("Nenhum grupo será notificado, pois o índice de poluição ", indice,
		 	" não ultrapassou o limite de 0,25")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */