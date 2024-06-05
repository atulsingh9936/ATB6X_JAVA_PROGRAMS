package May.Exercise_21_05_2024_Abstraction.Abstract_keyword.CarEx;

public class Car extends Engine {

    @Override
    void start() {

        System.out.println("Starting the car");

    }

    @Override
    void stop() {
        System.out.println("Stopping the car");

    }

    @Override
    void partsGearBox() {
        System.out.println("Assemble the Gearbox");

    }

    @Override
    void openCar() {

    }
}
