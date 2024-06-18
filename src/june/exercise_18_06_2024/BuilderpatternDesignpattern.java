package june.exercise_18_06_2024;

public class BuilderpatternDesignpattern {

    public BuilderpatternDesignpattern groundfloor(){
        System.out.println("so some task of ground floor ");
        return this;
    }


    public BuilderpatternDesignpattern firstfloor(String name){
        System.out.println("so some task of first floor "+name );
        return this;
    }
    public BuilderpatternDesignpattern secondfloor(String name, String color){
        System.out.println("so some task of second floor "+name+ color);
        return this;


    }

    public static void main(String[] args) {
        BuilderpatternDesignpattern bp  = new BuilderpatternDesignpattern();
        bp.groundfloor().firstfloor("FF").secondfloor("SF","black");

        // Rest assured

        // get().header().auth().make().response().verify()
    }
}
