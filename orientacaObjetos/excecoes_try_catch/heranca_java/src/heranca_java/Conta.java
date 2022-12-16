package heranca_java;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	

	
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Criando conta com o numero " + numero);
	}
	
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;			
		}else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta destino) {
		if(this.saldo >= valor) {
			sacar(valor);
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	
	//Metodos acessores
	public double getSaldo() {
		return this.saldo;
	} 
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
