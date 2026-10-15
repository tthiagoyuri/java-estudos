package entities;

public class Funcionario {

	private int id;
	private String nome;
	private double salario;

	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void aumentaSalario(double porcentagem) {
		double aumento;
		aumento = (salario * porcentagem) / 100;
		salario = aumento + salario;
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}