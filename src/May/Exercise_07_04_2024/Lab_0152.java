package May.Exercise_07_04_2024;

public class Lab_0152 {
    public static void main(String[] args) {
        // Non-return  with no parameter
         saySomethingplease();
        //Non-return with parameter
         sayHellotoyou("pramod");
        //return with no parameter
         sum_of_two_bad(3,4);
         //return with parameter
      int result =  sum_of_two_good(3,4);
        System.out.println(result);
    }

    static int sum_of_two_good(int a, int b) {
        return a+b;
    }

    static void sum_of_two_bad(int a, int b) {
         System.out.println();
        System.out.println(a+b);
    }

    static void sayHellotoyou(String name) {
        System.out.println("Non-return with parameter");
        System.out.println("hello" + name);
    }

    static void saySomethingplease() {
        System.out.println(" Non return with no parameter");
    }
}
