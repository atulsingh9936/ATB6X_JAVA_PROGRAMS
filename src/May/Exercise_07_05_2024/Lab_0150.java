package May.Exercise_07_05_2024;

public class Lab_0150 {
    public static void main(String[] args) {

     int r1 =   sum_of_two_number(4,5);
        System.out.println(r1);
      int r2=  sum_of_two_number(7,9);
      String r3=  sum_of_two_number("pramod",9);

        System.out.println(r2);

    }

    static int sum_of_two_number( int a, int b){
        return a+b;
}
    static String sum_of_two_number( String a, int b){
        return a+b;
    }

}
