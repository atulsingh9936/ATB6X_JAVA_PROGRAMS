package Java_Home_Work_2;

import java.util.Scanner;

public class Homework_5_primenumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not");
        int num = sc.nextInt();
        int count =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Number is prime");
        } else{
            System.out.println(" not a prime number");
        }




    }
}