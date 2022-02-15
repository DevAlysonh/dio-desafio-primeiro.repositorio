package entities;

public class Student {
	//Objeto Student - armazena o nome e as notas do aluno	
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		//Fun��o finalGrade - soma as tr�s notas do aluno
		
		return nota1+nota2+nota3;
	}
	
	public double missingPoints() {
		/*
		 * Fun��o missingPoints - decide se o aluno foi aprovado ou n�o,
		 * conforme a nota m�nima exigida, e tambem retorna quantos pontos
		 * faltaram para que ele a atingisse.
		 */
		
		if (finalGrade() < 60) {
			return 60 - finalGrade();
		} else {return 0.0;}
	}
}
