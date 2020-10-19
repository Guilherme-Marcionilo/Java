package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;



public class Inicio_Colletion {
	public static void main(String[] args) {
		
		ArrayList <String> teste = new ArrayList<String>();
		
		teste.add("Kinder Bueno");
		teste.add("Kinder Ovo");
		teste.add("Fini");
		
		System.out.println(teste.toString());
		teste.remove(2);
		System.out.println(teste.toString());
		teste.clear();
		
		teste.add("Ovo da páscoa");
		
		
		System.out.println(teste.toString());
		System.out.println(teste.indexOf("Alo"));
		System.out.println(teste.size());
				
		
	}
}
