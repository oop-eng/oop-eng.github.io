package ua.khpi.xone.shapes0;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return (radius);
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (Math.PI * radius * radius);
	}

	public void setArea(double area) {
		radius = Math.sqrt(area / Math.PI);
	}

	public String toString() {
		return "Circle: radius = " + getRadius();
	}
}
