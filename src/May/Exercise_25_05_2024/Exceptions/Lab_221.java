package May.Exercise_25_05_2024.Exceptions;

public class Lab_221 {
    public static void main(String[] args) {
       try {

           String sh = args[0]; // 5
           int x = Integer.parseInt(sh); // (String)5-> (int)5// int x =5
           int a = 10 / x; // 10/5 ->2
           System.out.println(x);
           System.out.println(a);
       } catch (Exception e){
           System.out.println(e.getMessage());
           System.out.println("can you please enter input ?");
       }

        // jvm will  be initialized
        // create and start the main thread
        // main thread will do the following tasks
        //1) collects the command line arguments
        // 2 creates the string array with CLA
        // 3) calls main method by passing string array as parameter
        // Lab211.main(5)
        // now control will be transferred from  main thread to main method
        // control will come back to main method in two ways
        // A) when problem comes in main -> JVM
        // jvm will creates the object of identified exception class
        // exception a  = new exception();
    }
}
