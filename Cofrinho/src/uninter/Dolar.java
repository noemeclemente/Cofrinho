package uninter;

public class Dolar extends Moeda {
	
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}

	// Método sobrescrito da classe Moeda para exibir informações sobre o Dólar
	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
	}

	// Método sobrescrito da classe Moeda para converter o valor do Dólar para outra moeda (nesse caso, Real)
	@Override
	public double converter() {
		// Utilizando uma taxa de conversão fixa para simplificar (5.0)
		return this.valor * 5.0;
	}

	// Método sobrescrito da classe Object para verificar se dois objetos Dólar são iguais
	@Override
	public boolean equals(Object objeto) {
		// Verifica se o objeto passado é do tipo Dólar
		if (this.getClass() != objeto.getClass()){
			return false;	
		}
		// Faz um cast do objeto para Dólar para poder comparar os valores
		Dolar objetoDeDolar = (Dolar) objeto;
		// Compara os valores dos Dólares
		if (this.valor != objetoDeDolar.valor) {
			return false;
		}
		return true;
	}	
}
