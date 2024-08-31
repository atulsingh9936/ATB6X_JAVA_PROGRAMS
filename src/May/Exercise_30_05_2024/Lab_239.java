package May.Exercise_30_05_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab_239 {
    public static void main(String[] args) {
        List ttacourselist = new ArrayList<>();
        ttacourselist.add("Atb");
        ttacourselist.add("MTb");
        ttacourselist.add("LAPIT");
        ttacourselist.add("SDET blueprint");
        ttacourselist.add("Java for testers");
        ttacourselist.add(123);
        ttacourselist.add(true);
        ttacourselist.add(3.14f);


//        Iterator iterator = ttacourselist.iterator();
//        while (iterator.hasNext()) {
//            ttacourselist.add("pramod");
//            System.out.println(iterator.next());
//        }

//        for (Object course :ttacourseList){
//            System.out.println(course);
//        }
//
//        for (int i = 0; i < ttacourseList.size() ; i++) {
//            System.out.println(ttacourseList.get(i));
//        }
//
//        // List - ArrayList, LinkedList
//        ListIterator lt = ttacourselist.listIterator();
//        while(lt.hasNext()){
//            lt.add("Gen AI");
//            System.out.println(lt.next());
//        }

            // ATB, MTB, PyATB, LAPIT, SDET Blueprint

            ListIterator listIterator2 = ttacourselist.listIterator(ttacourselist.size());
            while (listIterator2.hasPrevious()){
               // ttacourselist.add("pramod");
                listIterator2.add("GEN AI");
//                System.out.println(listIterator2.hasPrevious());
            }


        }
    }

