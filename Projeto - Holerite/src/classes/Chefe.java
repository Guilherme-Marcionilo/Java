package classes;
public class Chefe extends Funcionario
{

	private double gratificacaoChefia;
	protected int nrDependentes;
	
	public Chefe(String nome, String matricula, double salariobase, double gratificacaoProd, double gratificacaoChefia, int nrDependentes)
	{
		super(nome,matricula, salariobase, gratificacaoProd,nrDependentes);
		this.gratificacaoChefia = gratificacaoChefia;
		this.nrDependentes = nrDependentes;
	}
	public void mostrarinformacoes()
	{
		System.out.println("\n\n---- FUNCIONÁRIO CHEFx ----\n");
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
	
	
	public double getNrDependentes() {
		return nrDependentes;
	}
	public void setNrDependentes(int nrDependentes) {
		this.nrDependentes = nrDependentes;
	}
	public double getGratificacaoChefia() {
		return gratificacaoChefia;
	}

	public void setGratificacaoChefia(double gratificacaoChefia) {
		this.gratificacaoChefia = gratificacaoChefia;
	}
	
	
}
