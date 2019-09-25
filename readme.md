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

> Help: [Installation of Java](https://www.vogella.com/tutorials/JavaIntroduction/article.html#installation-of-java).
	
2) Download and install the [Eclipse IDE for Java Developers](https://eclipse.org/downloads/eclipse-packages/).

> Help: [Download and installation of the Eclipse IDE for Java Developers](https://www.vogella.com/tutorials/Eclipse/article.html#download-and-installation-of-the-eclipse-ide-for-java-developers).

3) Start the Eclipse IDE and verify JDK installation.

> Help: [Starting the Eclipse IDE](https://www.vogella.com/tutorials/Eclipse/article.html#starting-the-eclipse-ide).
>
> Help: [Preparing the workbench](https://help.eclipse.org/2019-09/topic/org.eclipse.jdt.doc.user/gettingStarted/qs-2.htm).
	
4) Create a new Java project named `task01`.

> Help: [Create your first Java program](https://www.vogella.com/tutorials/Eclipse/article.html#create-your-first-java-program).

5) Create a package and Java class.
	
> Help: [Create package](https://www.vogella.com/tutorials/Eclipse/article.html#create-package).
>
> Hint: Use the following package name: `ua.khpi.oop.your_first_name.task01`.
>
> Hint: Use the following class name: `Main`.
	
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

> Help: [Run your project in Eclipse](https://www.vogella.com/tutorials/Eclipse/article.html#run-your-project-in-eclipse).

8) Create JAR file and launch your application outside Eclipse.

> Help: [Run Java program outside Eclipse](https://www.vogella.com/tutorials/Eclipse/article.html#run-java-program-outside-eclipse).

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

Explain the result of the following expressions:

```java
int a = 5;
int b = 10;

System.out.println((a > 5) && ((b = 99) == 10));
System.out.println(b);
		
System.out.println(((b = 99) == 10) && (a > 5));
System.out.println(b);
```

