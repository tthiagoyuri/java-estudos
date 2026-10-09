package entities;

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double width;
		double height;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor de Width: ");
		width = sc.nextDouble();
		System.out.println("Entre com o valor de Height: ");
		height = sc.nextDouble();

		Rectangle rectangle = new Rectangle(width, height);

		System.out.printf("AREA = %.2f", rectangle.area());
		System.out.println();
		System.out.printf("PERIMETER = %.2f", rectangle.perimeter());
		System.out.println();
		System.out.printf("DIAGONAL = %.2f", rectangle.diagonal());

		sc.close();

	}

	double width;
	double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;

	}

	public double area() {
		return width * height;

	}

	public double perimeter() {
		return (width + height) * 2;
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);

	}

}
