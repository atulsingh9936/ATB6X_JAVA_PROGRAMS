package Excercise_27042024;

import java.util.Scanner;

public class Lab_0120 {
    public static void main(String[] args) {
        // Factorial Program
        // 1! -> 1
        // 2! -> 2*1
        // 3! -> 3*2*1 -> 6
        // 4! -> 4*3*2*1 -> 24
        // 5! -> 5*4*3*2*1 -> 120

        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();

        long fact =1;

        //5-> int i= 1 ,5<5, 1
        // a -> int i=1;
        // b -> i<= number
        //c -> i++

        for(int i=1;i<=number;i++){  // num=5
            fact=fact*i;
        }
        System.out.println(fact);  // fact =120

    }
}
