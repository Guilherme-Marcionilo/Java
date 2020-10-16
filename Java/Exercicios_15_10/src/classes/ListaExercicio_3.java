package classes;

public class ListaExercicio_3 {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado("GUi","Disney","79283-213", 3,4567,60);
		Administrador admin = new Administrador("Ajuda",12323);
		Operario oper = new Operario("Gui",2013,100);
		Vendedor vende = new Vendedor("nome",1232,123);
		
		System.out.println("Nome: " + e1.getNome());	
		System.out.println("Endere�o: " + e1.getEndereco());
		System.out.println("Telefone: " + e1.getTelefone());
		System.out.println("C�digo Setor: " + e1.getCodigoSetor());
		System.out.println("Imposto: " + e1.getimposto());
		System.out.println("Salario Base: " + e1.getSalarioBase());
		System.out.println("Calculo Sal�rio: " + e1.calcularSalario());	
		
		e1.setNome("Novo nome");
		e1.setEndereco("Disney");
		e1.setTelefone("4002-89222");
		e1.setCodigoSetor(2);
		e1.setimposto(80);
		e1.setSalarioBase(1045);
		
		System.out.println("\n\nNome: " + e1.getNome());	
		System.out.println("Endere�o: " + e1.getEndereco());
		System.out.println("Telefone: " + e1.getTelefone());
		System.out.println("C�digo Setor: " + e1.getCodigoSetor());
		System.out.println("Imposto: " + e1.getimposto());		
		System.out.println("Salario Base: " + e1.getSalarioBase());
		System.out.println("Calculo Sal�rio: " + e1.calcularSalario());	
		System.out.println("\n\nNome:  " + admin.getNome() + "\nAjuda de custos (ajudas referentes a viagens, estadias): "+ admin.getAjudaDeCusto());	
		System.out.println("\n\nNome: " + oper.getNome());
		System.out.println("Valor Produ��o: " + oper.getValorProducao());
		System.out.println("Comiss�o: " + oper.getComissao());
		System.out.println("\n\nNome: " + vende.getNome());
		System.out.println("Valor Vendas: " + vende.getValorVendas());
		System.out.println("Comiss�o: " + vende.getComissao());
		
	}

}
