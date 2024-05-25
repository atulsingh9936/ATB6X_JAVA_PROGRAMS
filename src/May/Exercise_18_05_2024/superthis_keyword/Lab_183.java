package May.Exercise_18_05_2024.superthis_keyword;

public class Lab_183 {
    public static void main(String[] args) {
       student1 sc1 = new student1();

        // If child has DC -> ParentClass DC will be called by
        // super() automatically in Java

      // Person1 p1 = new Person1();


        // super.variable
        //super.method
        // super()-> DC
        // super ("pramod") -> PC

    }

}
class Person1{

    Person1(){
        System.out.println("Person1 - DC ");
    }
    Person1(String a ){
        System.out.println("Person1 - PC ");
    }
    Person1(String a , int a1){
        System.out.println("the name is   " +  a+ "the value is "+ a1);
    }

}

class student1 extends Person1{

    student1(String s){
        System.out.println("PC - student1");
    }
    student1(){
      //  super("pramod");
        // this("pramod");
        super("atul", 19);
        System.out.println("Student1 - DC");
    }
}
