package objects;

/*
 * Question 14: Synchronization
Create a class Counter with a private field count and methods increment and getCount.
Use synchronization to ensure that multiple threads can safely increment the counter.
Create a main method to demonstrate the use of the Counter class with multiple threads incrementing the counter.
 */
public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
