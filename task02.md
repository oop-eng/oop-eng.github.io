[<< Previous task](task01.md) | [Practice tasks](readme.md#practice) | [Next task >>](task03.md)

<span id="task_02"></span>
## 2. Loops and Conditionals in Java

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

> **Hint:** Have your new method make use of the existing `calcSum1` method, and then use the length property of arrays.
>
> For example, given the array already made inside `main` (containing `1.1`, `2.2`, and `3.3`), calling `calcAverage(numbers)` will output `2.1999...` (almost `2.2`, but not exactly, due to roundoff error).

5) Add a method named `numPositive` that, given an array of doubles, will return the count (int) of how many of them are
greater than or equal to zero.

> For example, given the array already made inside main, calling `numPositive(numbers)` will output `3`. Add a few negative numbers to the array and verify that you still get `3`. Add a new positive number and verify that you now get `4`.

6) Add a method named `numInRange` that, given an array of numbers, a lower bound, and an upper bound, will return the count of how many of the array entries are between the two bounds, inclusive.

> For example, given the array already made inside main (containing `1.1`, `2.2`, and `3.3`), calling `numInRange(numbers, 1.1, 3.2)` should return `2`.

<br>

[<< Previous task](task01.md) | [Practice tasks](readme.md#practice) | [Next task >>](task03.md)

