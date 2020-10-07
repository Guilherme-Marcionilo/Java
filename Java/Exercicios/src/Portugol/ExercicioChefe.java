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
		
		System.out.print("Você é chefe? [S] para sim ou [N] para não: ");
		chefe = leia.next().charAt(0);
		
		System.out.print("Digite M para masculino ou F para feminino: ");
		opcao = leia.next().charAt(0);
		
		if(idade == 0 || idade < 18 ){
			System.out.println("Menor de idade não recebe...");
		}
		
		if(chefe >= 18 && (opcao == 'N' || opcao == 'n')){
			System.out.println("Você não é chefe");
			
		}
		if(idade >= 18 && (opcao == 'M' || opcao == 'm')) {
			System.out.println("Você é chefe!");
			System.out.println("Seu auxílio é: " + auxilio);
		}
		else if(idade >= 18 && (opcao == 'F' || opcao == 'f')){
			System.out.println("Você é mãe de família!");
			System.out.println("Seu auxílio é: " + (auxilio *2) );
		}
		
		else {
			System.out.println("Opção inválida!");
		}
		
		leia.close();

	}

}

