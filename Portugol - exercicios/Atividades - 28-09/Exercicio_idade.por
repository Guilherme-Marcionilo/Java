programa
{

    funcao inicio()

    { 
        cadeia nomeUsuario
        inteiro anoUsuario
        inteiro mesUsuario
        inteiro diaUsuario
        inteiro totalDias = 0


        escreva("Digite o seu nome: ")
        leia(nomeUsuario)
        escreva("Digite os dias: ")
        leia(diaUsuario)
        escreva("Digite o mêses: ")
        leia(mesUsuario)
        escreva("Digite sua idade: ")
        leia(anoUsuario)

        totalDias = ((anoUsuario*365) + (mesUsuario *30) + diaUsuario)

        escreva (nomeUsuario + "Você já viveu "+ totalDias + " dias até hoje.")

    }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */