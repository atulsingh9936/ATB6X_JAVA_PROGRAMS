package May.Exercise_02_05_2024;

public class Lab_0127 {
    public static void main(String[] args) {
        // ==  -> reference
        // .equals()-> values/ content
          int [] arr1 = {1,2,3,4,5};
          int [] arr2 ={1,2,3,4,5};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);

        int [] arr3 = arr1;
        System.out.println(arr1==arr3);



        System.out.println(arr1.equals(arr2));// objects.java file -> checks for reference



        String s1 = "Atul";
        String s2 = "Atul";

        System.out.println(s1.equals(s2)); // content - strings .java file-> checks for content

    }
}