package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Problema6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter em cada vetor? ");
		int N = sc.nextInt();

		int vectA[] = new int[N];
		int vectB[] = new int[N];
		int vectC[] = new int[N];

		System.out.println("Digite os  valor do vetor A: ");

		for (int i = 0; i < N; i++) {
			vectA[i] = sc.nextInt();
		}

		System.out.println("Digite os  valor do vetor B: ");

		for (int i = 0; i < N; i++) {
			vectB[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}

		System.out.println("Vetor Resultante: ");

		for (int i = 0; i < N; i++) {
			System.out.println(vectC[i]);
		}

		sc.close();
	}
}