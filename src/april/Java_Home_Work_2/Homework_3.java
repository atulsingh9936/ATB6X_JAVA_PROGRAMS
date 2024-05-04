package april.Java_Home_Work_2;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        int ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||

                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

    }
}