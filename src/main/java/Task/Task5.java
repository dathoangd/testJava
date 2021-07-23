package Task;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Create a set of numbers (Set<Integer>) and add 10 different numbers to it.
 * <p>
 * Remove from the set all numbers greater than 10 .
 * <p>
 * Requirements:
 * •Create createSet() method to create and return a HashSet containing 10 different numbers.
 * •Create removeAllNumbersGreaterThan10() method to remove from the set all numbers greater than 10.
 * •Write unit test for the removeAllNumbersGreaterThan10() method
 */
public class Task5 {

    public Set<Integer> createSet() {
        return new HashSet<>();
    }

    public void removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        set.removeIf(num -> num > 10);
    }
}
