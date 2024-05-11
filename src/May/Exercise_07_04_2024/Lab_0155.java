package May.Exercise_07_04_2024;

public class Lab_0155 {
    public static void main(String[] args) {
        // 1 friend  - money
        // 1beggar - money
        main(10);
        main("atul");


    }

    static void main(int a){
        System.out.println(a);
    }
    static void main(String a){
        System.out.println(a);
    }
    static String main(String [] a, String b){
        System.out.println(a);
        return "hello";
    }


      static void god(){
        main(new String[]{"12"});
      }

    static void givemoneytobeggar() {
        System.out.println("Blessing");
    }

    static int giveMoneytofriend( int i) {
        i=i+8;

        // after 6 month he will return the money
        return i;
    }

}
