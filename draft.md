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
		// ***************************************************
		Student[] old = array;
		array = new Student[old.length + 1];
		for (int i = 0; i < old.length; ++i) {
			array[i] = old[i];
		}
		// ***************************************************
		// Try using Arrays.copyOf instead of the above code.
		// ***************************************************
		array[old.length] = object;
	}

	@Override
	public String toString() {
		return "StudentContainer:\n" + Arrays.toString(array);
	}
}
```

2) Add and implement the following methods:

```java
	/**
	 * Removes the element at the specified position in this container. Shifts any
	 * subsequent elements to the left (subtracts one from their indices).
	 *
	 * @param index the index of the element to be removed
	 * @return the element that was removed from the list
	 */
	public Student remove(int index) {
		// TODO: Add your implementation here.
		return null;
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
```

<br>

[<< Practice tasks](readme.md#practice)

