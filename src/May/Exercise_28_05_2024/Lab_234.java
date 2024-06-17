package May.Exercise_28_05_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_234 {
    public static void main(String[] args) {

       List<String> mylist = new ArrayList();
       mylist.add("Pramod");
       mylist.add("Amit");
       mylist.add("dutta");

        System.out.println("-To Print Arraylist -1");

        for(String str :mylist){
            System.out.println(str);
        }

        System.out.println("-To Print Arraylist -2");
        for(int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        System.out.println("-To print Arraylist 3-");
        Iterator<String> itr = mylist.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
