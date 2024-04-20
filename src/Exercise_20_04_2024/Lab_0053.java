package Exercise_20_04_2024;

import java.util.Locale;

public class Lab_0053 {
    public static void main(String[] args) {
        String name = "Atul";  // Assignment operator
      //  String name2 = new String("Atul");  // new operator
        // both of them actually save the name, name 2 in different ways in JVM
        // how they store values in JVM
        System.out.println(name);
        System.out.println("your name is ->" + name);
        System.out.printf("your name is ->%s",name);
        System.out.println("\n---------All the function available in string-------- ");
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());



        int age =65;
        char c ='a';
        boolean b =true ;


        // primitive data types - bye, short, long, int , double, float, char, boolean
        //all of them don't have extra functionality
        //oops - object oriented - primitive
        // definition of oops- everything should be a class
        // oops- fully - dont have anything which is not in class format/primitive
        // java  is not pure object oriented



        // non-primitive data type
        // string- extra functionality



    }
}
