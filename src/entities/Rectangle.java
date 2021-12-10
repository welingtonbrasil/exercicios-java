package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double Area() {
		return this.width * this.height;
	}
	
	public double Perimeter() {
		return this.width + this.height + this.width + this.height;
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	}
	
	
}
