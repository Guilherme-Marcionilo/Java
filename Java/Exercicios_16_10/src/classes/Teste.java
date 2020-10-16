package classes;

public class Teste extends Animal {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Preguica p1 = new Preguica();
		Cavalo ca1 = new Cavalo();
		
		
		c1.setIdade(12);
		
		c1.setNome("Hulk");
		System.out.println(c1.getNome());
		
		System.out.println("Nome: " + c1.getNome() + "\nIdade: " + c1.getIdade() + "\nEmite Som: " + c1.emitirSom());
		System.out.println("Nome: " + ca1.getNome() + "\n\nIdade: " + ca1.getIdade() + "\nEmite Som: " + ca1.emitirSom());
		System.out.println("Nome: " + p1.getNome() + "\n\nIdade: " + p1.getIdade() + "\nEmite Som: " + p1.emitirSom());
		
	}

}
