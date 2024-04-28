package Exercise_25_04_2024;

import java.util.Scanner;

public class Lab_0082 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char , i will tell you , if it is a vowel or not!");
        char user_input = sc.next().toCharArray()[0];

        switch (user_input){

            case 'a':
                System.out.println("vowel");
                int a=10;
                int b =90;
                System.out.println(a+b);
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a vowel, It is consonant");
        }
        sc.close();
    }
}
