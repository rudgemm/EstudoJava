package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional {

	private String waterMark;
	
	public String getWaterMark(){
		return waterMark;
	}
	
	public void setWaterMark (String waterMark){
		this.waterMark = waterMark;
	}
	
	public Ebook (Autor autor){
		super(autor);
	}
	
	// metodos
	
	@Override
	
	public boolean aplicaDescontoDe(double porcentagem){
		if (porcentagem > 0.15) {
			return false;
		}
		System.out.println("Aplicando desconto no Ebook");
		return aplicaDescontoDe(porcentagem);
		
	}
	
	
}
