package june.exercise_1_06_2024;

import java.util.*;

public class Lab_254 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("Firstname","Pramod");
        map.put("Lastname","pawar");
        map.put("email","atul.singh2189@gmail.com");
        map.put("phone","88773484774");
        map.put("city","pune");
        map.put("state","MH");
        map.put("country","india");
        map.put("zip","563465");
     //   System.out.println(map);


        Map<String,String> map2 = new HashMap<>();
        map2.put("Firstname","Amit");
        map2.put("Lastname","pawar");
        map2.put("email","atul.singh2189@gmail.com");
        map2.put("phone","88773484774");
        map2.put("city","pune");
        map2.put("state","MH");
        map2.put("country","india");
        map2.put("zip","563465");
      //  System.out.println(map2);

        ArrayList list = new ArrayList();
        list.add(map);
        list.add(map2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));



    }
}
