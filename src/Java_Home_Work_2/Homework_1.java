package Java_Home_Work_2;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");

        } else if (num<0) {
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is zero");
        }



    }
}
