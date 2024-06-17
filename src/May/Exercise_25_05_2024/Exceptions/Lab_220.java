package May.Exercise_25_05_2024.Exceptions;

import java.io.FileInputStream;

public class Lab_220 {
    public static void main(String[] args) {
        // exception
        // checked  - jvm knows
        // compile time -/JVM figure it out that there is some issue
//        FileInputStream f = new FileInputStream( "C:log.text");
        // File io -open

     try {
         FileInputStream f = new FileInputStream("C:log.text");
     }catch(Exception e){
         System.out.println(e.getMessage());
     }


        //unchecked - jvm doesnt know
        int a=10;
        int c = a/0;
        System.out.println(c);
    }
}
