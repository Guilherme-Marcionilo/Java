package classes;

public class Main {

	public static void main(String[] args) {
		Apoio Carlos = new Apoio("Carlos", 1200, 20, 2);
		Chefe oi = new Chefe("Julio", 1100, 30, 10);
		oi.mostrarinformacoes();
		System.out.println("Desconto: "+ oi.fornecaDesconto(0));
		System.out.println("Salário bruto: "+  oi.fornecaSalarioBruto());
		System.out.println("Salário Líquido: "+ oi.fornecaSalarioLiquido());
		
		Carlos.mostrarinformacoes();
		System.out.println("Valor Auxílio Educação: "+ Carlos.fornecaAuxEducacao());
		System.out.println("Salário Bruto: "+ Carlos.fornecaSalarioBruto());
		System.out.println("Salário LÍquido: "+ Carlos.fornecaSalarioLiquido());
		
		
		Apoio Augustinho = new Apoio("Augustinho", 5000, 40, 1);
		
		Augustinho.mostrarinformacoes();
		System.out.println("Valor Auxílio Educação: "+ Augustinho.fornecaAuxEducacao());
		System.out.println("Salário Bruto: "+ Augustinho.fornecaSalarioBruto());
		System.out.println("Salário LÍquido: "+ Augustinho.fornecaSalarioLiquido());
		
		Chefe Jose = new  Chefe("José Luis", 1800, 25, 50);
		
		Jose.mostrarinformacoes();
		System.out.println("Desconto: "+ Jose.fornecaDesconto(0));
		System.out.println("Salário bruto: "+  Jose.fornecaSalarioBruto());
		System.out.println("Salário Líquido: "+ Jose.fornecaSalarioLiquido());
		
		
		
		
				
		
		
		

	}

}

