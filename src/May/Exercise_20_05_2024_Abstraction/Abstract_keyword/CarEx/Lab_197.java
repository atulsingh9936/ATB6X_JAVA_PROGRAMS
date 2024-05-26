package May.Exercise_20_05_2024_Abstraction.Abstract_keyword.CarEx;

public class Lab_197 {
    public static void main(String[] args) {
        Car Lamborghini = new Car();
        Lamborghini.openCar();
        Lamborghini.start();
        Lamborghini.partsGearBox();
        Lamborghini.stop();
//        Keys k = new Keys();
//        k.openCar();

        Tesla t1 = new Tesla();
        t1.openCar();
        t1.start();
        t1.partsGearBox();
        t1.stop();
    }
}
