package May.Exercise_21_05_2024_Statickeyword;

public class Lab_201 {
    // static
    // Data member
    // function
    // class
    // static loads when class is loaded


    public static void main(String[] args) {
//        ATB  amit = new ATB("90888888888");
//        ATB pramod = new ATB("9995989896");
//        amit.printDetails();
//        pramod.printDetails();
//        System.out.println(ATB.Coursename);

        ATB ashok = new ATB("98577857667");
        ATB ashok2 = new ATB("98577857667");

    }
}

class ATB{



    static {
        System.out.println("SIB: I will be executed when class is loaded only one time ");
    }


    {
        System.out.println("IIB - instance initialization block- Loaded whenever object is created ");
    }



    static String Coursename = "ATB"; // static variable this belongs to class
    String phone ;   //non static   / Instance Variable  -> this variable is not common among all of them

    public ATB(String phone) {
        this.phone = phone;
    }

    public void printDetails(){
        System.out.println("Your details --> "+ this.phone);
    }
}
