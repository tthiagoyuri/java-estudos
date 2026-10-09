package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Problema7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		double soma = 0;
		double vect[] = new double[N];
		double media;

		for (int i = 0; i < N; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();

		}

		for (int i = 0; i < N; i++) {
			soma = soma + vect[i];
		}

		media = soma / N;
		System.out.printf("Media do vetor = %.3f%n", media);

		System.out.println("Elementos abaixo da media: ");

		for (int i = 0; i < N; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}

		sc.close();
	}

}
