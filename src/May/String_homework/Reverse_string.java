package May.String_homework;

public class Reverse_string {
    public static void main(String[] args) {

        String name = "Hello world";
        int length = name.length();
        System.out.println(length);

        char ch;
        String reverse ="";
        for (int i= (name.length()-1); i>=0; i--) {

        ch = name.charAt(i);

        reverse = reverse+ch;

        }
        System.out.println(reverse);

    }

}