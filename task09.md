[<< Previous task](task08.md) | [Practice tasks](readme.md#practice) | [Next task >>](task10.md)

<span id="task_09"></span>
## 9. Object-Oriented Programming: Advanced Capabilities

1) Make a new Eclipse project called `task09` or similar.

2) Make a `CarSale` class to represent the sale of a car. The class should represent the *car name* (model), the *list price*, the *discount* in percent, and the *final cost* (calculated from the *list price* after the *discount* is applied) as shown below. Make a few instances and print them out.

```java
public class CarSale {
	private final String carName;
	private final double listPrice;
 	private final double discount;
 	...
 	public double getCost() {
		return listPrice * (1.0 - discount / 100);
	}
	...
}
```

> **Hint:** To keep your code shorter, you can have *getter* but not *setter* methods for each of those properties. Also put in a useful `toString` method.
>
> **Note:** If you don’t understand `@Override`, just skip it for now. Also, remember that once you have instance variables, Eclipse can create the *getters*, *setters* (not needed here), and *constructor* for you. Use the *Source* menu to tell Eclipse to insert this code.

3) Make a `PaperclipSale` class to represent the sale of a set of boxes of certain types of paper clips. The class should represent the *color* of the clips, the *per-box price*, the *number* of those boxes being sold, and the *final cost*. Also put in a useful `toString` method. Make a few instances and print them out.

4) Make a static method called `cheapest` that, given an array of mixed `CarSale` and `PaperclipSale` objects, will return the item with the lowest cost. Test the method.

> **Hint:** Return `null` if given an empty array. Don’t worry about the possibility that the array might have two entries with the same cost.
>
> **Question:** Where is the best place to put this method?
>
> **Question:** Why was it important that your classes had meaningful `toString` methods?

5) Make a static method called `totalCost` that, given an array of mixed `CarSale` and `PaperclipSale` objects, will return the *total cost* of all elements in the array. Return 0 if given an empty array. Test the method.

<span id="extra_09"></span>
## Extra

6) Implement the `SortAndPrint` method to arrange your sellable objects array by the price in descending order. Select the best place to put this method. Add the necessary code to demonstrate the created method.

7) Make a `Coin` enum with instances named `HEADS` and `TAILS`.

8) Make a static `flip` method that returns `Coin.HEADS` and `Coin.TAILS` with equal probability. Make a test case where you call `flip` multiple times and print out the result each time.

> **Question:** Where is the best place to put this method?

## Examples

```java
/**
 * Represents a sale of a car (the car name, the list price in dollars, the
 * discount in percent, and the total cost in dollars after applying the
 * discount.
 */
public class CarSale implements Sellable {
	private final String carName;
	private final double listPrice;
	private final double discount;

	public CarSale(String carName, double listPrice, double discount) {
		this.carName = carName;
		this.listPrice = listPrice;
		this.discount = discount;
	}

	public String getCarName() { ... }
	
	public double getListPrice() { ... }

	public double getDiscount() { ... }

	@Override
	public double getCost() {
		return listPrice * (1.0 - discount / 100);
	}

	@Override
	public String toString() {
		return "CarSale: " + carName + " with list price of $" + listPrice + " and discount of " + discount + "%.";
	}
}
```

```java
/**
 * Represents a sale of boxes of paper clips (the clip color, the per-box price,
 * the number of boxes being sold, and the total price).
 */
public class PaperclipSale implements Sellable {
	private String color;
	private double boxPrice;
	private int numBoxes;

	public PaperclipSale(String color, double boxPrice, int numBoxes) {
		this.color = color;
		this.boxPrice = boxPrice;
		this.numBoxes = numBoxes;
	}

	public String getColor() { ... }

	public double getBoxPrice() { ... }

	public int getNumBoxes() { ... }

	@Override
	public double getCost() {
		return boxPrice * numBoxes;
	}

	@Override
	public String toString() {
		return "PaperclipSale: " + numBoxes + " boxes of " + color + " clips at $" + boxPrice + "/box.";
	}
}
```

```java
/**
 * A routine to test out various SaleItem entries.
 */
public class SalesTest {
	public static void main(String[] args) {
		CarSale sale1 = new CarSale("Lamborghini Aventador", 400_000, 5);
		CarSale sale2 = new CarSale("Ferrari 458 Spider", 300_000, 4);
		PaperclipSale sale3 = new PaperclipSale("silver", 1.55, 3_000);
		PaperclipSale sale4 = new PaperclipSale("gold", 2.56, 2_000);
		Sellable[] sales = { sale1, sale2, sale3, sale4 };
		System.out.println("Items for sale:");
		for (Sellable sale : sales) {
			System.out.println("  " + sale);
		}
		System.out.println("Cheapest item: " + Sellable.cheapest(sales));
		System.out.println("Total cost: " + Sellable.totalCost(sales));
	}
}
```

```java
/**
 * Represents any class that has a way of computing totalCost. Also has static
 * methods that let you find the cheapest from an array of SameItem objects, and
 * to compute the total cost of an array of SameItem objects.
 */
public interface Sellable {
	double getCost();

	public static Sellable cheapest(Sellable[] items) {
		Sellable cheapestItem = null;
		...
		return cheapestItem;
	}

	public static double totalCost(Sellable[] items) {
		double total = 0;
		...
		return total;
	}
}
```

<br>

[<< Previous task](task08.md) | [Practice tasks](readme.md#practice) | [Next task >>](task10.md)

