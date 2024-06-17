package May.Exercise_25_05_2024;

import java.sql.SQLOutput;

public class Lab_211 {
    public static void main(String[] args) {
        int x =123;
      //  String s1 = x;
      //  String s1 = (String)x;

        String s1 = String.valueOf(x);
        System.out.println(s1);


        Character ch = 'a'; // wrapper class
       // char a3= 'A';  // primitive

        char a3= ch;  // wrapper to Primitive - unboxing - Automatically

        Boolean b = true;
        Long l =  34l;
        Double d1= 90.0;
        Float f1= 90.89f;


        // wrapper class is used to convert Primitive data types to objects


        Integer intobject = Integer.valueOf(5);
        System.out.println(intobject);



        Integer a2 = 89;
        // Autoboxing (Primitive -> wrapper(Automatically)
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(4,5));
        System.out.println(Integer.max(1, 34));
        System.out.println(Integer.max(1,34));


      //  Integer a1 = new Integer(10);  // After JDK 9 it is deprecated
        Integer a1 = Integer.valueOf(10);




    }
}
