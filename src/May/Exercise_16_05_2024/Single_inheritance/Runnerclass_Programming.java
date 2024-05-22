package May.Exercise_16_05_2024.Single_inheritance;

public class Runnerclass_Programming {
    public static void main(String[] args) {
        // what is inheritance

        // inherit attribute and behaviour from parent and grandparent


        // superclass | Parent class | Base class
        // subclass |child class |Derived class

        // parent - child

        // child extends parent
        //extends keyword -> parents attribute are available to the  child(class)



        // single inheritance

        // parent-> Programming
        // child-> java


        // java extends programming

        Programming p = new Programming(12,"Ko Posan");
        java j = new java ("lambda expression");
        p.printinfo();
        j.printinfo();

        Programming p1 = new Programming (12,"Van russom");
        p1.printinfo();

        Python python = new Python();
        python.printinfo();


    }
}
