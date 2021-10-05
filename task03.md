[<< Previous task](task02.md) | [Practice tasks](readme.md#practice) | [Next task >>](task04.md)

<span id="task_03"></span>
## 3. Basic Java Syntax. Strings, Arrays, java.lang.Math

- [The Java Tutorials: Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html).
- [The Java Tutorials: Strings](https://docs.oracle.com/javase/tutorial/java/data/strings.html).
- [The Java Tutorials: Beyond Basic Arithmetic](https://docs.oracle.com/javase/tutorial/java/data/beyondmath.html).
- [Guide to the java.util.Arrays Class](https://www.baeldung.com/java-util-arrays).

Create a new Eclipse project named `task03`. Use a package named `ua.khpi.oop.your_first_name.task03` for all created classes.

1) Make a new class whose main method flips a coin **K** times, printing “heads” or “tails” each time.

> **Hint:** `java.lang.Math.random()` returns a double between **0** and **1**.

2) Make a new class whose main method creates an array of **M** random doubles (each between **LOW** and **HIGH**). Use one-step array allocation. Loop down the array and print out the values.

> **Hint:** Declare and allocate array in one fell swoop:
> ```java
> int[] values = { 10, 100, 1_000 };
> String[] names = { "Joe", "Jane", "Juan" };
> ```

3) Make a new class whose main method creates an array of **N** random numbers. Use two-step array allocation. After the array has been created, loop down the array, calculate and print out the following:

- the sum of all elements,
- the sum of the negative values,
- the sum of the positive values,
- the sum of the square roots of the values.

> **Hint:** Building arrays in two steps:
>
> - Step 1: allocate an empty array
> ```java
> int[] primes = new int[3]; // Default value is 0 for numeric arrays
> String[] names = new String[5]; // Default value is null for Object arrays
> ```
>
> - Step 2: populate the array
> ```java
> primes[0] = 2; names[0] = "Joe";
> primes[1] = 3; names[1] = "Jane";
> primes[2] = 5; names[2] = "Juan";
> ```

4) Make a new class whose main method prints out the number of command line arguments: "You supplied x arguments.".

> **Hint:** How to specify command line parameters in Eclipse
>
> `Menu: Run / Run Configurations / Arguments -> Program arguments`

5) Print the command line arguments in reverse order, converted to uppercase.

6) Modify the coin-flipping program of subtask #1 to flip a coin the number of times the user specifies as command line arguments.

7) Make a new class.

- Make a static method that, given an **array of Strings** and a potential match, will return **true** if the array contains an entry matching the potential match, **false** otherwise.
- Test with at least one positive match and at least one negative match, and for each, print out whether or not there is a match. 

Your overall code will look roughly like this:

```java
public static void main(String[] args) {
	String[] testStrings = { "Hello", "Hi", "Hola", "Howdy" };
	if (isStringInArray(testStrings, "Hola")) {
		// TODO
	}
	if (isStringInArray(testStrings, "Hey")) {
		// TODO
	}
}
public static boolean isStringInArray(String[] strings, String potentialMatch) {
	// TODO
}
```

<br>

[<< Previous task](task02.md) | [Practice tasks](readme.md#practice) | [Next task >>](task04.md)

