package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		sc.nextLine();
		double menorAltura, maiorAltura;
		double[] vectA = new double[N];
		char[] vectG = new char[N];
		double media = 0, soma = 0;
		int quantidade = 0;
		int quantidadeHomens = 0;
		for (int i = 0; i < N; i++) {
			System.out.println("Digite nome da : " + (i + 1) + "ª pessoa:");
			vectA[i] = sc.nextDouble();
			System.out.println("Genero da : " + (i + 1) + "ª pessoa:");
			vectG[i] = sc.next().charAt(0);
		}

		menorAltura = vectA[0];
		maiorAltura = vectA[0];

		for (int i = 1; i < N; i++) {
			if (vectA[i] < menorAltura) {
				menorAltura = vectA[i];
			}
			if (vectA[i] > maiorAltura) {
				maiorAltura = vectA[i];
			}

		}
		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);

		for (int i = 0; i < N; i++) {
			if (vectG[i] == 'f') {
				quantidade = quantidade + 1;
				soma = soma + vectA[i];
				media = soma / quantidade;
			}
		}
		System.out.printf("Media das alturas das mulheres = %.2f%n ", media);

		for (int i = 0; i < N; i++) {
			if (vectG[i] == 'm') {
				quantidadeHomens = quantidadeHomens + 1;
			}
		}

		System.out.println("Numero de homnes = " + quantidadeHomens);

		sc.close();
	}

}
