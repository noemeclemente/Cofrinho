package uninter;

import java.util.Scanner;

// Classe que representa um menu para interagir com um cofrinho de moedas
public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	// Construtor para inicializar o Scanner e o cofrinho
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	// Método para exibir o menu principal
	public void exibirMenuPrincipal() {
		System.out.println("Cofrinho");
		System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Calcular valor total convertido para real");
		System.out.println("0 - Encerrar");
		
		// Lê a opção selecionada pelo usuário
		String opcaoSelecionada = sc.next();
		
		switch(opcaoSelecionada) {
		case "0":
			System.out.println("Sistema encerrado!");
			break;
		case "1":
			exibirSubMenuAdicionarMoedas();
			exibirMenuPrincipal();
			break;
		case "2": 
			exibirMenuRemoverMoedas();
			exibirMenuPrincipal();
			break;
		case "3":
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();
			break; 
		case "4":
			double valorTotalConvertido = cofrinho.totalConvertido();
			System.out.println("O valor total convertido para real é de: " + valorTotalConvertido);
			exibirMenuPrincipal();
			break;
			
		default: 
			System.out.println("Opção inválida!");
			exibirMenuPrincipal();
			break;
		}
	} 
	
	// Método para exibir o submenu para adicionar moedas ao cofrinho
	private void exibirSubMenuAdicionarMoedas() {
		System.out.println("Escolha Moeda: ");
		System.out.println("1 - Real: ");
		System.out.println("2 - Dólar: ");
		System.out.println("3 - Euro: ");
		
		int opcaoEscolhida = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		String valorStringInserido = sc.next();
		valorStringInserido = valorStringInserido.replace(",", ".");
		double valorMoeda = Double.valueOf(valorStringInserido);
		
		// Adiciona a moeda selecionada ao cofrinho
		if (opcaoEscolhida == 1) {
			Real moeda = new Real(valorMoeda);
			cofrinho.adicionar(moeda);
		} else if (opcaoEscolhida == 2) {
			Dolar moeda = new Dolar(valorMoeda);
			cofrinho.adicionar(moeda);
		} else if (opcaoEscolhida == 3) {
			Euro moeda = new Euro(valorMoeda);
			cofrinho.adicionar(moeda);
		} else {
			System.out.println("Opção inválida!");
			exibirMenuPrincipal();
		}
		System.out.println("Moeda adicionada com sucesso!");
	}
	
	// Método para exibir o submenu para remover moedas do cofrinho
	private void exibirMenuRemoverMoedas() {
		System.out.println("Escolha Moeda: ");
		System.out.println("1 - Real: ");
		System.out.println("2 - Dólar: ");
		System.out.println("3 - Euro: ");
		
		int opcaoEscolhida = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		String valorStringInserido = sc.next();
		valorStringInserido = valorStringInserido.replace(",", ".");
		double valorMoeda = Double.valueOf(valorStringInserido);
		
		// Remove a moeda selecionada do cofrinho
		if (opcaoEscolhida == 1) {
			Real moeda = new Real(valorMoeda);
			cofrinho.remover(moeda);
		} else if (opcaoEscolhida == 2) {
			Dolar moeda = new Dolar(valorMoeda);
			cofrinho.remover(moeda);
		} else if (opcaoEscolhida == 3) {
			Euro moeda = new Euro(valorMoeda);
			cofrinho.remover(moeda);
		} else {
			System.out.println("Moeda não encontrada!");
			exibirMenuPrincipal();
		}
		System.out.println("Solicite uma listagem de moedas para conferir o que sobrou!");

	}
}
