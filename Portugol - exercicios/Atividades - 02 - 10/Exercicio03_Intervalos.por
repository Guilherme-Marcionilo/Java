programa
{

	/*Escrever um programa que leia uma quantidade desconhecida 
	 * de números e conte quantos deles estão nos seguintes intervalos: 
	 * [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.*/

	
	funcao inicio()
	{
		inteiro num,acl[4] = {0,0,0,0}
		faca
		{
			escreva ("Digite um número de 0 a 100: ")
			leia(num)

			se (num >=0 e num <=25)
			{
				acl[0]+=1			
			}
			senao se (num >= 26 e num <=50)
			{
				acl[1]+=1
				
			}
			senao se (num >= 51 e num <=75)
			{
				acl[2]+=1
				
			}
			senao se (num >= 76 e num <= 100) {
				acl[3]+=1
				
			}
		} enquanto (num>=0) 	

		escreva ("Intervalo I: está entre 0-25 \n")				
				escreva(acl[0], "\n")


		escreva ("Intervalo II: está entre 26-50\n")
				escreva(acl[1], "\n")


		escreva ("Intervalo III: está entre 51-75\n")
				escreva(acl[2], "\n")

		escreva ("Intervalo IV: está entre 51-100\n")
						
				escreva(acl[3], "\n")

		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 852; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */