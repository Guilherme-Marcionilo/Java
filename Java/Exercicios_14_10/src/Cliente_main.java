
public class Cliente_main {

	public static void main(String[] args) {
		Cliente primeiro = new Cliente();
		
		System.out.println("Olá " + primeiro.getNome("João"));
		
		System.out.println (primeiro.saidaNome("joaozinho@gmail.com"));
		
		primeiro.Envia();
	}

}
