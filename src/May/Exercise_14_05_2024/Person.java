package May.Exercise_14_05_2024;

public class Person {
    String name;
    int age;


    // parameterized constructor

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    Person(Person person){
     this.name = person.name;
     this.age= person.age;
    }

    public static void main(String[] args) {
        Person person1= new Person("john",30);
        System.out.println(person1.name +   " Is " +   person1.age + " years old "  );
        Person person2 = new Person(person1);
        Person person3 = new Person(person1);
        Person person4 = new Person(person1);
        System.out.println(person2.name +   " Is " +   person2.age + " years old "  );

    }
}
