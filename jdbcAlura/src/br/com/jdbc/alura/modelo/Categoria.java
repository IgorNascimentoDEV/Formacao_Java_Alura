package br.com.jdbc.alura.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private int id;
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public Categoria(int id, String nome) {
	
	this.id = id;
	this.nome = nome;
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionar(Produto produto) {
		produtos.add(produto);
	}

	public List<Produto> getProdutos() {
		
		return produtos;
	}
	
}
