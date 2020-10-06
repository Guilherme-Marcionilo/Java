package Classes;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		double num;
		
		System.out.print ("Digite o primeiro número: ");	
		a = leia.nextInt();
		System.out.print("Digite o segundo número: ");	
		b = leia.nextInt();
		System.out.print("Digite o terceiro número: ");	
		c = leia.nextInt();
		
		num = ((a+b)*(a+b))+((b+c)*(b+c))/2;

		System.out.print("O resultado do cálculo é: " + num);
		
		leia.close();
	}

}
