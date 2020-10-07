package Portugol;

import java.util.Scanner;

public class ExercicioChefe {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade,auxilio = 600,anoNascimento;
		char opcao,chefe;
		
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite o seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		idade = 2020 - anoNascimento;
		
		System.out.print("Voc� � chefe? [S] para sim ou [N] para n�o: ");
		chefe = leia.next().charAt(0);
		
		System.out.print("Digite M para masculino ou F para feminino: ");
		opcao = leia.next().charAt(0);
		
		if(idade == 0 || idade < 18 ){
			System.out.println("Menor de idade n�o recebe...");
		}
		
		if(chefe >= 18 && (opcao == 'N' || opcao == 'n')){
			System.out.println("Voc� n�o � chefe");
			
		}
		if(idade >= 18 && (opcao == 'M' || opcao == 'm')) {
			System.out.println("Voc� � chefe!");
			System.out.println("Seu aux�lio �: " + auxilio);
		}
		else if(idade >= 18 && (opcao == 'F' || opcao == 'f')){
			System.out.println("Voc� � m�e de fam�lia!");
			System.out.println("Seu aux�lio �: " + (auxilio *2) );
		}
		
		else {
			System.out.println("Op��o inv�lida!");
		}
		
		leia.close();

	}

}

