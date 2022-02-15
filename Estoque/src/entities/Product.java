package entities;

public class Product {
	// Objeto Product - armazena os dados dos produtos (nome, preço, quantidade)
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		// Funcao totalValueInStock - Calcula o valor total de produtos em estoque
		return price * quantity;
	}
	public void addProducts(int quantity) {
		// Funcao addProducts - adiciona mais produtos ao estoque
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		// Funcao removeProducts - remove produtos do estoque
		this.quantity -= quantity;
	}
	public String toString() {
		// Formatação de texto para saída de dados
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
		
		
	}
	

}
