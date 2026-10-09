package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Problema9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int pessoaVelha = 0;
		System.out.println("Quantas pessoa voce vai digitar ? ");
		int p = sc.nextInt();

		String[] vectN = new String[p];
		int[] vectI = new int[p];
		int maiorIdade = 0;

		sc.nextLine();

		for (int i = 0; i < p; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.printf("Nome: ");
			vectN[i] = sc.nextLine();
			System.out.printf("Idade: ");
			vectI[i] = sc.nextInt();
			sc.nextLine();

		}

		for (int i = 0; i < p; i++) {
			if (vectI[i] > maiorIdade) {
				maiorIdade = vectI[i];
				pessoaVelha = i;
			}
		}

		System.out.println("Pessoa mais velha: " + vectN[pessoaVelha]);

		sc.close();
	}

}
