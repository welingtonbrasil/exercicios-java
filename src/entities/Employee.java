package entities;

public class Employee {
	public String name;
	private double grossSalary;
	public double tax;
	private int id;
	
	public Employee() {
	}
		
	public Employee(String name, double grossSalary) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
	}
	
	public Employee(int id, String name, double grossSalary) {
		super();
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary = (this.grossSalary * (percentage/100)) + this.grossSalary;
	}
	
	public String toString() {
		return id + ", " + name + ", $ " + String.format("%.2f", netSalary());
	}

}
