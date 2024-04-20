package Exercise_20_04_2024;

public class Lab_0056 {
    public static void main(String[] args) {
        // in the below case only 1 string will be created because only reference is changing value is same
        String name ="TheTestingAcademy";
        String name1 ="TheTestingAcademy";

        // IN THE CASE two string will be created as value of both are different

//        String name2 ="TheTestingAcademy";
//        String name3 ="TheTestingAcademY";


        String name3 = new String("TheTestingAcademy");  // Heap area(Object area)


    }
}
