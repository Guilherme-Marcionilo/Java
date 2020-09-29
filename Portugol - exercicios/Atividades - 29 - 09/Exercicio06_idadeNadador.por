programa
{
	funcao inicio()
	{
		cadeia nomeUsuario
		cadeia categoria
		inteiro idade		
		escreva("Nadador, digite o seu nome: ")
		leia(nomeUsuario)
		escreva ("Digite sua idade ")
		leia(idade)		
		escreva("Você é um nadador " + idade)			
		
		 se(idade >= 5 e idade <=7){
		 	escreva ("\n Olá, ", nomeUsuario, " você é Infantil A! ")
		 }
		 	
		 senao se(idade >= 8 e idade <=11){
		 	escreva("\n Olá, ", nomeUsuario, " você é Infantil B! ")	 		
		 	
		 }

		 senao se(idade >=12 e idade<=13) {
		 	escreva("\n Olá, ", nomeUsuario, " você é Juvenil A! ")
		 }
		 senao se (idade >=14 e idade<=17) {
		 	escreva("\n Olá, ", nomeUsuario, " você é Juvenil B! ")
		 }
		 senao {
		 	escreva("\n Olá, ", nomeUsuario, " você é Adulto! ")
		 }
	
     }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 668; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */