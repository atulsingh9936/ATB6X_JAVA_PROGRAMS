package May.Exercise_21_05_2024_Abstraction.Interface_Keyword;

public interface Engine {

    void startEngine();
    void stopEngine();

    default void haltingEngineJustStart(){
        System.out.println("Halting the engine");
    }

    default void haltingEngineJustStop(){
        System.out.println("Halting the engine");
    }

    static void m1(){
        System.out.println("m1");
    }
//     void m2(){
//        System.out.println("m2");
//    }


}
