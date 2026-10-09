package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			double quantidade;

			System.out.println("What is the dollar price? ");
			CurrencyConverter.dollar = sc.nextDouble();
			System.out.println("How many dollar will be bought?");
			quantidade = sc.nextDouble();
			CurrencyConverter.Comprar(quantidade);
			System.out.println(CurrencyConverter.ValorFinal(quantidade));
		}
	}

}
