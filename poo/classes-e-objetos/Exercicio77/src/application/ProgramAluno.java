package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Estudante;

public class ProgramAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante aluno = new Estudante();

		aluno.name = sc.nextLine();
		aluno.Num1 = sc.nextDouble();
		aluno.Num2 = sc.nextDouble();
		aluno.Num3 = sc.nextDouble();

		aluno.GradeFinal();
		System.out.println(aluno.GradeFinal());
		aluno.ResultadoFinal();
		System.out.println(aluno.ResultadoFinal());

		if (aluno.GradeFinal() < 60) {
			System.out.println("Missing " + aluno.Missing() + " Points");

		}

		sc.close();
	}

}
