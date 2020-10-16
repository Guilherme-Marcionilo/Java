
public class ContaBancaria_main {

	public static void main(String[] args) {
		
		ContaBancaria cont = new ContaBancaria("Disponivel",200,1000);
		
		System.out.println(cont.saque);
		System.out.println(cont.saldo);
		System.out.println(cont.divida);

	}

}
