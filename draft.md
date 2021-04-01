[<< Practice tasks](readme.md#practice)

<span id="draft"></span>
## Draft

### 1.  Java Collections: ArrayList, LinkedList, HashSet

1) Create a class named `Student` that represents the student (first name, last name, gradebook number).

2) Create a collection using `ArrayList` and add 3 students to it.

3) Create a new collection using `LinkedList` and add 5 new students to it.

4) Create a third collection using `HashSet` and combine the two previously created collections in it.

5) Display the collection on the screen.

> **Hint:** Override the `toString()` method of the `Student` object for more convenient presentation of student data.

6) Check if you can add two identical students to this collection. What should be done to eliminate this possibility?

> **Hint:** The `HashSet` must ensure that only unique items have been added.
>
> **Hint:** Try to override `equals()` and `hashCode()` methods of the `Student`.

7) Convert `HashSet` collection to an array.

8) Sort the array alphabetically by student last name and print the result.

9) Sort the array by grade book number in descending order and print the result.

### 2. Java Collections: Converting to an array, removing elements

1) Create new collection using all elements of the array.

2) Remove from the collection all students whose gradebook number begins and ends with one.

### 3. Java Collections: HashMap, TreeMap

1) Add a new field called "Group Name" to the `Student` class.

2) Create a new collection of student groups. You must group students by "Group Name".

> **Hint:** It is best to use a `HashMap` for this.
>
> **Hint:** Just use the previously created array to fill the new collection.

3) Modify your program to store student groups in a collection sorted in reverse order by group name. This means that the collection of student groups should be sorted by group name initially.

> **Hint:** It is convenient to use `TreeMap` collection for this. It provides an efficient way of storing key-value pairs in sorted order.

### 4. Java Collections: Creating custom collection class

We made sure that the container class (called Collection) in java can be referred to an object that collects multiple elements into a single unit. It is used to store, fetch and manipulate data.

So far, we've worked with library classes from the Java Collection Framework. These are ready-to-use container classes.

Now try to create your own collection class. At first, you have to create a simple container based on array. Then you must add the necessary functionality so that the created class can become a "real" container or collection.

1) Create the `StudentContainer` class:

```java
class StudentContainer {
	private Student[] array = new Student[0];

	void add(Student object) {
		Student[] old = array;
		array = new Student[old.length + 1];
		for (int i = 0; i < old.length; ++i) {
			array[i] = old[i];
		}
		array[old.length] = object;
		// Try using Arrays.copyOf() instead of the above code.
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
```

2) Create and test `StudentContainer` object then add and implement the following methods:

```java
class StudentContainer {
	...

	/**
	 * Returns the number of elements in this list.
	 *
	 * @return the number of elements in this list
	 */
	public int size() {
		// TODO: Add your implementation here.
		return -1;
	}

	/**
	 * Removes all of the elements from this container. The container will be empty
	 * after this call returns.
	 */
	public void clear() {
		// TODO: Add your implementation here.
	}

	/**
	 * Returns the element at the specified position in this container.
	 *
	 * @param index index of the element to return
	 * @return the element at the specified position in this container
	 */
	public Student get(int index) {
		// TODO: Add your implementation here.
		return null;
	}

	/**
	 * Replaces the element at the specified position in this container with the
	 * specified element.
	 *
	 * @param index   index of the element to replace
	 * @param element element to be stored at the specified position
	 * @return the element previously at the specified position
	 */
	public Student set(int index, Student element) {
		// TODO: Add your implementation here.
		return null;
	}

	/**
	 * Removes the element at the specified position in this container. Shifts any
	 * subsequent elements to the left (subtracts one from their indices).
	 *
	 * @param index the index of the element to be removed
	 * @return the element that was removed from the list
	 */
	public Student remove(int index) {
		if (index < 0 || index >= array.length) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		// TODO: Add your implementation here.
		// Try to use System.arraycopy() whenever possible.
		return null;
	}
	
	/**
	 * Returns an array containing all of the elements in this container in proper
	 * sequence (from first to last element).
	 * <p>
	 * The returned array must be "safe", that is, this container cannot maintain
	 * any references to it. In other words, this method must allocate a new array.
	 * The caller is thus free to modify the returned array.
	 *
	 * @return an array containing all of the elements in this container in proper
	 *         sequence
	 */
	public Student[] toArray() {
		// TODO: Add your implementation here.
		return null;
	}
}
```

### 5. Java Collections: Making custom collection class iterable

To access the elements of a collection, we can either use an index if the collection is based on an array, or we need to traverse the collection from its beginning, element by element.

`Iterator` is an interface and it is part of java collection framework. It is used to traverse a collection in forward direction, enabling you to remove or modify the elements of the collection.

Each collection classes provide `iterator()` method to return an **iterator**.

So let's make your collection class **iterable**.

1) Implement the `Iterable` interface:

```java
class StudentContainer implements Iterable<Student> {
	...
	@Override
	public Iterator<Student> iterator() {
		return new StudentIterator();
	}
}
```

2) Create private inner class `StudentIterator` inside `StudentContainer`:

