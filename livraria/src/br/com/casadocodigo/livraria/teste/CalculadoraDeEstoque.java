package br.com.casadocodigo.livraria.teste;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		

		double soma = 0;
		for (double i = 0; i < 35; i ++) {
			soma += 59.90;
		}
		
		
		String texto = "O total em estoque eh R$ ";
		System.out.println(texto+ soma);
	
		
		if (soma < 150 ) {
			System.out.println("Seu estoque esta muito baixo");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque esta muito alto");
		} else {
			System.out.println("Seu estoque esta bom");
		}
		

	

		
	}
}
