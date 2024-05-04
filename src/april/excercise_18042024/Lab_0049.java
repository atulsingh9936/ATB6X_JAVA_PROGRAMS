package april.excercise_18042024;

public class Lab_0049 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ +a++);

        // part A -> ++a, exp1 = 11, a=11
        // part B  -> a++  exp2 = 11, a=12
        //  part c  -> a++  exp3 =12 , a=13

      //  op->exp1+exp2+exp3
        System.out.println(a);
    }
}
