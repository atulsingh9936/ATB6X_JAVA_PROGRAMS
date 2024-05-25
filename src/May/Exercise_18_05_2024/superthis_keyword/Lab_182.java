package May.Exercise_18_05_2024.superthis_keyword;

public class Lab_182 {
    public static void main(String[] args) {

        student s = new student();
        s.display();
    }



}

class student extends person{
    // is a relationship(inheritance)

    void message (){
        System.out.println(" I am a student message");


    }
    void display(){
        this.message();
        super.message();
    }


}

class person{
    void message(){
        System.out.println("I am person  message");
    }
}
