package uninter;

public class Euro extends Moeda {
	
	// Construtor que recebe o valor inicial da moeda Euro
	public Euro(double valorInicial) {
		this.valor = valorInicial;
	}

	// Método sobrescrito da classe Moeda para exibir informações sobre o Euro
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
	}

	// Método sobrescrito da classe Moeda para converter o valor do Euro para outra moeda (nesse caso, Real)
	@Override
	public double converter() {
		return this.valor * 5.40;
	}

	// Método sobrescrito da classe Object para verificar se dois objetos Euro são iguais
	@Override
	public boolean equals(Object objeto) {
		// Verifica se o objeto passado é do tipo Euro
		if (this.getClass() != objeto.getClass()){
			return false;	
		}
		// Faz um cast do objeto para Euro para poder comparar os valores
		Euro objetoDeEuro = (Euro) objeto;
		// Compara os valores dos Euros
		if (this.valor != objetoDeEuro.valor) {
			return false;
		}
		return true;
	}	
}
