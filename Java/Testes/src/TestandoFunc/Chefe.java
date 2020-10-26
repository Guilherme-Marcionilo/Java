package TestandoFunc;
public class Chefe extends Funcionario
{
	private double gratificacaoChefia;
	
	public Chefe(String matricula, double salariobase, double gratificacaoProd, double gratificacaoChefia)
	{
		super(matricula, salariobase, gratificacaoProd);
		this.gratificacaoChefia = gratificacaoChefia;
	}
	public void mostrarinformacoes()
	{
		System.out.println("\n\n---- FUNCIONÁRIO CHEFIA ----\n");
		super.mostrarinformacoes();
		System.out.println("Gratificação Chefia: " + this.gratificacaoChefia);
		
		
	}
	public double fornecaSalarioLiquido()
	{
		double liquido;
		liquido = super.fornecaSalarioLiquido(gratificacaoChefia);
		return liquido;
		
	}
	
	public double fornecaSalarioBruto()
	{
		double bruto;
		bruto = (super.fornecaSalarioBruto()) + gratificacaoChefia;
		return bruto;
	}
	
	public double fornecaDesconto(double valordesconto)
	{
		if(getSalariobase() == 1000)
		{
			valordesconto = 0;
		}
		
		if(getSalariobase() > 1000 && getSalariobase() < 1800)
		{
			valordesconto = 10;
		}
		else
		{
			valordesconto = 25;
		}
		return valordesconto;
		
	}
	
	

	public double getGratificacaoChefia() {
		return gratificacaoChefia;
	}

	public void setGratificacaoChefia(double gratificacaoChefia) {
		this.gratificacaoChefia = gratificacaoChefia;
	}
}
