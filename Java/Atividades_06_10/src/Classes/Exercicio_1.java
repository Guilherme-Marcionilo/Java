package Classes;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		
		 String nomeUsuario;
	     int anoUsuario;
	     int mesUsuario;
	     int diaUsuario;
	     int totalDias = 0;
	     
	     System.out.print("Digite o seu nome: ");
	     nomeUsuario = leia.next();
	     System.out.print("Digite os dias: ");
	     diaUsuario = leia.nextInt();
	     System.out.print("Digite o m�ses: ");
	     mesUsuario = leia.nextInt();
	     System.out.print("Digite sua idade: ");
	     anoUsuario = leia.nextInt();

	     totalDias = ((anoUsuario*365) + (mesUsuario *30) + diaUsuario);
	    		
	     System.out.println(nomeUsuario + "Voc� j� viveu "+ totalDias + " dias at� hoje.");
		     
		 leia.close();	

	}
}
