package classes;

public class Cavalo extends Animal {
	
	public String getNome() {
		return super.getNome();
	}
	
	@Override
	public String emitirSom () {
		return "IRIRIRIRI";
	}
}
