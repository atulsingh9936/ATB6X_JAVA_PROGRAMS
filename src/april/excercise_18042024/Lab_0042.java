package april.excercise_18042024;

public class Lab_0042 {

    public static void main(String[] args) {

        int a1 =300;
       // byte b1 = a1; // not possible
        byte b1 = (byte) a1;  // explicit casting
        System.out.println(b1);
        // 300 -> 32 Bits  0000000000000100101100
        // byte - 8 bits
        // // 0 0 1 0 1 1 0 0
        // 44

    }
}
