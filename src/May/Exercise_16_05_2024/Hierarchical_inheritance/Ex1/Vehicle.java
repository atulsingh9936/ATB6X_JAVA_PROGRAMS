package May.Exercise_16_05_2024.Hierarchical_inheritance.Ex1;

public class Vehicle {

    Vehicle(){
        System.out.println("DC vehicle");
    }

    void VehicleHasTopSpeed(){
        System.out.println("Yeah from "+ getClass().getSimpleName());
    }


}
