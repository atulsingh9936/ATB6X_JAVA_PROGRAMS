package May.Exercise_21_05_2024_Abstraction.Interface_Keyword;

public class Car implements Brake,Engine {

    @Override
    public void ApplyBreak() {
        System.out.println("Applying brake");

    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine");

    }
}
