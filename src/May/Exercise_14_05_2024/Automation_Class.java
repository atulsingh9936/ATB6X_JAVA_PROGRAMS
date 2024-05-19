package May.Exercise_14_05_2024;

public class Automation_Class {

    String name;

    public Automation_Class(String name) {
        this.name = name;
    }

    Automation_Class(){
        dataBaseConnection();
        excelopen();

    }

    void dataBaseConnection(){
        System.out.println("Mysql connection is created");
    }
    void excelopen(){
        System.out.println("Excel opened");
    }

    void testcase1(){
        System.out.println("Test case1"+ this.name);
    }
    void testcase2(){
        System.out.println("Test case2"+ this.name);
    }

    public static void main(String[] args) {
        Automation_Class tc1 = new Automation_Class("tc1");
        Automation_Class tc2 = new Automation_Class("tc2");
        System.out.println(tc1.name);
        tc1.testcase1();
        tc1.testcase2();
        System.out.println(tc2.name);
        tc2.testcase1();
        tc2.testcase2();
    }




}
