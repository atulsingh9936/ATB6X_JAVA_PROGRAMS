package May.Exercise_21_05_2024_Abstraction;



public class Lab_200 {




}

class pramod extends b1{
    @Override
    void mtb() {
    }

    @Override
    public void atb() {
        System.out.println("Atb completed");

    }
}

 abstract class b1 implements course {

 abstract   void mtb();


 }
    interface course {
        void atb();
    }
