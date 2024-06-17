package May.Exercise_28_05_2024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lab_236 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList();
        mylist1.add("pramod");
        mylist1.add("anusha");
        mylist1.add(("kiran"));
        System.out.println(mylist1);


        Vector v = new Vector();
        v.add("pramod");
        v.add("anusha");
        v.add("kiran");
        System.out.println(v);


        List l1 = new LinkedList();
        l1.add("Pramod");
        l1.add("Anusha");
        l1.add("kiran");
        l1.add("kiran1");
        l1.add("kiran2");
        l1.add("kiran3");
        System.out.println(l1);
    }
}
