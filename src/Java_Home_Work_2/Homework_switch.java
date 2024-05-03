package Java_Home_Work_2;

import java.util.Scanner;

public class Homework_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num1");
        int num2 = sc.nextInt();
        System.out.println("enter char +,*,/ ,%, -");
        int operator = sc.next().charAt(0);

        switch(operator){
            case '+' :
            {
                System.out.println("result is "+ (num1+num2));
            }
            break;
            case '-' :
            {
                System.out.println("result is "+ (num1-num2));
            }
            break;
            case '/' :
            {
                System.out.println("result is "+ (num1/num2));
            }
            break;
            case '*' :
            {
                System.out.println("result is "+ (num1*num2));
            }
            break;
            case '%' :
            {
                System.out.println("result is "+ (num1%num2));
            }
            break;
            default:
            {
                System.out.println("Invalid operator");
            }


        }
    }
}
