[<< Previous task](task09.md) | [Practice tasks](readme.md#practice) | [Next task >>](task11.md)

<span id="task_09"></span>
## 10. Java Collections: Lists, Maps, Sets

- [BeginnersBook: Java Collections Framework Tutorials](https://beginnersbook.com/java-collections-tutorials/).
- [Jenkov Aps: Java Collections Tutorial](http://tutorials.jenkov.com/java-collections/index.html).
- [Vogella: Java Collections - Tutorial](https://www.vogella.com/tutorials/JavaCollections/article.html).
- [Oracle: The Java Tutorials - Collections](https://docs.oracle.com/javase/tutorial/collections/index.html).
- [w3schools: Java ArrayList](https://www.w3schools.com/java/java_arraylist.asp).
- [w3schools: Java HashMap](https://www.w3schools.com/java/java_hashmap.asp).

1) Make a new Eclipse project called `task10` or similar.

2) Make a **List** of 10 [Circle](shapes0/Circle.java) objects. Use a random radius. Keep adding circles to the list until `Math.random()` returns less than `0.5`. Then, iterate over the list and print each area.

3) Make a **Map** that associates the following employee **IDs** with **names**. Make test cases where you test several valid and invalid *ID’s* and print the associated *name*.

| ID    | Name          |
|------:|:--------------|
| a1234 | Steve Jobs    |
| a1235 | Scott McNealy |
| a1236 | Jeff Bezos    |
| a1237 | Larry Ellison |
| a1238 | Bill Gates    |

> **Hint:** Keys and values of *Maps* can be any `Object` type, so in real life you would probably have the key be a `String` and the associated value be a *Person* or *Employee* object.
>
> **Hint:** To make things simpler on this exercise, you can use `String` for both the *ID* and the *name*, rather than bothering to create a *Person* or *Employee* class. The point here is to associate *keys* with *values*, then retrieve *values* later based on *keys*.

4) Go back to the previous problem and make your lookup method work with keys in any case. For example, both `a1234` and `A1234` should match `Steve Jobs`.

5) Make a **Map** that associates numbers (e.g., `2`) with words (e.g, `two` or `dos`). Test the Map out by passing in a few ints and printing out the corresponding words.

<span id="extra_10"></span>
## Extra

6) Create a [comparator](https://beginnersbook.com/2017/08/comparator-interface-in-java/) to sort a **List** of *Circles* in descending order of their area. 
```java
class MyComparator implements Comparator<Circle> {
	public int compare(Circle o1, Circle o2) {
		// TODO: Implement comparison algorithm here.
		return 0;
	}
}
```

Show the sorting result.
```java
public static void main(String[] args) {
	List<Circle> arrayList = new ArrayList<Circle>();
	arrayList.add(new Circle(3));
	arrayList.add(new Circle(2));
	arrayList.add(new Circle(1));
	System.out.println(arrayList);
	MyComparator myComparator = new MyComparator();
	arrayList.sort(myComparator);
	System.out.println(arrayList);
}
```

Expected result:
```
[Circle: radius = 3.0, Circle: radius = 2.0, Circle: radius = 1.0]
[Circle: radius = 1.0, Circle: radius = 2.0, Circle: radius = 3.0]
```

7) Do some timing tests to verify the performance claims regarding the difference between `ArrayList` and `LinkedList` for accessing the middle element.

> **Hint:** Use `System.currentTimeMillis` or `System.nanoTime` to lookup the current time. Compute a delta and divide to get an elapsed time in seconds.
>
> **Hint:** To ensure meaningful results, use very long lists and access the middle element many times.
>
> **Hint:** Run several tests, each with larger and larger lists.

<br>

[<< Previous task](task09.md) | [Practice tasks](readme.md#practice) | [Next task >>](task11.md)

