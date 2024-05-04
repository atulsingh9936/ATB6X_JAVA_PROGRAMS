package Practice;

public class p5 {
    public static void main(String[] args) {
         // == ->   reference
        // .equals()  -> content/values


        int [] arr1 ={1,2,3,4,5};
        int [] arr2={1,2,3,4,5};
        System.out.println(arr1);
        System.out.println(arr2);


        System.out.println(arr1== arr2);
        System.out.println(arr1.equals(arr2));


        int [] arr3 = arr1;
        System.out.println(arr1==arr3);


        String s1 ="Pramod";
        String s2 ="Pramod";
        System.out.println(s1.equals(s2));
    }
}
