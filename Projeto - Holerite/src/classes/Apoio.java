package classes;
public class Apoio extends Funcionario
{
	private int nrDependentes = 0;
	private double valorAuxEducacao;
	
	public Apoio(String nome, String matricula, double salariobase, double gratificacaoProd, int nrDependentes)
	{
		super(nome,matricula, salariobase, gratificacaoProd, nrDependentes);
		this.nrDependentes = nrDependentes;
	}
	
	public void mostrarinformacoes()
	{
		System.out.println("\n\n---- FUNCIONÁRIO DE APOIO ----\n");
		super.mostrarinformacoes();
		
		System.out.println("Número de dependentes: " + this.nrDependentes);
		
	}
	
	public double fornecaAuxEducacao()
	{
		if(nrDependentes >= 5)
		{
			valorAuxEducacao = 300;
		}
		else
		{
			valorAuxEducacao = nrDependentes * 60;
		}
		return valorAuxEducacao;
	}
	
	
	public double fornecaSalarioLiquido()
	{
		double liquido;
		liquido = super.fornecaSalarioLiquido(0);
		liquido += valorAuxEducacao;
		return liquido;
		
	}
	@Override
	public double fornecaSalarioBruto()
	{
		double bruto;
		bruto = (super.fornecaSalarioBruto()) + valorAuxEducacao;
		return bruto;
	}

	public double getNrDependentes() {
		return nrDependentes;
	}

	public void setNrDependentes(int nrDependentes) {
		this.nrDependentes = nrDependentes;
	}

	public double getValorAuxEducacao() {
		return valorAuxEducacao;
	}

	public void setValorAuxEducacao(double valorAuxEducacao) {
		this.valorAuxEducacao = valorAuxEducacao;
	}
	
	
}
