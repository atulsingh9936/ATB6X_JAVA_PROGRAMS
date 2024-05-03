package Exercise_02_05_2024;

import java.util.Scanner;

public class Lab_0132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        System.out.println("Enter the first subject marks");
        marks [0] = sc.nextFloat();
        System.out.println("Enter the second subject marks");
        marks [1] = sc.nextFloat();
        System.out.println("Enter the third subject marks");
        marks [2] = sc.nextFloat();
        System.out.println("Enter the fourth subject marks");
        marks [3] = sc.nextFloat();
        System.out.println("Enter the fifth subject marks");
        marks [4] = sc.nextFloat();

        for(int i=0;i<marks.length;i++){
            if(marks[i]<30){
                System.out.println("failed in the subject "+marks[i]);
            }
            System.out.println(marks[i]);
        }
        sc.close();


        int j=0;
        while(j<marks.length){
            System.out.println(marks[j]);
            j++;
        }
    }
}
