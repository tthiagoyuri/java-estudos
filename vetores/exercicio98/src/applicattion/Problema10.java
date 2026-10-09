package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Problema10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serao digitados? ");
		int numeroAlunos = sc.nextInt();
		sc.nextLine();

		String[] nome = new String[numeroAlunos];
		double[] primeira = new double[numeroAlunos];
		double[] segunda = new double[numeroAlunos];

		for (int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite nome, primeira e segunda nota do: " + (i + 1) + "ª aluno:");
			nome[i] = sc.nextLine();
			primeira[i] = sc.nextDouble();
			segunda[i] = sc.nextDouble();
			sc.nextLine();
		}

		System.out.println("Alunos aprovados :");
		for (int i = 0; i < numeroAlunos; i++) {
			if ((primeira[i] + segunda[i]) / 2 >= 6) {
				System.out.println(nome[i]);
			}
		}

		sc.close();
	}

}
