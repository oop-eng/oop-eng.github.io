[<< Previous task](task10.md) | [Practice tasks](readme.md#practice)

<span id="task_11"></span>
## 11. Java Threads: Defining and starting a thread

- [Oracle: The Java Tutorials - Defining and Starting a Thread](https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html).
- [Jenkov Aps: Creating and Starting Java Threads](http://tutorials.jenkov.com/java-concurrency/creating-and-starting-threads.html).

1) Make a new Eclipse project called `task11`.

2) Develop a program that prints a series of specified messages at specified intervals. Initial data: message **text**, **delay**, **number** of repetitions. Use the following class, add the required functionality.

```java
class PrintMessageTask implements Runnable {
	private String text;
	private long delay;
	private int number;

	public PrintMessageTask(String text, long delay, int number) {
		this.text = text;
		this.delay = delay;
		this.number = number;
	}

	public void run() {
		// Add your implementation here.
		// ...
	}
}
```

3) Test the created class by measuring the time of printing messages:

```java
PrintMessageTask task = new PrintMessageTask("abc", 1000, 5);
long startTime = System.currentTimeMillis();
task.run();
long elapsedMillis = System.currentTimeMillis() - startTime;
System.out.println("Time: " + elapsedMillis);
```

The result should look something like this:

```
abc
abc
abc
abc
abc
Time: 5002
```

4) Print a series of messages in separate threads. Use a new thread for each `PrintMessageTask` object.

5) Test multithreaded message printing for **20 or more** different `PrintMessageTask` objects.

> **Hint:**  Use a random number generator to set parameters when creating objects.

6) Stop printing messages after the specified time has elapsed.

<br>

[<< Previous task](task10.md) | [Practice tasks](readme.md#practice)

