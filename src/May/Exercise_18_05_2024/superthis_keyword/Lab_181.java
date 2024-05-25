package May.Exercise_18_05_2024.superthis_keyword;

public class Lab_181 {
    public static void main(String[] args) {
        // super keyword in java
        // parent -child

        // super keyword is reference to parent class
        // variable of parent
        // method of parent
        // constructor of the parent
        car c = new car();

        int speed = c.maxSpeed;
        System.out.println(speed);
        c.display();

        vehicle v = new vehicle();
        v.message();
        int speed1 = v.maxSpeed;
        System.out.println(speed1);
    }
}


class car extends vehicle{
  int maxSpeed =150;
    void display(){
        System.out.println("max speed of car can be  ->" + super.maxSpeed );
        System.out.println("max speed of car can be  ->" + this.maxSpeed );
    }
}

  class vehicle {

    int maxSpeed =10; // instance variable

      void message(){
          System.out.println("This is vehicle class");
      }

  }


