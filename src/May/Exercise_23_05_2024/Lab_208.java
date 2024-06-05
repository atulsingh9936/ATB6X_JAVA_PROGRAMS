package May.Exercise_23_05_2024;

public class Lab_208 {
    public static void main(String[] args) {
        demo de = new demo() {
            @Override
            void m1() {
                System.out.println("m1");

            }
        };

        de.m1();
    }

}


//class anoy extends demo{
//    @Override
//    void m1() {
//
//    }
//}

abstract class demo{
    abstract  void m1();
}
