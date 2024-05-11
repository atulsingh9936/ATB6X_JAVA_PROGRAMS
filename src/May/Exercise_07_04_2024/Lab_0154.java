package May.Exercise_07_04_2024;

public class Lab_0154 {

    static void givemoneytobeggar() {
        System.out.println("Blessing");
    }

    static int giveMoneytofriend( int i) {
        i=i+8;

        // after 6 month he will return the money
        return i;
    }

    public static void main(String[] args) {

        // 1 friend  - money
        // 1beggar - money
        System.out.println("start of the program");

     int money =   giveMoneytofriend(100);
        System.out.println(money);

     givemoneytobeggar();
        System.out.println("End of the program");
    }


}
