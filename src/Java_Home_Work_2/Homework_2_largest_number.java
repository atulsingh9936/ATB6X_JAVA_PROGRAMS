package Java_Home_Work_2;

import java.util.Scanner;

public class Homework_2_largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num2 = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Number is largest which is + "+num1);
        } else if (num2>num3 && num2>num1) {
            System.out.println("second number is "+num2+ "which is largest");

        }else {
            System.out.println("number three is largest which is"+num3);
        }

    }
}
