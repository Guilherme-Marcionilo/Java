
public class Cliente {
	
	String nomeCliente;
	String email;
	
	void Envia() {
		System.out.println("Aguarde um instante. Irei encaminhar no seu email, o passo a passo!");
	}
	
	String getNome(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		
		return nomeCliente;
	}
	
	String saidaNome (String nomeCliente){
		return nomeCliente;
	}
}
