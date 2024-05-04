package May.Exercise_02_05_2024.Arraypractice;

import java.util.Scanner;

public class array_homework_1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter first subject marks");
         marks[0] = sc.nextFloat();
        System.out.println("Enter second subject marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter third subject marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter fourth subject marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter fifth subject marks");
        marks[4] = sc.nextFloat();

        for(int i=0; i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
