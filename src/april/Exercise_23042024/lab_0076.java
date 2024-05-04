package april.Exercise_23042024;

import java.util.Scanner;

public class lab_0076 {
    public static void main(String[] args) {

        // num<20, >20, =20;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if(number>20){
            System.out.println("num>20");
        } else if (number>10) {
            System.out.println("number is between 10 and 20");
        }  else {
            System.out.println("Num is <20");
        }
    }
}
