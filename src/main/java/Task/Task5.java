package Task;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 Create a set of numbers (Set<Integer>) and add 10 different numbers to it.

 Remove from the set all numbers greater than 10 .

 Requirements:
 •Create createSet() method to create and return a HashSet containing 10 different numbers.
 •Create removeAllNumbersGreaterThan10() method to remove from the set all numbers greater than 10.
 •Write unit test for the removeAllNumbersGreaterThan10() method
 */
public class Task5 {

    /*public Set<Integer> createSet() {
        //write your code here
        return null;
    }
    public Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        //write your code here

        return null;
    }*/
    public Set<Integer> createSet() {
        Random rand = new Random();
        Set<Integer> set = new HashSet<>();
        while (set.size() < 10) {
            set.add(rand.nextInt(20));
        }
        return set;
    }
    public void removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        set.removeIf(num -> num > 10);
    }
    /*public static void main(String[] args) {
        Task5 a = new Task5();
        Set<Integer> s = a.createSet();
        System.out.println("before");
        for (int e : s) {
            System.out.println(e);
        }
        a.removeAllNumbersGreaterThan10((HashSet<Integer>) s);
        System.out.println("after");
        for (int e : s) {
            System.out.println(e);
        }
    }*/

}
