programa
{
    funcao inicio()
    { 
        cadeia nomeUsuario
        inteiro anoUsuario
        inteiro mesUsuario
        inteiro diaUsuario

        escreva("Digite o seu nome: ")
        leia(nomeUsuario)
        escreva("Digite a sua idade em dias: ")
        leia(diaUsuario)

        
        inteiro anosUsuario = (diaUsuario /365)
        inteiro mesesUsuario = (diaUsuario % 365)/30
        inteiro diasUsuario = (diaUsuario % 365)%30

        escreva ("\n", nomeUsuario, " Você já viveu ", diasUsuario, " dias até hoje.")
    }

} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */