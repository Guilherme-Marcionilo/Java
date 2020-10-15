public class Aviao {
	int qtdturbina;
	boolean vooAutorizado;
	
	public Aviao(int qtdturbina, boolean vooAutorizado)
	{
		this.qtdturbina = qtdturbina;
		this.vooAutorizado = vooAutorizado;
	}
	
	void liga()
	{
		System.out.println("Avião ligado e preparado para o voo!");
	}
	
	
	
	void imprimir()
	{
		System.out.println("A qtd de turbina é: " + this.qtdturbina);
		
		if(this.vooAutorizado == true)
			System.out.println("voo autorizado com sucesso!");
		else
			System.out.println("Verifique o sistema do avião para prosseguir!");
	}
		
	
}
