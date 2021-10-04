[<< Previous task](task03.md) | [Practice tasks](readme.md#practice) | [Next task >>](task05.md)

<span id="task_04"></span>
## 3. Methods and Method Overloading in Java

- [Java Methods](https://www.tutorialspoint.com/java/java_methods.htm).
- [Java Methods](https://www.w3schools.com/java/java_methods.asp).

Create a new Eclipse project named `task04`. Use a package named `ua.khpi.oop.your_first_name.task04` for all created classes.

1) Add a class called `One` to your package. Give it a method named `square` that will take an integer and return the square of the integer. For example, if you pass in `3`, it should return `9`. Your overall code will look roughly like this:

```java
class One {
	public static int square(int x) {
		// Calculate and return the square of 'x'.
		return 0;
	}
}
```

2) Add a second method named `power` to your class. Return the result of `x` raised to `y`th power. For example, if your main method calls `power(2, 3)`, it should return `8`.

```java
public static int power(int x, int y) {
	// Return the result of 'x' raised to 'y'th power.
	return 0;
}
```

3) Add a third method named `power` to your class. This one should be similar to your second method, but shouldn't return any value. Pass an object of class `A` to this method. Modify the object to save the result.

```java
public static void power(A a, int y) {
	// Raise 'a.x' to the 'y'th power.
}
```

Pre-create a simple class `A`:

```java
class A {
	int x;
}
```

4) Add a fourth method named `power` to your class. Pass an array to this method. Raise each element of an array to the `y`th power.

```java
public static void power(int[] array, int y) {
	// Raise each element of an array to the 'y'th power.
}
```

5) Use the following class `Main` to test the implemented methods of class `One`.

```java
class Main {
	public static void main(String[] args) {
		System.out.println("Begin...");
		// Use the following VM arguments: -enableassertions
		{
			int x = 3;
			int y = 2;
			int expected = 9;
			int actual = One.power(x, y);
			// Is the 'expected' equal to the 'actual'?
			assert expected == actual : "expected = " + expected + " but actual = " + actual;
		}
		{
			A actual = new A();
			actual.x = 3;
			int y = 2;
			int expected = 9;
			One.power(actual, y);
			// Is the 'expected' equal to the 'actual.x'?
			assert expected == actual.x : "expected = " + expected + " but actual = " + actual.x;
		}
		{
			int[] actual = { 1, 2, 3, 4, 5 };
			int y = 2;
			int[] expected = { 1, 4, 9, 16, 25 };
			One.power(actual, y);
			// Is the 'expected' equal to the 'actual'?
			assert Arrays.equals(expected, actual) : "expected = " + Arrays.toString(expected) + " but actual = "
					+ Arrays.toString(actual);
		}
		System.out.println("Done.");
	}
}
```

> **Note:** There are two kinds of types in the Java programming language: *primitive* types (`byte`, `short`, `int`, `long`, `char`, `float`, `double`, `boolean`) and *reference* types (`class`, `interface`, `array`). There are, correspondingly, two kinds of data values that can be stored in variables, passed as arguments, returned by methods, and operated on: *primitive* values and *reference* values.
>
> An object is a dynamically created instance of a class type or a dynamically created array. The values of a reference type are references to objects.
>
> Primitive values do not share state with other primitive values.

<span id="extra_04"></span>
## Extra

Create a Java program to demonstrate method overloading:
- by changing data type of arguments;
- by changing arguments number.

> **Help:** [The Java Tutorials - Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html).

<br>

[<< Previous task](task03.md) | [Practice tasks](readme.md#practice) | [Next task >>](task05.md)

