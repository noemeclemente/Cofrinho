# Cofrinho de Moedas

Este é um projeto em Java que simula um cofrinho de moedas, onde é possível adicionar, remover, listar moedas e calcular o valor total convertido para uma moeda padrão (Real). O sistema suporta três tipos de moedas: Real, Dólar e Euro.

## Funcionalidades

- **Adicionar Moeda**: Adiciona uma moeda ao cofrinho.
- **Remover Moeda**: Remove uma moeda específica do cofrinho.
- **Listar Moedas**: Exibe todas as moedas presentes no cofrinho.
- **Calcular Total Convertido**: Calcula o valor total das moedas convertidas para Real.

## Estrutura do Código

### Classe `Moeda` (abstrata)

Define a estrutura básica para uma moeda, incluindo os métodos abstratos:

- `info()`: Exibe informações sobre a moeda.
- `converter()`: Converte o valor da moeda para Real.

### Classe `Real`, `Dolar` e `Euro`

São subclasses de `Moeda` que implementam os métodos abstratos para cada moeda específica:

- `Real`: O valor é retornado sem conversão.
- `Dolar`: Converte o valor para Real com uma taxa de 5.0.
- `Euro`: Converte o valor para Real com uma taxa de 5.40.

### Classe `Cofrinho`

Gerencia a coleção de moedas no cofrinho e fornece funcionalidades como:

- `adicionar(Moeda moeda)`: Adiciona uma moeda ao cofrinho.
- `remover(Moeda moeda)`: Remove uma moeda do cofrinho.
- `listagemMoedas()`: Lista todas as moedas no cofrinho.
- `totalConvertido()`: Calcula o valor total convertido para Real.

### Classe `Menu`

Responsável por exibir o menu de interação com o usuário e chamar os métodos apropriados do cofrinho:

- `exibirMenuPrincipal()`: Mostra o menu com opções como adicionar, remover, listar moedas e calcular o valor total convertido.
- `exibirSubMenuAdicionarMoedas()`: Permite ao usuário escolher o tipo de moeda a ser adicionada.
- `exibirMenuRemoverMoedas()`: Permite ao usuário remover uma moeda do cofrinho.

### Classe `Principal`

Classe principal que inicializa o menu e dá início à interação com o usuário.

## Exemplo de Execução

```java
public class Principal {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenuPrincipal();
    }
}
```
# Como rodar
- Clone o repositório ou copie os arquivos.
- Compile os arquivos Java:
  ```
  javac uninter/*.java
  ```
  
- Execute o programa:
  
```
java uninter.Principal
```
# Funcionalidades futuras
- Suporte para novas moedas e taxas de conversão atualizáveis.
- Interface gráfica para interação mais intuitiva.

# Contribuições 
Sinta-se à vontade para contribuir com melhorias, novos recursos ou correções. Abra uma issue ou envie um pull request.
  
  


