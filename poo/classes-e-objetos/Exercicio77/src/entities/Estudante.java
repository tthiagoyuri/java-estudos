package entities;

public class Estudante {

	public String name;
	public Double Num1, Num2, Num3;

	public Double GradeFinal() {
		return Num1 + Num2 + Num3;

	}

	public String ResultadoFinal() {

		if (GradeFinal() >= 60) {
			return "PASS";

		} else {
			return "FAILED";
		}

	}

	public Double Missing() {
		return 60 - GradeFinal();
	}
}
