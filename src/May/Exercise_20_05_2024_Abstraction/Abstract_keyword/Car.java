package May.Exercise_20_05_2024_Abstraction.Abstract_keyword;

abstract class Car {
    Car() {
    }

    void gearbox(){
        System.out.println("gearbox is working ");
    }

    abstract void drive();   // incomplete method in car class


}
