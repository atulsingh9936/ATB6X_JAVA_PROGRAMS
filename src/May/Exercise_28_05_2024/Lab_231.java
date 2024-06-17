package May.Exercise_28_05_2024;

import java.util.List;

public class Lab_231 {
    public static void main(String[] args) {

        // shopping list
        // milk, bread, butter, cheese
        // 4 elements
        // collection framework -> how you can store the elements
        // 1. list(interface) -> Array list, linkedlist, stack, vector

        List shopping_list = List.of("milk","Bread", "egg", "cheese");
        System.out.println(shopping_list);
        // length
        System.out.println(shopping_list.size());

        List fruits = List.of("orange","apple","mango","banana","apple", "watermelon");
        // list can store duplicates
        System.out.println(fruits);
        System.out.println(fruits.size());

//        List my_10_marks = List.of(91,92,93,95,100);
//        System.out.println(my_10_marks);
//        System.out.println(my_10_marks.size());
//
//        List different_data_types =List.of("Pramod",true, 123);

        System.out.println(fruits.get(0));
        System.out.println(fruits.indexOf("banana"));

        // is empty
        System.out.println(fruits.isEmpty());
        // add , remove, clear, contains, indexof, isempty, size, getsize
        // addAll, removeAll, retainAll,containsAll


//        fruits.add("grapes");
//        System.out.println(fruits);
    }
}
