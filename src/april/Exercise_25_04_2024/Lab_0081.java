package april.Exercise_25_04_2024;

import java.util.Scanner;

public class Lab_0081 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> start chrome, firefox -> firefox, edge -> execution edge


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name !! where you want to execute the program");

        String browsername = sc.nextLine();
        browsername = browsername.toLowerCase();

        switch(browsername){

            case "chrome":
                System.out.println(" Starting the chrome browser");
                // further code to start the chrome
                //  Webdriver driver = new Chromedriver(); // selenium code
                break;
            case "firefox":
                System.out.println(" Starting the Firefox browser");
                // further code to start the firefox
                //  Webdriver driver = new firefoxdriver(); // selenium code
                break;

            case "edge":
                System.out.println(" Starting the Firefox browser");
                // further code to start the edge
                //  Webdriver driver = new Chromedriver(); // selenium code
                break;
            default:
                System.out.println("I have not idea which browser is this");
        }
    }
}
