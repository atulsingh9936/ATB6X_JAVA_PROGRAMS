package May.Exercise_16_05_2024.Single_inheritance;

public class java  extends  Programming{
    // single inheritance  - Is A Relationship
    // Java is a programming language
    // python is a programming language
//    int version;
//    String author;
     String newfeature;
    public java() {
        System.out.println("Default constructor");
    }

    public java(String newfeature) {
        this.newfeature = newfeature;
    }

   void printinfo(){
       System.out.println("Feature is -> "+  this.newfeature);
       bhk3();

   }

}
