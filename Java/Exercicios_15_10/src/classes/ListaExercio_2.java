package classes;

public class ListaExercio_2 {

	public static void main(String[] args) {
		
		Fornecedor fornecedor1 = new Fornecedor("Gui", "Pico do Jaraguá", "4002-8922", 2000, 100254);
		
		
		System.out.println("Nome: " + fornecedor1.getNome());
		System.out.println("Endereço: " + fornecedor1.getEndereco());
		System.out.println("Telefone: " + fornecedor1.getTelefone());
		System.out.println("Valor Credito: " + fornecedor1.getValorCredito());
		System.out.println("Valor Dívida: " + fornecedor1.getValorDivida());
		System.out.println("Saldo: " + fornecedor1.obterSaldo());
		
		fornecedor1.setNome("Novo nome");
		fornecedor1.setEndereco("Disney");
		fornecedor1.setTelefone("4002-89222");
		fornecedor1.setValorDivida(20);
		fornecedor1.setValorCredito(9);
				
		System.out.println("Nome: " + fornecedor1.getNome());
		System.out.println("Endereço: " + fornecedor1.getEndereco());
		System.out.println("Telefone: " + fornecedor1.getTelefone());
		System.out.println("Valor Credito: " + fornecedor1.getValorCredito());
		System.out.println("Valor Dívida: " + fornecedor1.getValorDivida());
		System.out.println("Saldo: " + fornecedor1.obterSaldo());
		
	}

}
