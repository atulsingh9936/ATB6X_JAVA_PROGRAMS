package May.Exercise_28_05_2024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab_235 {
    public static void main(String[] args) {
        ArrayList mylist1 = new ArrayList();  // child reference - child object
        List mylist = new ArrayList();  // Father reference - child object
        Collection mylist2 = new ArrayList(); // grandfather reference - child object
        SequencedCollection mylist3 = new ArrayList(); // Grand grand father -> child object


        // Array list -> behind the scene it uses dynamic array
        // size filled around 90 , double the size automatically
        // size is dynamic
        // duplicate is allowed
        // insertion order is preserved
        // hetrogeneous  objects are allowed
        // null insertion is allowed


        mylist.add("Pramod");
        mylist.add("anusha");
        mylist.add("kiran");
        System.out.println(mylist);

        mylist.add("Pramod");
        mylist.add("Pramod");
        mylist.add("null");
        mylist.add("null");
        mylist.add("Pramod");
        System.out.println(mylist);

        System.out.println(mylist.size());
        mylist.remove("Pramod");
        System.out.println(mylist);





    }
}
