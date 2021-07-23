package Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * There is a Cat class with a String variable name, int variable age.
 * <p>
 * Create a Map<Integer, Cat> and add 10 cats represented by (index, Cat) pairs.
 * <p>
 * Get a Set of all cats from the Map and display it on the screen.
 * <p>
 * Requirements
 * •The program must not read data from the keyboard.
 * •The createMap method must create a new HashMap<Integer, Cat> object.
 * •The createMap method must add 10 cats to the map, represented by (index, Cat) pairs.
 * •The createMap method must return the created map.
 * •The convertMapToSet method must create and return the set of cats retrieved from the passed map.
 * •The program must display name and age each cats in the set.
 */

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, Cat> catMap = createMap();
        Set<Cat> cats = convertMapToSet(catMap);
        printCats(cats);
    }

    public static Map<Integer, Cat> createMap() {
        //write your code here

        Map<Integer, Cat> catMap = new HashMap<>();
        String[] catNames = {"Cat1", "Cat2", "Cat3", "Cat4", "Cat5", "Cat6", "Cat7", "Cat8", "Cat9", "Cat10"};
        for (int i = 0; i < catNames.length; i++) {
            String name = catNames[i];
            catMap.put(i, new Cat(name, i));
        }
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<Integer, Cat> map) {
        //write your code here
        return new HashSet<>(map.values());
    }

    public static void printCats(Set<Cat> cats) {
        //write your code here
        System.out.println("=========================");
        cats.forEach(cat -> {
            System.out.println("Cat name: " + cat.getName());
            System.out.println("Cat age: " + cat.getAge());
        });
        System.out.println("=========================");
    }

    public static class Cat {
        //write your code here
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
}
