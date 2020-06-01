[<< Home](readme.md) | [Practice tasks](readme.md#practice)

<span id="task_final"></span>
## Final Task

Phonebook.

Create a Java program to store and process customer data:

- Name, surname (`String`, the first letter is uppercase and the rest are lowercase).
- Phone numbers (array or collection of `String`, e.g. "+380661234567").
- Registration date (`String`, in the format: "yyyy.mm.dd").

<span id="requirements"></span>
## Requirements

1) Create your own generic collection based on an *array* or *linked list*. Or you can use classes from the [Java Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/).

2) Demonstrate the following operations:

- Add a customer.
- Delete a customer by name and surname.
- Show all customers.
- Sort and print all customers by surname and name.
- Search customer by phone number.
- Search customer by name and surname.
- Search customer by registration date.

<span id="extra"></span>
## Extra

1) Validate input data with [regular expressions](http://www.vogella.com/tutorials/JavaRegularExpressions/article.html).

2) Save and load the customer collection to/from a file.

> **Note:** You can implement your own algorithm for writing and reading customer data to/from a file or use convenient Java SE technologies such as *Serialization of Java objects*:
>
> - [Oracle: Java Object Serialization](https://docs.oracle.com/javase/8/docs/technotes/guides/serialization/examples/index.html);
> - [Tutorials Point: Java - Serialization](https://www.tutorialspoint.com/java/java_serialization.htm);
> - [GeeksforGeeks: Serialization and Deserialization in Java](https://www.geeksforgeeks.org/serialization-in-java/);
>
> or [Long Term Persistence](https://docs.oracle.com/javase/tutorial/javabeans/advanced/longpersistence.html) for [JavaBeans](https://en.wikipedia.org/wiki/JavaBeans).

3) Create a text menu or [JavaFX](http://docs.oracle.com/javase/8/javafx/user-interface-tutorial/) GUI to implement the operations shown [above](#requirements).

<span id="examples"></span>
## Examples

```java
/**
 * Application entry point.
 */
public class Main {

	public static void main(String[] args) {

		Customer[] customers = { new Customer("John"), new Customer("Anne"), new Customer("Rick"),
				new Customer("Morty") };

		CustomerProcessor processor = new CustomerProcessor();

		// Add customers.
		for (Customer customer : customers) {
			processor.add(customer);
		}

		// Delete a customer by name.
		// TODO: Need to implement.
		processor.delete("Michael");
		processor.delete("John");

		// Show all customers.
		processor.showAll();

		// Sort all customers by name.
		CustomerProcessor.NameNaturalComparator naturalComparator = new CustomerProcessor.NameNaturalComparator();
		processor.sort(naturalComparator);
		processor.showAll();

		// Sort all customers by name in reverse order.
		CustomerProcessor.NameReverseComparator reverseComparator = new CustomerProcessor.NameReverseComparator();
		processor.sort(reverseComparator);
		processor.showAll();

		// Search customer by name.
		processor.sort(naturalComparator);
		Customer result = processor.search(new Customer("Anne"), naturalComparator);
		System.out.println(result);
		result = processor.search(new Customer("John"), naturalComparator);
		System.out.println(result);
		result = processor.search(new Customer("X"), naturalComparator);
		System.out.println(result);

		// Search customer by phone number.
		// TODO: Need to implement.

		// Search customer by registration date.
		// TODO: Need to implement.
	}
}
```

```java
/**
 * Customer data.
 */
public class Customer {
	private String name;

	// TODO: Declare other fields.

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer name is " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// TODO: Declare other methods.

}
```

```java
/**
 * Container of Customers.
 * 
 * Stores and processes {@linkplain Customer} data.
 * 
 * TODO: Try to make it generic.
 */
public class CustomerProcessor {

	/**
	 * Internal container of customers.
	 */
	private Customer[] customerArray = new Customer[0];

	/**
	 * Add a customer.
	 * 
	 * @param customer the object to add.
	 */
	public void add(Customer customer) {
		if (customer != null) {
			Customer[] newArray = new Customer[customerArray.length + 1];
			System.arraycopy(customerArray, 0, newArray, 0, customerArray.length);
			newArray[newArray.length - 1] = customer;
			customerArray = newArray;
		}
	}

	/**
	 * Show all customers.
	 */
	public void showAll() {
		for (int i = 0; i < customerArray.length; i++) {
			System.out.printf("%2d: %s%s", i + 1, customerArray[i], System.lineSeparator());
		}
		System.out.println();
	}

	/**
	 * Delete a customer by name.
	 * 
	 * @param name the customer to delete.
	 */
	public void delete(String name) {
		// TODO: Delete a customer by name and surname.
	}

	/**
	 * Sort all customers using the specified comparator.
	 * 
	 * @param comparator sets sorting order
	 */
	public void sort(Comparator<Customer> comparator) {
		Arrays.sort(customerArray, comparator);
	}

	/**
	 * Search for the first occurrence of the Customer.
	 * 
	 * The Customer array must be sorted into ascending order according to the
	 * specified comparator.
	 * 
	 * @param customer   the data to search
	 * @param comparator the comparator by which the array is ordered.
	 */
	public Customer search(Customer customer, Comparator<Customer> comparator) {
		Customer result = null;
		if (customer != null && comparator != null) {
			int index = Arrays.binarySearch(customerArray, customer, comparator);
			if (index >= 0) {
				result = customerArray[index];
			}
		}
		return result;
	}

	/**
	 * Provides sorting by customer name in natural order.
	 */
	public static class NameNaturalComparator implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			return o1.getName().compareTo(o2.getName());
		}

	}

	/**
	 * Provides sorting by customer name in reverse order.
	 */
	public static class NameReverseComparator implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			return o2.getName().compareTo(o1.getName());
		}

	}
}
```

<br>

[<< Home](readme.md) | [Practice tasks](readme.md#practice)

