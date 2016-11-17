package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	

	
	// Getters and Setters

	public String getNome(){
		return nome;
	}
	
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public double getValor () {
		return this.valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public String getIsbn(){
		return isbn;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	
	public Autor getAutor(){
		return autor;
	}
	
	public void setAutor(Autor autor){
		this.autor = autor;
	}
	
	// construtor
	
	public Livro(Autor autor){
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}
	
	//
	
	/*
	public Livro() {
		System.out.println("Novo Livro Criado");	
	}
	
	*/
	// metodos
	
	boolean temAutor(){
		return this.autor != null;
	}
	
	public void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descricao: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if(this.temAutor()){
			this.autor.mostrarDetalhes();
		}
		
		
		System.out.println("--");
	}
	
	
	
		
}
