package Classes;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custo ,fabrica;
		
		System.out.print("Digite o valor do custo: ");
		custo = leia.nextDouble();
		System.out.print("Digite o valor de fabrica: ");
		fabrica = leia.nextDouble();

		custo = (fabrica * 1.45*1.28);
		
		System.out.printf("O custo será de: %.2f " , custo);
		leia.close();

	}

}
