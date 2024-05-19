package May.Exercise_14_05_2024;

public class ATB_person {
    // Variables
    // Local variables
    String name;  // instance variables
    long phone;
    String email;
    boolean isMarried;
    String coursename;

    public ATB_person(String name, long phone, String email, boolean isMarried, String coursename) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.isMarried = isMarried;
        this.coursename = coursename;
    }

    public ATB_person(String name){
        this.name = name;
    }

    public ATB_person(String name, long phone){
        this.name = name;
        this.phone = phone;
    }
    // constructor
    // default constructor

    ATB_person(){
        System.out.println("default constructor");
        coursename ="ATB";
    }

  //  parameterized constructor
//    ATB_person(String givenname, long givenphone){
//        System.out.println("Param constructor");
//        this.name = givenname;
//        this.phone= givenphone;
//    }

    //DC
  //  It is a special method with no return type
    // It is called once when you create a new object
    // It has same name as class name
    void ATB_person(){
        System.out.println("default constructor");

    }

    void printDetails(){
        int age =10;
        System.out.println("printing details of student");

    }

}
