programa
{

    funcao inicio()

    { 
        cadeia nomeUsuario
        inteiro anoUsuario
        inteiro mesUsuario
        inteiro diaUsuario

        escreva("Resolva os exercícios.\n\n")

        escreva("1.Faça um sistema que leia a idade de uma pessoa expressa em anos,meses e dias e mostre-a expressa apenas em dias.\n\n")

        escreva("Qual o seu nome: ")
        leia(nomeUsuario)
        escreva("Qual o dia do seu nascimento: ")
        leia(diaUsuario)
        escreva("Qual o mês do seu nascimento: ")
        leia(mesUsuario)
        escreva("Qual o ano do seu nascimento: ")
        leia(anoUsuario)

        inteiro anosUsuario = (2020 - anoUsuario)
        inteiro mesesUsuario = (anosUsuario * 12)
        inteiro diasUsuario = (mesesUsuario * 365)

        escreva ("Você já viveu ", diasUsuario, " dias até hoje.")

    }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 547; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */