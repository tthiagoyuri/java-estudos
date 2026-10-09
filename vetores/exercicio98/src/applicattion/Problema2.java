package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double vect[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.print("Valores = ");
		for (int i = 0; i < n; i++) {
			System.out.print(vect[i] + " ");

		}

		double soma = 0;

		for (int i = 0; i < n; i++) {
			soma = soma + vect[i];
		}

		System.out.println();
		System.out.println("Soma = " + soma);

		double media = soma / n;

		System.out.println("Media = " + media);

		sc.close();
	}

}
