package ua.khpi.xone.shapes0;

public class Main {
	public static void main(String[] args) {
		Object[] shapes = { new Circle(10), new Rectangle(20, 30), new Square(40) };
		ShapeUtils.printShapes(shapes);
	}
}
