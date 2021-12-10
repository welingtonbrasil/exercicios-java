package exercicios_secao_8;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class exercicio_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		double percentage = 0;
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		double salary = sc.nextDouble();
		emp.setGrossSalary(salary);
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n",emp.name, emp.netSalary());
		System.out.print("\nWich percentage to increase salary? ");
		percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.printf("\nUpdated data: %s, $ %.2f",emp.name, emp.netSalary());
		
		sc.close();

	}

}
