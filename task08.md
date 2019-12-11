[<< Previous task](task07.md) | [Practice tasks](readme.md#practice)

<span id="task_08"></span>
## 8. Object-Oriented Programming: Advanced Capabilities

1) Make a new Eclipse project called `task08` or similar.

2) Make a `CarSale` class to represent the sale of a car. The class should represent the *car name* (model), the *list price*, the *discount* in percent, and the *final cost* (calculated from the *list price* after the *discount* is applied as shown below). Make a few instances and print them out.

```java
public class CarSale {
	private final String carName;
	private final double listPrice;
 	private final double discount;
 	...
 	public double getCost() {
		return(listPrice * (1.0 - discount/100));
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

## Extra

6) Make a `Coin` enum with instances named `HEADS` and `TAILS`.

7) Make a static `flip` method that returns `Coin.HEADS` and `Coin.TAILS` with equal probability. Make a test case where you call `flip` multiple times and print out the result each time.

> **Question:** Where is the best place to put this method?

<br>

[<< Previous task](task07.md) | [Practice tasks](readme.md#practice)

