package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int p = sc.nextInt();

		String vectN[] = new String[p];
		int vectI[] = new int[p];
		double vectA[] = new double[p];
		double soma = 0;
		sc.nextLine();
		int menor = 0;

		for (int i = 0; i < p; i++) {
			System.out.println("Dados da " + (i + 1) + "pessoa:");
			System.out.print("Nome: ");
			vectN[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectI[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectA[i] = sc.nextDouble();
			sc.nextLine();
			soma = soma + vectA[i];
		}

		double media = soma / p;

		System.out.println();
		System.out.printf("Altura media: %.2f%n ", media);

		for (int i = 0; i < p; i++) {
			if (vectI[i] < 16) {
				menor++;
			}
		}
		double porcentagem = (menor * 100.0) / p;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

		for (int i = 0; i < p; i++) {
			if (vectI[i] < 16) {
				System.out.println(vectN[i]);
			}
		}

		sc.close();
	}

}
