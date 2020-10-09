package classes;
import java.util.Scanner;
public class Exercicio_4_Empresa {
	public static void main(String[] args)
	{
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
		 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
			o número de pessoas calmas; 
			o número de mulheres nervosas; 
			o número de homens agressivos; 
			o número de outros calmos;
			o número de pessoas nervosas com mais de 40 anos; 
			o número de pessoas calmas com menos de 18 anos.
		 */
		 
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		final int LIMITE = 10; 
		byte sexo; 
		byte tipoHumor; 
		int totalF, totalM, totalO, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervosas40=0, calmasMenor18=0;
		
		int contador = 1;
		System.out.println("------- SISTEMA DE PESQUISA -----------------");
		while (contador <=LIMITE) {
			System.out.print("Digite a sua idade:");
			idade = leia.nextInt();
			System.out.print("Digite 1-feminino / 2-masculino / 3-Outros :");
			sexo = leia.nextByte();
			System.out.print("Digite para cada tipo de pessoa: 1 - Calma / 2 - Nervosa / 3 - Agressiva :");
			tipoHumor = leia.nextByte();
			leia.nextLine(); 
			
			if (tipoHumor == 1) {
				pessoasCalmas = pessoasCalmas + 1;
			}
			else if ((tipoHumor == 2) && (sexo == 1)) {
				mulheresNervosas = mulheresNervosas +1;
			}
			else if ((tipoHumor == 3) && (sexo == 2)) {
				homensAgressivos = homensAgressivos +1;
			}
			else if ((tipoHumor == 1) && (sexo == 3)) {
				outrosCalmos = outrosCalmos +1;
			}
			else if ((tipoHumor == 2) && (sexo == 1)) {
				nervosas40++;
			}
			else if ((tipoHumor == 1) && (sexo == 1)) {
				calmasMenor18++;
			}
			else if((tipoHumor == 3) && (sexo == 3)) {
				homensAgressivos = homensAgressivos +1;
			}
			else {
				System.out.println("Opção Inválida");
			}		
			
			contador++;
			
		}
		System.out.printf("\nTOTAL DE PESSOAS CALMAS : %d", pessoasCalmas);
		System.out.printf("\nTOTAL DE MULHERES NERVOSAS : %d ", mulheresNervosas);
		leia.close();
		
	}
}