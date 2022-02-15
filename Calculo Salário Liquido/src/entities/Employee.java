package entities;

public class Employee {
	//Objeto Employee - armazena os dados de um funcionário (nome, salariobruto, imposto)
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		// Função netSalary - calcula o salario liquido do funcionário (salario bruto - imposto)
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		// Função increaseSalary - Calcula o aumento em porcentagem dado pelo patrão
		grossSalary += grossSalary * percentage / 100.0 ;
		
	}
	
	public String toString() {
		// Função de formatação para saída de texto.
		return name + ", $ " + String.format("%.2f", netSalary());
		
	}
	

}
