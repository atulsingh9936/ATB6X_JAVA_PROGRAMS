package april.Exercise_20_04_2024;

public class Lab_0059 {
    public static void main(String[] args) {

        String name ="TheTestingAcademy";  // string constant pool
        String name1 ="TheTestingAcademy";  // string constant pool

        String name2 = new String("TheTestingAcademy");  // Heap Area(OA)

        System.out.println(name == name1);  //  check the ref
        System.out.println(name .equals(name1));  // check the value

        System.out.println(name == name2);
        System.out.println(name .equals(name2));
    }
}
