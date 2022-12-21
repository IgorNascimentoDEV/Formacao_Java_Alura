package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.depositar(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.depositar(200);
		
		SeguroDeVida seguro = new SeguroDeVida();
		CalculadorDeImposto cal = new CalculadorDeImposto();
		cal.registra(cc);
		cal.registra(seguro);
			
		System.out.println(cal.getTotalImposto());
		
		
	}

}
