package May.Exercise_16_05_2024.muiltilevel_inheritance;

public class Runner_class {
    public static void main(String[] args) {
//        Child c = new Child();
//        c.home();

//        Grandfather grandfather = new Grandfather();
//        grandfather.home();
//
//        Father father = new Father();
//        father.home();


        // dynamic dispatch

        Grandfather grandfather = new Child();
        Grandfather grandfather1 = new Father();
        Grandfather grandfather2 = new Grandfather();

        grandfather.home();
        grandfather1.home();
    }
}
