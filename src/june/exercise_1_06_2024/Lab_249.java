package june.exercise_1_06_2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_249 {
    public static void main(String[] args) {
        Set<Integer> Integerset = new HashSet<>();
        Integerset.add(123456);
        Integerset.add(12334);    // random order
        Integerset.add(123);
        Integerset.add(12);
        Integerset.add(null);
        System.out.println(Integerset);


        Set<Integer> Integerset2 = new LinkedHashSet<>();
        Integerset2.add(123456);
        Integerset2.add(12334);
        Integerset2.add(123);    // order will be preserved as in the same orders the value are entered
        Integerset2.add(12);
        Integerset2.add(null);
        System.out.println(Integerset2);

        Set<Integer> IntegerSet3 = new TreeSet<>();
        IntegerSet3.add(11);               // element will store and displayed in sorted order
        IntegerSet3.add(8);
       // IntegerSet3.add(null);     // null value is not allowed
        System.out.println(IntegerSet3);

        Set IntegerSet4 = new TreeSet<>();
        IntegerSet4.add("Pramod");
        IntegerSet4.add("Dutta");
        IntegerSet4.add("Autta");
        System.out.println(IntegerSet4);
    }
}