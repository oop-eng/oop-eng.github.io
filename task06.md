[<< Previous task](task05.md) | [Practice tasks](readme.md#practice) | [Next task >>](task07.md)

<span id="task_06"></span>
## 6. Object-Oriented Programming: Inheritance

- [The Java Tutorials - Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html).
- [w3schools - Java Inheritance](https://www.w3schools.com/java/java_inheritance.asp).
- [JavaDoc](https://en.wikipedia.org/wiki/Javadoc).
- [How to Write Doc Comments for the Javadoc Tool](https://www.oracle.com/technetwork/java/javase/tech/index-137868.html).

> **Note:** Make your code follow the [coding standards](https://en.wikipedia.org/wiki/Naming_convention_(programming)#Java).

1) Copy your `shapes` Eclipse project and give it a new name.

2) Change your `Circle` class so that the fields are private and you have `getXxx` and `setXxx` methods to lookup and change the values of the fields. If you have `Rectangle` and `Square` classes, change them as well.

> **Hint:** Remember that Eclipse can insert the **getter** and **setter** methods for you, if you want it to (see the `Source` menu).

Run some test cases where you create a few shapes and then access their areas.

3) Add some simple **JavaDoc** comments above each class, constructor, and public method.

> **Hint:** Run *JavaDoc* from *Eclipse*: select the project, then go to `Project` menu and choose `Generate Javadoc...`. Once the documentation is created, look at it by opening the doc folder and dragging `index.html` onto your browser.

4) If you haven’t already made a `Square` class, do so. Make your `Square` inherit from `Rectangle`, but still enforce the restriction that the `width` and the `height` are the same. 

> **Hint:** Override some method(s). You will find this problem to be a bit ugly, because you have two competing interests. On the one hand, you want squares to be rectangles because they are in real life. But on the other hand, the `Rectangle` class has separate `width` and `height` accessor methods that you can’t totally get rid of in `Square`. Whatever solution you come up with, be sure it is never possible for the `width` of a `Square` to be different from its `height`.

Run some test cases where you create squares, change their `width`/`height`, and then print out the various parameters.

5) Add a `toString` method to each of `Circle`, `Rectangle`, and `Square`. Have the `toString` method show the relevant parameters of the object. Print out some instances of your classes, but do not explicitly call `toString` in your code.

Make a few test cases using a `CircleTest`, `RectangleTest` and `SquareTest` classes like as the following.

```java
/**
 * Tests some Circle capabilities. Relies on Circles having a toString that
 * shows the radius and area.
 */
public class CircleTest {
	 public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Circle c = new Circle(10 * Math.random());
			System.out.println(c);
		}
	}
}
```

```java
/**
 * Tests some Rectangle capabilities. Relies on Rectangles having a toString that
 * shows the width, height, and area.
 */
public class RectangleTest {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Rectangle r = 
				new Rectangle(10 * Math.random(), 20 * Math.random());
			System.out.println(r);
		}
	}
}
```

```java
/**
 * Tests some Square capabilities. Relies on Squares having a toString that
 * shows the side length and area.
 */
public class SquareTest {
	public static void main(String[] args) {
		System.out.println("Creating square with side 10");
		Square s = new Square(10);
		System.out.println(s);
		System.out.println("Setting width to 5");
		s.setWidth(5);
		System.out.println(s);
		System.out.println("Setting height to 6");
		s.setHeight(6);
		System.out.println(s);
		System.out.println("Setting area to 49");
		s.setArea(49);
		System.out.println(s);
	}
}
```

> **Note:**
> - Make all instance variables (fields) private. Hook them to the outside with `getXxx` and/or `setXxx`.
> - Use JavaDoc-style comments from the very beginning.
> - Put all code in packages.
> - Make output more readable by implementing toString.

<br>

[<< Previous task](task05.md) | [Practice tasks](readme.md#practice) | [Next task >>](task07.md)

