package May.Exercise_23_05_2024;

public class Lab_202 {
    public static void main(String[] args) {

        Person p1 = new Person("Atul");
        Person p2 = new Person("Pramod");
        System.out.println(Person.FootballClub);

        // static
        // classname.function
        Person.m1();


        Person.FootballClub = "Manu";
        System.out.println(Person.FootballClub);
        System.out.println(p1.FootballClub);
        System.out.println(p2.FootballClub);



//        p1.m1();
//        p2.m2();

        // non static  - reference
        p1.m2();
        p2.m2();


    }

}


class Person{

    static  String FootballClub ="Aresnal";


    static{
        System.out.println("once, when class is loaded");
    }

    {
        System.out.println("IIB");
    }
      // static function

    static  void m1(){
        System.out.println("I am a common function");
    }

     // non static function
    void m2(){
        System.out.println("Person-> "+ this.name);
    }


    String name;   // non static (not common)

    public Person(String name) {
        this.name = name;
    }
}
