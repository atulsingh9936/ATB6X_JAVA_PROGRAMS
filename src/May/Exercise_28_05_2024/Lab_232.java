package May.Exercise_28_05_2024;

import java.util.ArrayList;
import java.util.List;

public class Lab_232 {
    public static void main(String[] args) {

      //  List mylist1 = new List();
        // list is an interface we cannot create object of interface
        List mylist = new ArrayList();
     //   ArrayList ArrayList1 = new ArrayList();
        // add , remove, clear, contains, indexof, isempty, size, getsize
        // addAll, removeAll, retainAll,


        mylist.add("Pramod");
        mylist.add("anusha");
        mylist.add("kiran");
        mylist.add("Pramod");
        mylist.add("Pramod"); // duplicate
        System.out.println(mylist);
        System.out.println(mylist.size());

        mylist.remove("Pramod"); // Removes the first occurrence of the specified element from this list, if it is present (optional operation).
        System.out.println(mylist);

        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());

        mylist.add("Pramod");
        mylist.add("anusha");
        mylist.add("kiran");
        mylist.add("Pramod");
        System.out.println(mylist);
        mylist.add("dutta");
        System.out.println(mylist);
        mylist.add(1,"Anusha dutta");

        System.out.println(mylist);

        mylist.add("dutta1");

        System.out.println(mylist);
        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);

        System.out.println("------------");

        // how to print ? -> [Pramod, Anusha dutta, anusha, kiran, Pramod, dutta, dutta1, 123, true]

        for(int i =0; i<mylist.size();i++){
            System.out.println(mylist.get(i));

            // for each
            for(Object obj :mylist){
                System.out.println(obj);
            }
        }






    }
}
