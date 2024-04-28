package Exercise_25_04_2024;

public class Lab_0086 {
    public static void main(String[] args) {


        // jdk>13
        int itemcode = 006;
        switch (itemcode){
            case 001,002,003:
                System.out.println("It is a electronic gadget");
                break;
            case 004,005,006:
                System.out.println("It is a Mechanical gadget");
                break;
            default:
                System.out.println("None");

        }
    }
}
