package Exercise_25_04_2024;

public class Lab_0089 {
    public static void main(String[] args) {

        char code ='B';
        int val = switch (code) {
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                System.out.println("Not able to find");
                throw  new IllegalStateException("Error");
        };
    }
}
