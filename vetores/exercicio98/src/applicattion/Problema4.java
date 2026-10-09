package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Problema4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros você vai digitar? ");
		int N = sc.nextInt();

		int vect[] = new int[N];
		int quantidade = 0;

		for (int i = 0; i < N; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("Numeros Pares: ");

		for (int i = 0; i < N; i++) {
			if (vect[i] % 2 == 0) {
				quantidade++;
				System.out.print(vect[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Quantidade de pares = " + quantidade);

		sc.close();
	}
}