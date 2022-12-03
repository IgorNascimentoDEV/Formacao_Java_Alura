package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta continha = new Conta();
		Conta continha02 = new Conta();
		
		/*Testando metodos de depositar*/
		
		continha.depositar(100);
		System.out.println(continha.saldo);
		
		/*Testando metodos de sacar*/
	    continha.sacar(20);
		System.out.println(continha.saldo);
		
		/*Testando metodos de transfere*/
		continha02.depositar(1000);
		
		if(continha02.transferir(500, continha)) {
			System.out.println("Transferencia feita com sucesso");
		}else {
			System.out.println("Transferencia nao realizada");
		}
		
		System.out.println(continha.saldo);
		System.out.println(continha02.saldo);
		
		
	}
}
