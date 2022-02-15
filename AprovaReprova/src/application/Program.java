package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		/*
		 * Este programa calcula se um determinado aluno foi aprovado ou não
		 * com base na sua nota final. E, caso negativo, retorna quantos 
		 * pontos faltaram para que ele fosse aprovado.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student study = new Student();
		
		System.out.print("Enter Student Name: ");
		study.name=sc.nextLine();
		
		System.out.print("Enter grade1: ");
		study.nota1 =sc.nextDouble();	
		System.out.print("Enter grade2: ");
		study.nota2 =sc.nextDouble();
		System.out.print("Enter grade3: ");
		study.nota3 =sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", study.finalGrade() );
		
		if (study.finalGrade()<60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n",study.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		
		sc.close();		

	}

}