```java
class StudentContainer implements Iterable<Student> {
	...
	private class StudentIterator implements Iterator<Student> {

		// Add some fields here if needed.
		// ...
		
		/**
		 * Returns "true" if the iteration has more elements.
		 *
		 * @return "true" if the iteration has more elements
		 */
		public boolean hasNext() {
			// Add your implementation here.
			return false;
		}

		/**
		 * Returns the next element in the iteration.
		 *
		 * @return the next element in the iteration
		 */
		public Student next() {
			// Add your implementation here.
			return null;
		}
	};
}
```

Test it:

```java
Iterator<Student> iterator = container.iterator();
while (iterator.hasNext()) {
	Student student = iterator.next();
	System.out.println(student);
}
```

Try to use a `foreach` loop:

```java
for (Student student : container) {
	System.out.println(student);
}
```

3) Add the `remove()` method to your `StudentIterator`:

```java
class StudentContainer implements Iterable<Student> {
	...
	private class StudentIterator implements Iterator<Student> {
		...

		/**
		 * Removes the last element returned by this iterator. This method can be called
		 * only once per call to next().
		 */
		public void remove() {
			// Add your implementation here.
		}
	}
}
```

Test it:

```java
Iterator<Student> iterator = container.iterator();
while (iterator.hasNext()) {
	iterator.next();
	iterator.remove();
}
System.out.println(container.size()); 
System.out.println(container);
```

Add **ten** students to your container.

Then remove students with an **odd sum of digits** in the gradebook number using `iterator()`. To do this, use something like the following code:

```java
iterator = container.iterator();
while (iterator.hasNext()) {
	Student student = iterator.next();
	if (...) {
		iterator.remove();
	}
}
System.out.println(container);
```

### 6. Java Collections: Make custom collection class generic

We now have a simple and very useful :) custom container.
But it can be used to manage objects of the `Student` class only.

Let's improve it so that it can be used to store any type of user data. 
I mean, let's make our container work not only with students, but with any other custom classes as well.

For this we will use **Generics**.
Using Generics, we can create a single class or method that automatically works with any types of data (not only Student).

1) Create a **new java project** and copy the previously created `Student` and `StudentContainer` into it.

2) Rename the `StudentContainer` to `Container` and make it **generic**. Modify its code to work with any type of objects used as elements. Сhange the implementation of some methods, if necessary:

```java
class Container<E> {
	private Object[] array = new Object[0];
	...
	void add(E element) {
		...
	}

	public E get(int index) {
		...
	}
	
	public E set(int index, E element) {
		...
	}
	
	public E remove(int index) {
		...
	}
}	
```

3) Test your generic container with the previously created `Student` class using something like the following code:

```java
Container<Student> container = new Container<>();
container.add(new Student(...));
container.add(new Student(...));
container.add(new Student(...));
System.out.println(container);
System.out.println(container.set(1, new Student(...)));
System.out.println(container);
System.out.println(container.remove(2));
System.out.println(container);
container.remove(0);
System.out.println(container);
System.out.println(Arrays.toString(container.toArray()));
```

4) Test the container with the `String` objects.

```java
Container<String> str = new Container<>();
str.add("ccc");
str.add("bbb");
str.add("aaa");
System.out.println(str);
System.out.println(str.set(0, "zzz"));
System.out.println(str);
System.out.println(str.remove(2));
System.out.println(str);
```

5) Create a new simple data class like the following:

```java
class One {
	public final int i;

	public One(int i) {
		this.i = i;
	}

	public String toString() {
		return Integer.toString(i);
	}
}
```

and test the container with its objects.

```java
Container<One> one = new Container<>();
one.add(new One(1));
one.add(new One(2));
one.add(new One(3));
System.out.println(one);
System.out.println(one.set(1, new One(999)));
System.out.println(one);
System.out.println(one.remove(2));
System.out.println(one);
```

6) Implement the `addAll()` method:

```java
class Container<E> {
	...

	/**
	 * Appends all of the elements in the specified collection to the end of this
	 * container.
	 *
	 * @param c collection containing elements to be added to this container
	 * @return "true" if this container changed as a result of the call
	 */
	public boolean addAll(Collection<? extends E> c) {
		Object[] a = c.toArray();
		if (a.length == 0) {
			return false;
		}
		// Add your implementation here.
		// Hint: It is convenient to use System.arraycopy()
		// ...
		return true;
	}
}
```

and test it:

```
Container<String> str = new Container<>();
...
str.addAll(Arrays.asList("ddd", "fff", "eee"));
System.out.println(str);
...
Container<One> one = new Container<>();
...
one.addAll(Arrays.asList(new One(222), new One(777), new One(555)));
System.out.println(one);
```

7) Implement the `sort()` method:

```java
class Container<E> {
	...

	/**
	 * Sorts this list according to the order induced by the specified
	 * {@link Comparator}.
	 * 
	 * @param c the Comparator used to compare list elements. A null value indicates
	 *          that the Comparable elements should be used.
	 */
	@SuppressWarnings("unchecked")
	void sort(Comparator<E> c) {
		// Here you can use the sorting method from the Java library.
	}
}
```

and test sorting with all the object types you have used before (`Student`, `String`, `One`).

<br>

[<< Practice tasks](readme.md#practice)

