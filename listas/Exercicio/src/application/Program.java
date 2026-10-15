package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionarios serao cadastrados?");
		int N = sc.nextInt();

		List<Funcionario> funcionarios = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			System.out.println("Funcionario #" + (i + 1) + ":");

			boolean idValido = false;
			int id = 0;

			while (!idValido) {
				idValido = true;

				System.out.print("Id:");
				id = sc.nextInt();
				sc.nextLine();

				for (int j = 0; j < funcionarios.size(); j++) {
					if (id == funcionarios.get(j).getId()) {
						idValido = false;
						System.out.println("Id ja cadastrado! Digite outro.");
						break;
					}
				}
			}

			System.out.print("Nome:");
			String nome = sc.nextLine();

			System.out.print("Salario:");
			double salario = sc.nextDouble();

			Funcionario funcionario = new Funcionario(id, nome, salario);
			funcionarios.add(funcionario);
		}

		System.out.print("Entre com o id do funcionario que tera o salario aumentado:");
		int id = sc.nextInt();

		boolean encontrou = false;

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId() == id) {
				System.out.print("Qual a porcentagem de aumento?");
				double porcentagem = sc.nextDouble();

				funcionario.aumentaSalario(porcentagem);
				encontrou = true;
				break;
			}
		}

		if (!encontrou) {
			System.out.println("Id nao existente!");
			System.out.println();
		}

		System.out.println("Lista de funcionarios:");

		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}

		sc.close();
	}
}