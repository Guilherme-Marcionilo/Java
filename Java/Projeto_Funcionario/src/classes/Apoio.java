package classes;
public class Apoio extends Funcionario
{
	private int nrDependentes;
	private double valorAuxEducacao;
	
	
	public Apoio(String matricula, double salariobase, double gratificacaoProd, int nrDependentes)
	{
		super(matricula, salariobase, gratificacaoProd);
		this.nrDependentes = nrDependentes;
		
	}
	
	public void mostrarinformacoes()
	{
		System.out.println("FUNCIONÁRIO DE APOIO");
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
	
	public double fornecaSalarioBruto()
	{
		double bruto;
		bruto = (super.fornecaSalarioBruto()) + valorAuxEducacao;
		return bruto;
	}
	
	
	public double getValorAuxEducacao() {
		return valorAuxEducacao;
	}
	public void setValorAuxEducacao(double valorAuxEducacao) {
		this.valorAuxEducacao = valorAuxEducacao;
	}
	public int getNrDependentes() {
		return nrDependentes;
	}
	public void setNrDependentes(int nrDependentes) {
		this.nrDependentes = nrDependentes;
	}
}
