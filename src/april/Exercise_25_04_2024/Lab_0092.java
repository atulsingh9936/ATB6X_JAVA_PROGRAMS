package april.Exercise_25_04_2024;

import java.util.Scanner;

public class Lab_0092 {
    public static void main(String[] args) {
        // program to check grade based on the marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        //  90 ->  90/10 -> 9 -> A ( 90-100) -> A
        //  87 ->  87/10 -> 8 -> B (80-89) -> B
        //  77 ->  77/10 -> 7 -> C ( 70-79) -> C


        marks = marks/10;
        System.out.println(marks);

        switch (marks) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 1:
                System.out.println("F");
                break;
            default:
                System.out.println("None");
        }
    }
}
