package util;

public class CurrencyConverter {

	public static double dollar;

	public static double Comprar(double valor) {
		return dollar * valor;
	}

	public static double ValorFinal(double Total) {
		return (Comprar(Total) * 6 / 100) + Comprar(Total);
	}

}
