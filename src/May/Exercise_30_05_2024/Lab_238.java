package May.Exercise_30_05_2024;

import java.util.ArrayList;
import java.util.List;


public class Lab_238 {

    // List- ArrayList, LinkedList, vector
    // stack
    // set- hashset, LinkedHashset, TreeSet
    // map- Hashmap, LinkedHashmap, Treemap
    // queue - PriorityQueue, linkedlist
    // hashtable, properties

    public static void main(String[] args) {

        List<String> courselist = new ArrayList<>();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PYTB");
        courselist.add("API");
        courselist.add("sdet blueprint");


        List numList = new ArrayList();
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        courselist.addAll(numList);
        System.out.println(courselist);

    }



}
