[<< Previous task](task09.md) | [Practice tasks](readme.md#practice)

<span id="task_10"></span>
## 10. Generics in Java

- [Jenkov Aps: Java Generics Tutorial](http://tutorials.jenkov.com/java-generics/index.html).
- [Oracle: Generics. How They Work and Why They Are Important](https://www.oracle.com/technical-resources/articles/java/juneau-generics.html).
- [Oracle: The Java Tutorials - Generics](https://docs.oracle.com/javase/tutorial/java/generics/why.html).

1) Make a new Eclipse project called `task10` or similar and create new public class `Util`.

2) Make a static method called `getLast` to which you pass a **List** and get back the last entry of that list. If you pass it an *List* of *Strings*, you should get back a *String*. If you pass it a *List* of *Circles*, you should get back a *Circle*. E.g.:

```java
List<Circle> listOfCircles = ...;
Circle lastCircle = Util.getLast(listOfCircles);
List<String> wordList = ...;
String lastWord = Util.getLast(wordList);
```

> **Hint:** Use a [Generic Methods](https://docs.oracle.com/javase/tutorial/java/generics/methods.html).
>
> **Hint:** It is probably easiest to test this using *Lists* of *String* and *Lists* of *Integer* so that you don’t have to copy in any other classes, but be sure that your method does not do anything specific to *String* or *Integer*.

3) Make a second version of the method that support arrays ([Java Method Overloading](https://www.w3schools.com/java/java_methods_overloading.asp)). That is, you should be able to call `Util.getLast(someList)` or `Util.getLast(someArray)`.

```java
List<String> wordList = ...;
String lastWord1 = Util.getLast(wordList);
String[] wordArray = ...;
String lastWord2 = Util.getLast(wordArray);
```

4) Make a class called `Pair` that stores two entries of a given type and has getter methods to retrieve them. Give it a useful `toString` method. Here are two examples of its use:

```java
Pair<String> twoNames = new Pair<>("Juan", "Juanita");
System.out.printf("twoNames=%s.%n", twoNames);
String nameA = twoNames.getA(); // Value is "Juan"
String nameB = twoNames.getB(); // Value is "Juanita"
System.out.printf(" First item: %s.%n", nameA);
System.out.printf(" Second item: %s.%n", nameB);

Pair<Integer> twoNums = new `Pair`<>(11, 22);
System.out.printf("twoNums=%s.%n", twoNums);
Integer numA = twoNums.getA(); // Value is 11
Integer numB = twoNums.getB(); // Value is 22
System.out.printf(" First item: %s.%n", numA);
System.out.printf(" Second item: %s.%n", numB);
```

> **Hint:** Use a [Generic Types](https://docs.oracle.com/javase/tutorial/java/generics/types.html).
>
> **Hint:** Remember that *Eclipse* will help you write the *constructor*, the *getter* methods, and the `toString` method.

## Extra

Assume that you have four variables: `name1`, `balance1`, `name2`, and `balance2`. Produce output that shows the values, but line up the balances on the decimal point. Assume that the names are 7 characters or fewer and the balances are less than $10M. For example:

```
Juanita's bank account balance is $2,345,678.99.
   Juan's bank account balance is $   15,455.26.
```

> **Hint:** [Formatting Numeric Print Output](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html).

<br>

[<< Previous task](task09.md) | [Practice tasks](readme.md#practice)

