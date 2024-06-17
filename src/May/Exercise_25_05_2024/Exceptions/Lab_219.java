package May.Exercise_25_05_2024.Exceptions;

public class Lab_219 {
    public static void main(String[] args) {
        String sh = args[0]; // 5
        int x = Integer.parseInt(sh); // (String)5-> (int)5// int x =5
        int a = 10/x; // 10/5 ->2
        System.out.println(x);
        System.out.println(a);

        // test case for program
        // 5
        // no put -> j java.lang.ArrayIndexOutOfBoundsException
        // 0 ->java.lang.ArithmeticException
        // -5
        // pramod  -> java.lang.NumberFormatException
        // 3.45 -> java.lang.NumberFormatException
        //@@###$$&&*** -> java.lang.NumberFormatException
    }
}


// NumberFormatException
//ArithmeticException
// ArrayIndexOutOfBoundsException