package june.exercise_1_06_2024;

import java.util.HashSet;
import java.util.Set;

public class Lab_245 {

    public static void main(String[] args) {

        Set <String> fruits = new HashSet();
        // How hashset works
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("apple");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("apple");
        System.out.println(fruits);


    }
}
