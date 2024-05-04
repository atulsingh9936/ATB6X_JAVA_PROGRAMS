package april.Exercise_23042024;

import java.util.Scanner;

public class Lab_0075 {

    public static void main(String[] args) {

        System.out.println("Enter number 1");
        Scanner sc =  new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        int max= Math.max(num1,num2);
        System.out.println("max by math.max function"+max);

        if(num1>num2){

            System.out.println("Max is ->"+ num1);
        }else{
            System.out.println("Max is ->"+num2);
        }
    }
}
