package Classes;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
				
				Scanner leia = new Scanner(System.in);
				
				double x1,x2;
				double y1,y2;
				double d2;
				
				System.out.print("Digite o valor de x1: ");
				x1 = leia.nextDouble();
				System.out.print("Digite o valor de x2: ");
				x2 = leia.nextDouble();
				System.out.print("Digite o valor de y1: ");
				y1 = leia.nextDouble();
				System.out.print("Digite o valor de y2: ");
				y2 = leia.nextDouble();

				d2 = (x2 - x1) * (x2 - x1) + (y2-y1)*(y2-y1);

				System.out.println("\nResultado:");
				System.out.printf("A distância entre os 2 pontos são: ", (d2));

				leia.close();
				
				
		

	}

}
