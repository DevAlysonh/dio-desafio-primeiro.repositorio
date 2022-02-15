package entities;

public class Employee {
	//Objeto Employee - armazena os dados de um funcion�rio (nome, salariobruto, imposto)
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		// Fun��o netSalary - calcula o salario liquido do funcion�rio (salario bruto - imposto)
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		// Fun��o increaseSalary - Calcula o aumento em porcentagem dado pelo patr�o
		grossSalary += grossSalary * percentage / 100.0 ;
		
	}
	
	public String toString() {
		// Fun��o de formata��o para sa�da de texto.
		return name + ", $ " + String.format("%.2f", netSalary());
		
	}
	

}
