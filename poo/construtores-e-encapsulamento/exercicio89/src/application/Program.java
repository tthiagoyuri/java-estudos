package application;

import java.util.Locale;
import java.util.Scanner;
import entiteis.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroConta;
		String name;
		char opcao;
		Product conta;
		double valorDeposito;
		double valorSaque;
		System.out.println("Enter account number: ");
		numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		name = sc.nextLine();

		System.out.println("Is there initial deposit (y/n)?");
		opcao = sc.next().charAt(0);

		if (opcao == 'y') {
			System.out.println("Enter initial deposit value: ");
			double saldoConta = sc.nextDouble();
			conta = new Product(name, numeroConta, saldoConta);
		} else {
			conta = new Product(name, numeroConta);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		valorDeposito = sc.nextDouble();
		conta.Deposito(valorDeposito);
		System.out.println("Updated account data:");
		System.out.println(conta);

		System.out.println("Enter a withdraw value: ");
		valorSaque = sc.nextDouble();
		conta.Saque(valorSaque);
		System.out.println("Updated account data:");
		System.out.println(conta);

		sc.close();

	}

}
