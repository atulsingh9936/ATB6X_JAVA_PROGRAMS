package May.Exercise_23_05_2024;

public class Lab_204 {
    public static void main(String[] args) {

       A a = new A();
       A b = new A();
     //  A c = null;  // Object ci not Created so IIB will not be called 3 rd time

      //  A b  = null;// class is loaded but point sto null so static block will not be called


       // System.out.println(A.age);// non static variable cannot be referenced from static variable

        System.out.println(A.common);
        System.out.println(a.common);
        System.out.println(b.common);
        A.m1();
        a.m1();
        b.m1();


      //  A.m2();
        a.m2();
        b.m2();



        A c = null;  // new A();
        c.m1();
        c.m2();  // Instance is not created and cannot access

    }
}
class A{

    int age =10;

    static  String common = "Abc";
      static {
          System.out.println("SIB - A");
      }
    {
        System.out.println("IIB");
    }

    static void m1(){
        System.out.println("m1");
    }

    void m2(){
        System.out.println("M2");
    }


        }

