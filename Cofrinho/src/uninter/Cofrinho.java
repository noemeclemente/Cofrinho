package uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	// Lista para armazenar as moedas no cofrinho
	private ArrayList<Moeda> listaMoedas;
	
	// Construtor para inicializar o cofrinho com uma lista vazia de moedas
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	
	// Método para adicionar uma moeda ao cofrinho
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	// Método para remover uma moeda do cofrinho
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	// Método para listar as moedas presentes no cofrinho
	public void listagemMoedas() {
		// Verifica se o cofrinho está vazio
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Não existe nenhuma moeda no cofrinho.");
		}
		// Itera sobre as moedas presentes no cofrinho e exibe suas informações
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}

	// Método para calcular o total convertido de todas as moedas no cofrinho
	public double totalConvertido() {
		// Verifica se o cofrinho está vazio
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		// Variável para acumular o valor total convertido
		double valorAcumulado = 0;
		// Itera sobre as moedas presentes no cofrinho e acumula seus valores convertidos
		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		return valorAcumulado;
	}
}

