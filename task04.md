[<< Previous task](task03.md) | [Practice tasks](readme.md#practice) | [Next task >>](task05.md)

<span id="task_04"></span>
## 4. Constructors in Java

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

You should obtain the following result:

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

<span id="task_04_homework"></span>
## Homework

- [The Java Tutorials - Providing Constructors for Your Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html).
- [The Java Tutorials - Using the this Keyword](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html).
- [The Java Tutorials - Controlling Access to Members of a Class](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html).


1) Fix the compilation errors of the following program.

```java
class One {
	private int x;

	void One() {
		System.out.println("One::One()");
		this(999);
	}

	One(int x) {
		System.out.println("One::One(int)");
		x = this.x;
	}

	private One getInstance() {
		return null;
	}
}
```

2) Use the following `Main` class to test the implementation of the `One` class.

```java
public class Main {

	public static void main(String[] args) {
		One a = new One();
		System.out.println(a.x);
		One b = a.getInstance();
		System.out.println(a == b);
	}

}
```

3) If necessary, сhange the implementation of the `One` class to obtain the following results.

```
One::One(int)
One::One()
999
true
```

> **Hint:** Do not specify return type in constructor declaration.
>
> **Hint:** If present, the invocation of another constructor must be the first line in the constructor.
>
> **Hint:** Do not use private members to access them outside their class.

<br>

[<< Previous task](task03.md) | [Practice tasks](readme.md#practice) | [Next task >>](task05.md)

