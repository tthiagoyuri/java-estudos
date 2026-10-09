package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		double vect[] = new double[N];
		double maior = vect[0];
		int posicao = 0;

		for (int i = 0; i < N; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		for (int i = 1; i < N; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}
		}

		System.out.println("Maior valor " + maior);
		System.out.println("Posicao do maior valor = " + posicao);

		sc.close();
	}

}
