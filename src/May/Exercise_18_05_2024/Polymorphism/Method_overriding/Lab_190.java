package May.Exercise_18_05_2024.Polymorphism.Method_overriding;

public class Lab_190 {
    public static void main(String[] args) {
//
//        Dog d = new Dog();
//        d.bark();
//
//
//        Hound h1 = new Hound();
//        h1.bark();

        Dog d1 = new Hound();   // dynamic dispatch  -> runtime polymorphism
        d1.bark();
    }


    void main(String a ){}
    void main(int a ){}
    void main(byte a ){}


}
