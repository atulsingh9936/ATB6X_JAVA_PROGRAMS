package june.exercise_18_06_2024;

public class BP {

    String name;
    String name2;
    BP step1(String name){
        System.out.println("1");
        this.name =name;
        return this;
    }
    BP step2(String name2){
        System.out.println("2");
        return this;
    }
    BP step3(){
        System.out.println("completed");
        return this;
    }

    public static void main(String[] args) {
        BP bp = new BP();
        bp.step1("ashok").step2("rajesh").step3();
    }
}
