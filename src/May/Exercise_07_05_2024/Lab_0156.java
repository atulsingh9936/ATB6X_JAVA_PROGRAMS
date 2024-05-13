package May.Exercise_07_05_2024;

public class Lab_0156 {
    public static void main(String[] args) {
   f1();
   String [] name ={"pramod", "dutta"};
   f1(name);
   String [] names = new String[2];
   names[0] ="atul";
   names[1] ="Rama";

        // Parameter -  any data type
        // Primitive - byte, short, long, float, int, boolean
        // Non-Primitive - String, Arrays
    
    }
    static void f1(String [] a){
        for(String name:a){
            System.out.println(name);
        }

    }

    static void f1(){
      f2();
        System.out.println("F1");

    }
    static void f2(){
        System.out.println("F2");


    }
}
