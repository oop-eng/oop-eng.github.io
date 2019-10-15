[<< Practice tasks](readme.md#practice) | [Next task >>](task02.md)

---

<span id="task_01"></span>
### 1. Using the [Eclipse IDE](https://www.eclipse.org/ide/) for Java programming

- [Eclipse Documentation](http://help.eclipse.org/).
- [Tutorial](https://www.tutorialspoint.com/eclipse).
- [Tutorial](https://www.vogella.com/tutorials/Eclipse/article.html).

1) Install the [Java Development Kit (JDK)](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot) and check its version.

> **Help:** [Installation of Java](https://www.vogella.com/tutorials/JavaIntroduction/article.html#installation-of-java).
	
2) Download and install the [Eclipse IDE for Java Developers](https://eclipse.org/downloads/eclipse-packages/).

> HELP: [Download and installation of the Eclipse IDE for Java Developers](https://www.vogella.com/tutorials/Eclipse/article.html#download-and-installation-of-the-eclipse-ide-for-java-developers).

3) Start the Eclipse IDE and verify JDK installation.

> **Help:** [Starting the Eclipse IDE](https://www.vogella.com/tutorials/Eclipse/article.html#starting-the-eclipse-ide).
>
> **Help:** [Preparing the workbench](https://help.eclipse.org/2019-09/topic/org.eclipse.jdt.doc.user/gettingStarted/qs-2.htm).
	
4) Create a new Java project named `task01`.

> **Help:** [Create your first Java program](https://www.vogella.com/tutorials/Eclipse/article.html#create-your-first-java-program).

5) Create a package and Java class.
	
> **Help:** [Create package](https://www.vogella.com/tutorials/Eclipse/article.html#create-package).
>
> **Hint:** Use the following package name: `ua.khpi.oop.your_first_name.task01`.
>
> **Hint:** Use the following class name: `Main`.
	
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

> **Help:** [Run your project in Eclipse](https://www.vogella.com/tutorials/Eclipse/article.html#run-your-project-in-eclipse).

8) Create JAR file and launch your application outside Eclipse.

> **Help:** [Run Java program outside Eclipse](https://www.vogella.com/tutorials/Eclipse/article.html#run-java-program-outside-eclipse).

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

<span id="task_01_homework"></span>
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

[<< Practice tasks](readme.md#practice) | [Next task >>](task02.md)

