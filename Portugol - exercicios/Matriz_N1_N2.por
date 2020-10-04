programa
{
	inclua biblioteca Util --> U	
	/*Escreva um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

	

	
	funcao inicio()
	{
	  const inteiro LINHA = 4,COLUNA = 6
	  
	  inteiro N1[LINHA][COLUNA]
	  inteiro N2[LINHA][COLUNA]
	  inteiro M1[LINHA][COLUNA]
	  inteiro M2[LINHA][COLUNA]
	  inteiro x = 0,y = 0
	  
	  para(x = 0; x < LINHA;x++)
	  {
	  	para(y = 0; y < COLUNA; y++) 
	  	{
	  		
	  		N1[x][y] = U.sorteia(1, 10)
	  		N2[x][y] = U.sorteia(1, 10)
	  	}
	  }

	  para(x = 0; x < LINHA;x++)
	  {
	  	para(y = 0; y < COLUNA; y++) 
	  	{
	  		
	  		M1[x][y] = N1[x][y] + N2[x][y]
	  		M2[x][y] = N1[x][y] - N2[x][y]
	  	}
	  }	  
	  escreva("\n")

	  escreva("Matriz N1: ")
	  escreva("\n")

	  
	  //Imprimir N1
	  para(x = 0; x < LINHA;x++)
	  {
	  	para(y = 0; y < COLUNA; y++) 
	  	{
	  		
	  		escreva("[ ",N1[x][y]," ]")
	  	}
	  	escreva("\n")
	  }

	  escreva("Matriz N2: ")
	  escreva("\n")

	  
	  //Imprimir N2
	  para(x = 0; x < LINHA;x++)
	  {
	  	para(y = 0; y < COLUNA; y++) 
	  	{
	  		
	  		escreva("[ ",N2[x][y]," ]")
	  	}
	  	escreva("\n")
	  }
	  
	  escreva("Matriz M1: ")
	  escreva("\n")

	  
	  //Imprimir M1
	  para(x = 0; x < LINHA;x++)
	  {
	  	para(y = 0; y < COLUNA; y++) 
	  	{
	  		
	  		escreva("[ ",M1[x][y]," ]")
	  	}
	  	escreva("\n")
	  }

	  escreva("Matriz M2: ")
	  escreva("\n")

	  
	  //Imprimir M2
	  para(x = 0; x < LINHA;x++)
	  {
	  	para(y = 0; y < COLUNA; y++) 
	  	{
	  		
	  		escreva("[ ",M2[x][y]," ]")
	  	}
	  	escreva("\n")
	  }
	  
	  
	 




	  

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */