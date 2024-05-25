package May.Exercise_18_05_2024.superthis_keyword;

public class Lab_185 {
    public static void main(String[] args) {
       dog d1 = new dog();
        dog d2 = new dog("Labrador");
        d2.display();

        dog d3 = new dog("Golden retriever","DOG TT");
        d3.display();

       // constructor chaining -> if child dc has called -> the parent dc will be called automatically

    }

}
class Animal{

    String type;
    Animal(){
        System.out.println("Animal - DC");
    }

    Animal(String type){
        this.type = type;
        System.out.println("Animal -PC ");
    }


}

class dog extends Animal{
    String breed;
    int a;


    dog(){
        System.out.println("Dog - DC");
    }

     dog(String breed) {
        this.breed = breed;
    }

    dog(String breed, String type) {
        this("breed set by dog only");
        this.type = type;
        System.out.println("parameterized constructor with two arguments");
    }

    dog(String breed, String type,int a) {
        this("breed set by dog only", "Golden retriever");
        this.a = a;
        System.out.println("parameterized constructor with two arguments");
    }


    void display(){
        System.out.println("Type: " + type + "Breed: "+ breed);
    }
}
