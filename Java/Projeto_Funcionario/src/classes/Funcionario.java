package classes;

public class Funcionario 
{
	private String matricula;
	private double salariobase;
	private double gratificacaoProd;
	
	
	public Funcionario(String matricula, double salariobase, double gratificacaoProd)
	{
		this.matricula = matricula;
		this.salariobase = salariobase;
		this.gratificacaoProd = gratificacaoProd;
	}
	
	public void mostrarinformacoes()
	{
		
		System.out.println("Nome: "+ matricula);
		System.out.println("Salariobase: "+ salariobase);
		System.out.println("Gratificação de Produtividade: "+ gratificacaoProd);
	}

	public double fornecaDesconto(double valor)
	{
		double desconto = (salariobase + gratificacaoProd + valor);
		if(desconto <= 1000)
		{
			valor = 0;
		}
		
		if(desconto > 1000 && desconto < 1800)
		{
			valor = 10;
		}
		else
		{
			valor = 25;
		}
		return valor;
		
	}
	
	public double fornecaSalarioLiquido(double valor)
	{
		double liquido;
		liquido = (salariobase + gratificacaoProd + valor); 
		if (liquido <= 1000)
		{
			liquido = 0;
		}
	
		if(liquido > 1000 && liquido < 1800)
		{
			liquido -= 100;
		}
		else
		{
			liquido -= 370;
		}
		
		return liquido;
		
	}
	
	public double fornecaSalarioBruto()
	{
		double bruto;
		bruto = salariobase + gratificacaoProd;
		return bruto;
		
	}
	
	public double getSalariobase() {
		return salariobase;
	}
	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getGratificacaoProd() {
		return gratificacaoProd;
	}
	public void setGratificacaoProd(double gratificacaoProd) {
		this.gratificacaoProd = gratificacaoProd;
	}
}
