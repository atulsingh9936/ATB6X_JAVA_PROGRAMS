package May.Exercise_16_05_2024.Single_inheritance;

public class Programming {
    int version;
    String author;
    Programming() {

        System.out.println("Default constructor");
    }

    public Programming(int version, String author) {
        this.version = version;
        this.author = author;
    }


    void printinfo(){

        System.out.println("Program info -> Version is " + this.version +" "+ "Author is "  +  this.author);
    }

    void bhk3(){
        System.out.println("3bhk");
    }
}
