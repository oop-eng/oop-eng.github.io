package ua.khpi.xone.shapes0;

public class Rectangle {
	private double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public String toString() {
		return "Rectangle: width = " + getWidth() + ", height = " + getHeight();
	}
}
