package May.Exercise_30_05_2024;

import java.util.*;

public class Lab_240 {
    public static void main(String[] args) {
        List courselist = new LinkedList();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PYTB");
        courselist.add("API");
        courselist.add("sdet blueprint");
        System.out.println(courselist);



        Vector <String> v2 = new Vector<>();
        v2.add("ATB");
        v2.add("MTB");
        v2.add("PYTB");
        v2.add("API");
        v2.add("sdet blueprint");

        Enumeration e = v2.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
