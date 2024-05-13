package May.Exercise_07_05_2024;

public class lab_0158 {
    public static void main(String[] args) {
        // web automation

        openbrowser();
        testloginpage1();
        testloginpage("page2");
        closebrowser();

        openbrowser();
        testloginpage1();
        testloginpage("page3");
        closebrowser();
    }

    static void openbrowser(){
        System.out.println("chrome browser opened");
    }
    static void closebrowser(){
        System.out.println("chrome browser closed");
    }

    static void testloginpage1(){
        System.out.println("Testing page 1 opened");
    }
    static  void testloginpage(String page){
        System.out.println("Testing -> "+ page);

    }
}
