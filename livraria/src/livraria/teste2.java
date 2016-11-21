package livraria;

import java.io.FileNotFoundException;

public class teste2  {

	public static void main(String[] args) {
		try {
			teste.abreArquivo();
		} catch (FileNotFoundException e1){
			System.out.println("Não consegui abrir o arquivo");
		}
	}
	
}
