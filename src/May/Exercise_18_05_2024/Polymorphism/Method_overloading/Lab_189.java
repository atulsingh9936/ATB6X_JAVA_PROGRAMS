package May.Exercise_18_05_2024.Polymorphism.Method_overloading;

public class Lab_189 {
    // method - overloading -> multiple methods with same name , but different arguments

    // order also matters


    Lab_189 (){

    }

    Lab_189(int a ){

    }

    Lab_189(int a , int b ){

    }
    Lab_189(int a , String b ){

    }


    void Gift(String a) {
        System.out.println("A is a String" + a);
    }

    int Gift(int x) {
        System.out.println("X is a Int" + x);
        return x;
    }

    int Gift(float x) {
        System.out.println("X is a Int" + x);
        return 89;
    }

    void Gift(double x) {
        System.out.println("X is a double" + x);
    }



    void a(int pramod,float amit){

    }
    void a(float y,int x){

    }

    public static void main(String[] args) {
        Lab_189 p = new Lab_189();
        p.Gift(10);
    }
}