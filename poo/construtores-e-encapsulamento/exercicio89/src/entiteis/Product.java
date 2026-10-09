package entiteis;

public class Product {

	private String name;
	private int numeroConta;
	private double saldoConta;

	public Product(String name, int numeroConta) {
		this.name = name;
		this.numeroConta = numeroConta;
	}

	public Product(String name, int numeroConta, double saldoConta) {

		this(name, numeroConta);
		this.saldoConta = saldoConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public double Deposito(double deposito) {
		return saldoConta = saldoConta + deposito;
	}

	public double Saque(double saque) {
		return saldoConta = saldoConta - saque - 5;
	}

	public String toString() {
		return "Account " + numeroConta + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", saldoConta);

	}
}
