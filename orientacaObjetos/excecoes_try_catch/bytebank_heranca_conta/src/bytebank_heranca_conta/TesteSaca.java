package bytebank_heranca_conta;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(222, 333);
		
		conta.depositar(200);
		try {
			conta.sacar(10);			
		}catch(Exception ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());

	}

}
