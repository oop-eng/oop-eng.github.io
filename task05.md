[<< Previous task](task04.md) | [Practice tasks](readme.md#practice) | [Next task >>](task06.md)

<span id="task_05"></span>
## 5. Basic Object-Oriented Programming in Java

- [The Java Tutorials - What Is an Object?](https://docs.oracle.com/javase/tutorial/java/concepts/object.html)
- [The Java Tutorials - What Is a Class?](https://docs.oracle.com/javase/tutorial/java/concepts/class.html)
- [The Java Tutorials - What Is a Package?](https://docs.oracle.com/javase/tutorial/java/concepts/package.html)

> **Hint:**
> - Class names start with upper case.
> - Names for methods, variables, and packages start with lower case.
> - Indent nested blocks consistently.

1) Make a new Eclipse project called `shapes` or something similar. Your eventual goal will be to make a `Circle` class with various capabilities (see below), and a test routine that makes some circles and tests them out. Put your `Circle` class and your test routine in two separate classes, like this:

```java
public class Circle {
	public double radius;
	...
}
```

```java
public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle(...);
		...
	}
}
```

Capabilities:

- Give the `Circle` class a `radius` field of type double.
- Give `Circle` a `getArea` method that computes the area (Pi * r * r).
- Give `Circle` a constructor to which you can pass the `radius`.
- Have the constructor use the `this` keyword.

> **Hint:** Unless you have previous Java experience, I strongly recommend you build up to the solution in a piecemeal fashion. For example, first make a `Circle` class with a `radius`field only, and test it out from the main in `CircleTest`. Then add the `getArea` method, and test it. Then add in a constructor. Then test it out again. Then change the constructor to use the `this` keyword, and test yet again.
>
> **Hint:** The `Circle` class does not have a main, so you cannot execute it directly. You only directly run the `CircleTest` class, similar to the following.

```java
public class CircleTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			double radius = 10 * Math.random();
			Circle c = new Circle(radius);
			System.out.println("Circle " + i);
			System.out.println("Generated radius: " + radius);
			System.out.println("Stored radius:    " + c.radius);
			System.out.println();
		}
	}
}
```

2) Modify `CircleTest` class to create an array of 100 circles, each with a random radius. Print out the sum of the areas of the circles. Also print the biggest and smallest areas.

> **Hint:** Remember that in the two-step array allocation process, the following line only makes space for 100 circles (or, more technically, it allocates an array of 100 null Circle pointers), it does not create any circles: `Circle[] circles = new Circle[100];`
>
> **Hint:** To actually create the circles, you have to do a loop as shown below.

```java
for(int i = 0; i < circles.length; i++) {
	circles[i] = new Circle(...);
}
```

3) Create a `Rectangle` class that contains `width` and `height` fields. Also give it a `getArea` method. Again, make a few test cases using a `RectangleTest` class similar to the following.

```java
public class RectangleTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			double width = 20 * Math.random();
			double height = 10 * Math.random();
			Rectangle r = new Rectangle(width, height);
			System.out.println("Rectangle " + i);
			System.out.println("Width:  " + r.width);
			System.out.println("Height: " + r.height);
			System.out.println("Area:   " + r.getArea());
			System.out.println();
		}
	}
}
```

<span id="task_05_homework"></span>
## Homework

Create a `Square` class with `width` and `getArea`. Then, give both `Square` and `Circle` `setArea` methods that let you specify a desired area. Make a few test cases using a `SquareTest` class like as the following.

```java
public class SquareTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			double width = 10 * Math.random();
			Square s = new Square(width);
			System.out.println("Square " + i);
			System.out.println("Width:  " + s.width);
			System.out.println("Area:   " + s.getArea());
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			double area = 100 * Math.random();
			Square s = new Square(0.0);
			s.setArea(area);
			System.out.println("Square " + i);
			System.out.println("Width:          " + s.width);
			System.out.println("Requested area: " + area);
			System.out.println("Actual Area:    " + s.getArea());
			System.out.println();
		}
	}
}
```

<br>

[<< Previous task](task03.md) | [Practice tasks](readme.md#practice) | [Next task >>](task05.md)

