package ua.khpi.xone.shapes0;

public class ShapeUtils {
	public static void printShapes(Object[] shapes) {
		for (Object s : shapes) {
			System.out.println(s);
		}
	}

	public static double sumAreas(Object[] shapes) {
		double sum = 0;
		for (Object s : shapes) {
			// sum = sum + s.getArea(); // Illegal! Object does not have getArea
		}
		return sum;
	}

	private ShapeUtils() {
		// Uninstantiable class: static methods only
	}
}
