package Exercise_25_04_2024;

import java.util.Scanner;

public class Lab_0091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();


        System.out.println("Enter your Age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();


        System.out.println("Your details are " +name);
        System.out.println("Your age is" + age);
        System.out.println("your salary is"+ salary);

    }
}
