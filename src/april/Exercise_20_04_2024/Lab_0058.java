package april.Exercise_20_04_2024;

public class Lab_0058 {

    public static void main(String[] args) {
          String str1="Hello";
          String str2=" Guys ";
          String str3="Hello guys";

          // whenever we will perform any operation, a new string will be created

        String str4= str1.concat(str2);
        System.out.println(str4);

        // strings are immutable in nature
        // if you want to change the values
        // dont use string class  go with string builder and String buffer

    }
}
