package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(123, 456);
		Conta cc2 = new ContaCorrente(183, 458);
		Conta cc3 = new ContaCorrente(33, 46);
		Conta cc4 = new ContaCorrente(13, 98);
		
		lista.add(cc);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref =  lista.get(3);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
//		for(int i = 0; i < lista.size(); i++) {
//			Object objeto = lista.get(i);
//			System.out.println(objeto);
//		}
		
		for(Conta o: lista) {
			System.out.println(o);
		}
		
	}
	
}
