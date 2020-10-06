package Portugol;

import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args)
	{		
		String nomeUsuario;
        int anoUsuario;
        int mesUsuario;
        int diaUsuario;	
        
        Scanner teclado = new Scanner(System.in);         
        
        System.out.print("Digite o seu nome: ");
        nomeUsuario = teclado.next();
        
        System.out.print("Digite a sua idade em dias: ");
        diaUsuario = teclado.nextInt();	
        
        anoUsuario = (diaUsuario /365);
    	mesUsuario = (diaUsuario % 365)/30;
    	diaUsuario = (diaUsuario % 365)%30;
        
        System.out.println("\n" +nomeUsuario+ " Você já viveu "+ anoUsuario + " anos, "+ mesUsuario+ " meses e "+diaUsuario + " dias");
		
        
        teclado.close();
	}

}
