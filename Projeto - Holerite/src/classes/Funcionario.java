package classes;

public abstract class Funcionario 
{
	protected String nome;
	protected String matricula;
	protected double salariobase;
	protected double gratificacaoProd;
	protected int nrDependentes;
	
	public Funcionario(String nome, String matricula, double salariobase, double gratificacaoProd, int nrDependentes)
	{
		this.nome = nome;
		this.matricula = matricula;
		this.salariobase = salariobase;
		this.gratificacaoProd = gratificacaoProd;
		this.nrDependentes = nrDependentes;
	}
	
	public void mostrarinformacoes()
	{
		System.out.println("------ Folhas de Pagamento ------\n\n");
		System.out.println("Nome: "+ nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Salariobase: "+ salariobase);
		System.out.println("Gratificação de Produtividade: "+ gratificacaoProd);
		System.out.println("Número de dependentes: "+ nrDependentes);
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}

	public double getGratificacaoProd() {
		return gratificacaoProd;
	}

	public void setGratificacaoProd(double gratificacaoProd) {
		this.gratificacaoProd = gratificacaoProd;
	}

	public double getNrDependentes() {
		return nrDependentes;
	}

	public void setNrDependentes(int nrDependentes) {
		this.nrDependentes = nrDependentes;
	}
	

}
