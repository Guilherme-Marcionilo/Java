package classes;

import java.util.ArrayList;
import java.util.List;



public class Inicio_Colletion {
	public static void main(String[] args) {
		
		List<Aluno> lista = new ArrayList();
		ArrayList <String> teste = new ArrayList<String>();
		
		
		lista.add(new Aluno("Gui",18));
		
		System.out.printf("Imprimir nome: %s \n",lista.get(0).getNome());
		lista.get(0).setNome("Novo Nome");
		System.out.printf("Imprimir nome: %s \n",lista.get(0).getNome());
		
		teste.add("Kinder Bueno");
		teste.add("Kinder Ovo");
		teste.add("Fini");
		teste.contains("Gui");
		System.out.println(teste.toString());
		teste.remove(2);
		System.out.println(teste.toString());
		teste.clear();
		
		teste.add("Ovo da páscoa");
		
		
		System.out.println(teste.toString());
		System.out.println(teste.indexOf("Alo"));
		System.out.println(teste.size());
		
		
		for (String testes : teste) {
			System.out.println("Listando com foreach");
			System.out.println(testes);
		}
		
	}
}
