package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Desafio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos quartos serao alugados?");
		int quarto = sc.nextInt();
		sc.nextLine();
		Aluno[] aluguel = new Aluno[10];

		for (int i = 0; i < quarto; i++) {
			String nome, email;
			int numeroQuarto;
			System.out.println("Alugue # " + (i + 1));
			System.out.printf("Nome: ");
			nome = sc.nextLine();
			System.out.printf("Email: ");
			email = sc.nextLine();
			System.out.printf("Quarto: ");
			numeroQuarto = sc.nextInt();
			sc.nextLine();

			aluguel[numeroQuarto] = new Aluno(nome, email);
		}

		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			if (aluguel[i] != null) {
				System.out.println(i + ": " + aluguel[i].getNome() + ", " + aluguel[i].getEmail());
			}
		}

		sc.close();
	}

}
