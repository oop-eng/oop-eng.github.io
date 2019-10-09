# Object-Oriented Programming

## Overview
Java is an excellent language to introduce object-oriented programming. After commencing with the traditional procedural programming constructs the course moves swiftly onto the object-oriented paradigm. During the course we will cover: the creation of classes, overloading constructors and methods, arrays, polymorphism, encapsulation, the public, protected and private interfaces, inheritance, abstract classes and graphics programming.

The course will also introduce elements of software engineering including the waterfall method. The course will also include a lecture on the use of data structures including, stacks, queues, hash tables and lists.

## Course aims
Java will be used to introduce Object Oriented Programming, commencing at an introductory level. The course will cover encapsulation, inheritance, polymorphism, software engineering, graphics programming and exception handling.

## Course Objectives

- To introduce [Java](https://en.wikipedia.org/wiki/Java_(programming_language)) syntax.

- To introduce the [OO paradigm](https://en.wikipedia.org/wiki/Object-oriented_programming).

- To introduce graphics programming.

## Programme details

1. Java Syntax and Semantics, variables, the program development process
2. Programming constructs, loops and conditionals
3. Classes and objects in Java
4. Extending classes with inheritance
5. Abstract classes, more inheritance  and interfaces
6. Exceptions
7. Arrays including multi-dimensional arrays
8. Object Oriented Software Development and file handling.
9. Graphics programming
10. Advanced graphics programming

## Learning outcomes

By the end of the course students will be expected to:

- Understand Java syntax and program design.

- Understand the OO paradigm.

- Understand graphical objects used in Java.

---

<span id="soft"></span>
## Development tools

- [Oracle JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or [OpenJDK 11](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot).
- [Eclipse IDE for Java Developers](http://www.eclipse.org/downloads/eclipse-packages/):
	- add-on: [ObjectAid Class Diagram](http://www.objectaid.com/class-diagram) ([update site URL](http://www.objectaid.com/update/current/));
	- add-on: [Checkstyle](https://checkstyle.org/eclipse-cs/#!/) ([update site URL](http://eclipse-cs.sourceforge.net/update));
	- add-on: [Regex Util](http://myregexp.com/eclipsePlugin.html) ([update site URL](http://regex-util.sourceforge.net/update/)). Open it in the Eclipse menu `Window / Show View / Other / Regex Util`.

---

<span id="references"></span>
## References

- [Java Code Conventions](http://www.oracle.com/technetwork/java/codeconventions-150003.pdf), ~128 KB;
- [Java Language Specification](http://docs.oracle.com/javase/specs/jls/se8/jls8.pdf), ~3.75 MB;
- [Java SE Development Kit 8 Documentation](http://www.oracle.com/technetwork/java/javase/documentation/jdk8-doc-downloads-2133158.html), ~86 MB;
- [Java SE Tutorial](http://www.oracle.com/technetwork/java/javase/java-tutorial-downloads-2005894.html), ~133 MB.
- [Java SE Client Technologies: JavaFX](http://docs.oracle.com/javase/8/javase-clienttechnologies.htm), online + PDFs.
- [Tutorial - Introduction to Java programming](http://www.vogella.com/tutorials/JavaIntroduction/article.html);
- [Tutorial - Eclipse IDE](http://www.vogella.com/tutorials/Eclipse/article.html);
- [Tutorial - Eclipse Shortcuts](http://www.vogella.com/tutorials/EclipseShortcuts/article.html);
- [Tutorial - Java Debugging with Eclipse](http://www.vogella.com/tutorials/EclipseDebugging/article.html)
- [Tutorial - Using the Checkstyle Eclipse plug-in](http://www.vogella.com/tutorials/Checkstyle/article.html);
- [Java Platform Standard Edition 8 Documentation](http://docs.oracle.com/javase/8/docs/);
- [Java Tutorials](http://docs.oracle.com/javase/tutorial/index.html);
- [How to Write Doc Comments](http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html);
- [Google Java Style](http://google-styleguide.googlecode.com/svn/trunk/javaguide.html).

---

## Practice tasks

### 1. Using the [Eclipse IDE](https://www.eclipse.org/ide/) for Java programming

- [Eclipse Documentation](http://help.eclipse.org/).
- [Tutorial](https://www.tutorialspoint.com/eclipse).
- [Tutorial](https://www.vogella.com/tutorials/Eclipse/article.html).

1) Install the [Java Development Kit (JDK)](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot) and check its version.

> **HELP:** [Installation of Java](https://www.vogella.com/tutorials/JavaIntroduction/article.html#installation-of-java).
	
2) Download and install the [Eclipse IDE for Java Developers](https://eclipse.org/downloads/eclipse-packages/).

> HELP: [Download and installation of the Eclipse IDE for Java Developers](https://www.vogella.com/tutorials/Eclipse/article.html#download-and-installation-of-the-eclipse-ide-for-java-developers).

3) Start the Eclipse IDE and verify JDK installation.

> **HELP:** [Starting the Eclipse IDE](https://www.vogella.com/tutorials/Eclipse/article.html#starting-the-eclipse-ide).
>
> **HELP:** [Preparing the workbench](https://help.eclipse.org/2019-09/topic/org.eclipse.jdt.doc.user/gettingStarted/qs-2.htm).
	
4) Create a new Java project named `task01`.

> **HELP:** [Create your first Java program](https://www.vogella.com/tutorials/Eclipse/article.html#create-your-first-java-program).

5) Create a package and Java class.
	
> **HELP:** [Create package](https://www.vogella.com/tutorials/Eclipse/article.html#create-package).
>
> **HINT:** Use the following package name: `ua.khpi.oop.your_first_name.task01`.
>
> **HINT:** Use the following class name: `Main`.
	
6) Change the class based on the following listing.

```java
package your_package_name;

public class your_class_name {

	public static void main(String[] args) {
		System.out.println("Hi your_first_name!");
	}

}
```

7) Launch your application in Eclipse.

> **HELP:** [Run your project in Eclipse](https://www.vogella.com/tutorials/Eclipse/article.html#run-your-project-in-eclipse).

8) Create JAR file and launch your application outside Eclipse.

> **HELP:** [Run Java program outside Eclipse](https://www.vogella.com/tutorials/Eclipse/article.html#run-java-program-outside-eclipse).

9) Create new class named `Calculator` based on the following listing and solve all TODOs.

```java
package your_package_name;

public class Calculator {

	public int inc(int a) {
		// TODO Add one to 'a'

		// TODO return your calculated value
		// instead of 0
		return 0;
	}

	public int dec(int a) {
		// TODO Subtract one from 'a'

		// TODO return your calculated value
		// instead of 0
		return 0;
	}

	public int sum(int a, int b) {
		// TODO Calculate the sum of 'a' and 'b'

		// TODO return your calculated value
		// instead of 0
		return 0;
	}

	public String check(int a) {
		// TODO Check that 'a' is positive or negative.
		// If 'a' is positive return "positive".
		// If 'a' is negative return "negative".
		// If a is zero return "zero".
		return "";
	}

}
```

10) Change your Main class based on the following listing, launch it and check output results.

```java
package your_package_name;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();

		int intResult;
		intResult = calculator.inc(1);
		System.out.println(intResult);

		intResult = calculator.dec(1);
		System.out.println(intResult);

		intResult = calculator.sum(2, 3);
		System.out.println(intResult);

		String strResult;
		strResult = calculator.check(1);
		System.out.println(strResult);

		strResult = calculator.check(-1);
		System.out.println(strResult);

		strResult = calculator.check(0);
		System.out.println(strResult);

	}

}

```

### Homework

Explain the result of the following program fragment:

```java
int a = 5;
int b = 10;

System.out.println((a > 5) && ((b = 99) == 10));
System.out.println(b);
		
System.out.println(((b = 99) == 10) && (a > 5));
System.out.println(b);
```

---

### 2. Loops and Conditionals in Java

- [Loop Control](https://www.tutorialspoint.com/java/java_loop_control.htm).
- [Decision Making](https://www.tutorialspoint.com/java/java_decision_making.htm).

Start by making a new Eclipse project named `task02`. Give it a package named `ua.khpi.oop.your_first_name.task02`.

1) Add a class called `LoopEx` to your package. Give it a method named `printNums1` that will take a number and print out the numbers from `0` up to and including that number. For example, if you pass in `3`, it should print `0`, `1`, `2`, and `3`. Your overall code will look roughly like this:

```java
package your_package_name;

public class LoopEx {
	public static void main(String[] args) {
		printNums1(3);
	}
	public static void printNums1(int upperLimit) {
		// TODO: Print out the numbers from 0 up to and including upperLimit.
	}
}
```

2) Add a second method named `printNums2` to your class. This one should print every other number: i.e., `0`, `2`, `4`, etc., up to the last value that is less than or equal to the argument to the method. For example, if your main method calls `printNums2(7)`, it should print `0`, `2`, `4`, and `6`. Remember that `i++` in a loop is the same as if you had written `i = i + 1`.

3) Add a third method named `printNums3` to your class. This one should be similar to your first method, but should print in reverse order. For example, if your main method calls `printNums3(5)`, it should print `5`, `4`, `3`, `2`, and `1`.

4) Copy the `ArrayEx` class into your project.

```java
public class ArrayEx {
	public static void main(String[] args) {
		double[] numbers = { 1.1, 2.2, 3.3 };
		System.out.println("Sum of {1.1,2.2,3.3} = " + calcSum1(numbers));
		System.out.println("Average of {1.1,2.2,3.3} = " + calcAverage(numbers));
		double[] moreNumbers = { 1.1, 2.2, 3.3, -1, -2, 4 };
		System.out.println("Number positive = " + numPositive(moreNumbers));
		System.out.println("Number from 1.1 to 3.2 = " + numInRange(moreNumbers, 1.0, 3.2));
	}

	public static double calcSum1(double[] numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum = sum + num; // Or sum += num
		}
		return sum;
	}

	public static double calcSum2(double[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}

	public static double calcSum3(double[] numbers) {
		double sum = 0;
		int i = 0;
		while (i < numbers.length) {
			sum = sum + numbers[i];
			i++; // Or i = i + 1, or i += 1
		}
		return sum;
	}

	// Unlike the other three versions, this one fails for a 0-length array.
	public static double calcSum4(double[] numbers) {
		double sum = 0;
		int i = 0;
		do {
			sum = sum + numbers[i];
			i++;
		} while (i < numbers.length);
		return sum;
	}

	public static double calcAverage(double[] numbers) {
		// TODO: Return the average value of 'numbers'.
		return 0.0;
	}

	public static int numPositive(double[] numbers) {
		// TODO: Return the count of how many of the array entries are greater than or
		// equal to zero.
		return 0;
	}

	public static int numInRange(double[] nums, double lowerBound, double upperBound) {
		// TODO: Return the count of how many of the array entries are between the two
		// bounds, inclusive.
		return 0;
	}

}

```

Add a method named `calcAverage` that, given an array of doubles, will return the average value.

> **HINT:** have your new method make use of the existing `calcSum1` method, and then use the length property of arrays.
>
> For example, given the array already made inside `main` (containing `1.1`, `2.2`, and `3.3`), calling `calcAverage(numbers)` will output `2.1999...` (almost `2.2`, but not exactly, due to roundoff error).

5) Add a method named `numPositive` that, given an array of doubles, will return the count (int) of how many of them are
greater than or equal to zero.

> For example, given the array already made inside main, calling `numPositive(numbers)` will output `3`. Add a few negative numbers to the array and verify that you still get `3`. Add a new positive number and verify that you now get `4`.

6) Add a method named `numInRange` that, given an array of numbers, a lower bound, and an upper bound, will return the count of how many of the array entries are between the two bounds, inclusive.

> For example, given the array already made inside main (containing `1.1`, `2.2`, and `3.3`), calling `numInRange(numbers, 1.1, 3.2)` should return `2`.

---

### 3. Methods and Method Overloading in Java

- [Java Methods](https://www.tutorialspoint.com/java/java_methods.htm).
- [Java Methods](https://www.w3schools.com/java/java_methods.asp).

Create a new Eclipse project named `task03`. Use a package named `ua.khpi.oop.your_first_name.task03` for all created classes.

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
			assert Arrays.compare(expected, actual) == 0 : "expected = " + Arrays.toString(expected) + " but actual = "
					+ Arrays.toString(actual);
		}
		System.out.println("Done.");
	}
}
```

> **NOTE:** There are two kinds of types in the Java programming language: *primitive* types (`byte`, `short`, `int`, `long`, `char`, `float`, `double`, `boolean`) and *reference* types (`class`, `interface`, `array`). There are, correspondingly, two kinds of data values that can be stored in variables, passed as arguments, returned by methods, and operated on: *primitive* values and *reference* values.
>
> An object is a dynamically created instance of a class type or a dynamically created array. The values of a reference type are references to objects.
>
> Primitive values do not share state with other primitive values.

### Homework

Create a Java program to demonstrate method overloading:
- by changing data type of arguments;
- by changing arguments number.

> **HELP:** [The Java Tutorials - Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html).

---

### 4. Constructors in Java

- [The Java Tutorials - Providing Constructors for Your Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html).
- [Java Constructors](https://www.tutorialspoint.com/java/java_constructors.htm).
- [Constructors in Java](https://www.javatpoint.com/java-constructor).

Create a new Eclipse project named `task04`. Use a package named `ua.khpi.oop.your_first_name.task04` for all created classes.

1) Add a class called `ConstructorEx` to your package. Give it a field named `array`:

```java
class ConstructorEx {
	int[] array;
}
```
2) Add three constructors to your class:

```java
ConstructorEx(int length) {
	// TODO: Initialize the field "array" by creating a new array using the
	//       specified "length".
}

ConstructorEx(int[] srcArray) {
	// TODO: Initialize the "array" field with the reference
	//       to the specified "srcArray".
}

ConstructorEx(int[] srcArray, boolean copyArray) {
	// TODO: Initialize the "array" field by reference to the specified "srcArray"
	//       or by copying the contents of the "srcArray" depending on the "copyArray" flag.
}
```

3) Use the following class `Main` to test the implemented constructors of class `ConstructorEx`.

```java
public class Main {

	public static void main(String[] args) {
		System.out.println("Begin...");

		ConstructorEx a = new ConstructorEx(3);
		System.out.println(Arrays.toString(a.array));
		System.out.println("---");

		int[] array = new int[5];

		ConstructorEx b = new ConstructorEx(array);
		Arrays.fill(array, 1);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(b.array));
		System.out.println("---");

		Arrays.fill(array, 2);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(b.array));
		System.out.println("---");

		ConstructorEx c = new ConstructorEx(array, true);
		Arrays.fill(array, 3);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(c.array));
		System.out.println("---");

		ConstructorEx d = new ConstructorEx(array, false);
		Arrays.fill(array, 4);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(d.array));

		System.out.println("Done.");
	}

}
```

YYou should obtain the following result:

```
Begin...
[0, 0, 0]
---
[1, 1, 1, 1, 1]
[1, 1, 1, 1, 1]
---
[2, 2, 2, 2, 2]
[2, 2, 2, 2, 2]
---
[3, 3, 3, 3, 3]
[2, 2, 2, 2, 2]
---
[4, 4, 4, 4, 4]
[4, 4, 4, 4, 4]
Done.
```

