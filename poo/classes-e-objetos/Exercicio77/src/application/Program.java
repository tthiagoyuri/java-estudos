package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Employee employee = new Employee();

		Double percentage;

		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax : ");
		employee.tax = sc.nextDouble();
		System.out.println("Employee: " + employee.name + ", $ " + employee.NetSalary());
		System.out.println("Wich percentage to increase salarya? ");
		percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		System.out.println("Employee: " + employee.name + ", $ " + employee.NetSalary());

		sc.close();
	}
}
