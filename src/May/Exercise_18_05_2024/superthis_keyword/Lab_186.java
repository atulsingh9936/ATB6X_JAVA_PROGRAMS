package May.Exercise_18_05_2024.superthis_keyword;

public class Lab_186 {
    public static void main(String[] args) {



    }
}

class p{
    void m1(){
        System.out.println("M1");
    }

    void m2(){
        m1();
        System.out.println("M2");
    }
}
