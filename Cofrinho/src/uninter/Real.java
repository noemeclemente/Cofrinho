package uninter;


public class Real extends Moeda {
	
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);
	}

	@Override
	public double converter() {
		// O valor do Real não é convertido, portanto retorna o próprio valor
		return this.valor;
	}

	@Override
	public boolean equals(Object objeto) {
		// Verifica se o objeto passado é do tipo Real
		if (this.getClass() != objeto.getClass()){
			return false;	
		}
		// Faz um cast do objeto para Real para poder comparar os valores
		Real objetoDeReal = (Real) objeto;
		// Compara os valores dos Reais
		if (this.valor != objetoDeReal.valor) {
			return false;
		}
		return true;
	}	
}
