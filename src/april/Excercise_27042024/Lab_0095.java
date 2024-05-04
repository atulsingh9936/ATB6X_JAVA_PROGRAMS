package april.Excercise_27042024;

import java.util.Scanner;

public class Lab_0095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter the number 3");
        int num3 = sc.nextInt();

        if(num1>=num2 &&num1 >= num3){
            System.out.println("largest number is "+ num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("largest number is "+num2);


        } else {
            System.out.println("largest number is "+num3);
        }


        //
        // ? ->  condition ? (if true) -> do this : if false -> do that

        // num1 = 90, num2 = 91 , num3 = 100;

//        int A = (num1 > num3) ? num1 : num3;
//        int B = (num2 > num3) ? num2 : num3;
//        int largest = (num1 > num2) ? A : B;
   sc.close();
    }
}
