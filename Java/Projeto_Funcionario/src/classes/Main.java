package classes;

public class Main {

	public static void main(String[] args) {
		Apoio Carlos = new Apoio("Carlos", 1200, 20, 2);
		Chefe oi = new Chefe("Julio", 1100, 30, 10);
		oi.mostrarinformacoes();
		System.out.println("Desconto: "+ oi.fornecaDesconto(0));
		System.out.println("Sal�rio bruto: "+  oi.fornecaSalarioBruto());
		System.out.println("Sal�rio L�quido: "+ oi.fornecaSalarioLiquido());
		
		Carlos.mostrarinformacoes();
		System.out.println("Valor Aux�lio Educa��o: "+ Carlos.fornecaAuxEducacao());
		System.out.println("Sal�rio Bruto: "+ Carlos.fornecaSalarioBruto());
		System.out.println("Sal�rio L�quido: "+ Carlos.fornecaSalarioLiquido());
		
		
		Apoio Augustinho = new Apoio("Augustinho", 5000, 40, 1);
		
		Augustinho.mostrarinformacoes();
		System.out.println("Valor Aux�lio Educa��o: "+ Augustinho.fornecaAuxEducacao());
		System.out.println("Sal�rio Bruto: "+ Augustinho.fornecaSalarioBruto());
		System.out.println("Sal�rio L�quido: "+ Augustinho.fornecaSalarioLiquido());
		
		Chefe Jose = new  Chefe("Jos� Luis", 1800, 25, 50);
		
		Jose.mostrarinformacoes();
		System.out.println("Desconto: "+ Jose.fornecaDesconto(0));
		System.out.println("Sal�rio bruto: "+  Jose.fornecaSalarioBruto());
		System.out.println("Sal�rio L�quido: "+ Jose.fornecaSalarioLiquido());
		
		
		
		
				
		
		
		

	}

}

