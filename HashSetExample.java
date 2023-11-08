package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");

        // Checking for existence
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Iterating over the set
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

