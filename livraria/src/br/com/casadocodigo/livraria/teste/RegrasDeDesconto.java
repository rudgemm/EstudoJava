package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);
		
		
		//System.out.println("Valor Atual: " + livro.getValor());
		
		if (!livro.aplicaDescontoDe(0.3)){
			System.out.println("Desconto n�o pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}
		
	
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if (!ebook.aplicaDescontoDe(0.15)){
			System.out.println("Desconto n�o pode ser maior do que 15%");
		} else {
			System.out.println("Valor com desconto: " + ebook.getValor());
		}
		
	/* Entender melhor, como apresentar apenas nome do autor nessa situa��o
	System.out.println(ebook.getAutor()); // N�o apresenta
	ebook.mostrarDetalhes(); // Apresenta
	*/
		
	}
	

}
