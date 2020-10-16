package classes;

public class ListaExercicio_3 {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado("GUi","Disney","79283-213", 3,4567,60);
		Administrador admin = new Administrador("Ajuda",12323);
		
		System.out.println("Nome: " + e1.getNome());	
		System.out.println("Endereço: " + e1.getEndereco());
		System.out.println("Telefone: " + e1.getTelefone());
		System.out.println("Código Setor: " + e1.getCodigoSetor());
		System.out.println("Imposto: " + e1.getimposto());
		System.out.println("Salario Base: " + e1.getSalarioBase());
		System.out.println("Calculo Salário: " + e1.calcularSalario());	
		
		e1.setNome("Novo nome");
		e1.setEndereco("Disney");
		e1.setTelefone("4002-89222");
		e1.setCodigoSetor(2);
		e1.setimposto(80);
		e1.setSalarioBase(1045);
		
		System.out.println("Nome: " + e1.getNome());	
		System.out.println("Endereço: " + e1.getEndereco());
		System.out.println("Telefone: " + e1.getTelefone());
		System.out.println("Código Setor: " + e1.getCodigoSetor());
		System.out.println("Imposto: " + e1.getimposto());		
		System.out.println("Salario Base: " + e1.getSalarioBase());
		System.out.println("Calculo Salário: " + e1.calcularSalario());	
		System.out.println("Nome:  " + admin.getNome() + "\nAjuda de custos (ajudas referentes a viagens, estadias): "+ admin.getAjudaDeCusto());	
		
		
		
	}

}
