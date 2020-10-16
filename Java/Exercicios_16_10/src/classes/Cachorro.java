package classes;

public class Cachorro extends Animal{
	

	
	public String getNome() {
		return super.getNome();
	}
	
	@Override
	public String emitirSom () {
		return "Au au";
	}
}
