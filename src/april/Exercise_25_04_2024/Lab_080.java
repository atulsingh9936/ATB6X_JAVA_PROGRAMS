package april.Exercise_25_04_2024;

import java.util.Scanner;

public class Lab_080 {
    public static void main(String[] args) {
        //  if -else condition(if, else-if, else) - multiple condition
       // switch  - multiple condition

        // Which day it is?
        //  1 ->  mon, sunday -> 7 , 4 -> Thurs
        // 1,2,3,4,5,6,7 -> MTWTFSS

        // Create a simple program - user will enter a number, we will tell user which day it is.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1-7, and i will tell you which daya it is");
        int day = sc.nextInt();


        switch (day){
            case 1:
            System.out.println("Monday!");
            break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("wednesday!");
                break;
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
                case 6:
                System.out.println("Saturday!");
                    break;
            case 7:
                System.out.println("sunday!");
                break;
            default:
                System.out.println("1-7 are allowed");

        }
        System.out.println("End of the program, I will be executed anyhow!");
    }
}
