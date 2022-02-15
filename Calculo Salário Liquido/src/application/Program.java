package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		/*
		 * Este programa calcula o Sal�rio liquido de um funcionario (sal�rio bruto - tax),
		 * retorna o sal�rio liquido. Pergunta se o empregador deseja dar um aumento ao funcion�rio,
		 * caso sim, pergunta a porcentagem do aumento e em seguida retorna o novo valor liquido!
		 * Caso n�o, retorna: o salario nao foi modificado.
		 */
		int dec ;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name=sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("I would like to give a raise to " + employee.name + "? alys(1-YES/0-NO)");
		dec = sc.nextInt();
		
		if (dec==1) {
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data " + employee);
		} else {
			System.out.println();
			System.out.print("Salary of " + employee.name +" hasn't changed!");
			
		}
		sc.close();

	}

}
