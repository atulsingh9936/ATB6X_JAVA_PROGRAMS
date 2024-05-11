package May.exercise_04_05_2024;

import java.util.Scanner;

public class Lab_0145 {
    public static void main(String[] args) {


        // Palindrome- string
        // naman ->reverse->naman
        // 1131->1131
        // malayalam -> malayalam
        // mom
        // madam
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string , i will check if it is palindrome or not ");
        String user_input = sc.next();

        StringBuilder sb = new StringBuilder(user_input);
        String rev_user_input = sb.reverse().toString();
        if(user_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("palindrome   ->" +user_input);
        } else{
            System.out.println(" Not palindrome");
        }

    }
}
