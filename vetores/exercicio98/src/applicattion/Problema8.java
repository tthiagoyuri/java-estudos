package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Problema8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int quantidade = 0;
		double media = 0;
		System.out.println("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();

		int vect[] = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();

		}

		for (int i = 0; i < N; i++) {
			if (vect[i] % 2 == 0) {
				soma = soma + vect[i];
				quantidade = quantidade + 1;
			}
		}

		if (quantidade > 0) {
			media = soma / quantidade;
			System.out.println("Media dos pares = " + media);
		} else {
			System.out.println("Nenhum numero par");
		}

		sc.close();
	}

}
