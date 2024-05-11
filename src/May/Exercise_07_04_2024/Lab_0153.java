package May.Exercise_07_04_2024;

import java.util.Scanner;

public class Lab_0153
{
    public static void main(String[] args) {

/*  divide the task into smaller chunks
*   calculator
*   sum-> sum function
*   sub-> subtraction function
*   mul- mutiply function
*
* */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2");
        int num2 = sc.nextInt();


        int r_sum =sum (num1, num2);
        System.out.println("Sum is-> " + r_sum);
        int r_sum2 = sum(34,65);
        System.out.println("sum is ->"+ r_sum2);
        int r_sub =sub (num1, num2);
        System.out.println("sub is-> " + r_sub);

        int r_mul = mul (num1, num2);
        System.out.println("mul is-> " + r_mul);

    }
    static int sum (int a, int b){
        return a+b;
    }



    static int sub(int a , int b){
        return a-b;
    }

    static int mul (int a , int b){
        return a*b;
    }
}
