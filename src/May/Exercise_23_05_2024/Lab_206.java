package May.Exercise_23_05_2024;

public class Lab_206 {
    public static void main(String[] args) {
        car c = new car("lambo");
        c.drive();
        car.engine engine = c.new engine("500CC");
        engine.start();
        c.drive();


        //Nested class ->  to shield the inner class
    }



}
class car{
    String make;

    public car(String make) {
        this.make = make;
    }


    // method
    void drive(){
        System.out.println("You can drive a car ");
    }

    class engine{

        // instance variables
        String Horsepower;

        public engine(String horsepower) {
            Horsepower = horsepower;
        }

        // method
        void start(){
            System.out.println("Engine is started  ->  "+make);
        }

        class gearbox{
            void m2(){
                System.out.println("m2");
            }

            class pp{
                class oo{

                }
            }

        }
    }
}
