package br.com.jdbc.alura.modelo;

public class Produto {

	private Integer id;
	private String nome;
	private String descricao;

	public Produto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Produto(Integer id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	 public Integer getId() {
		return id;
	}
	 public void setId(Integer id) {
		this.id = id;
	}
	 
	 @Override
	public String toString() {
		return "O produto e: " + nome + " " + descricao;
	}

}
