package april.Exercise_25_04_2024;

public class Lab_0087 {
    public static void main(String[] args) {
        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

        char ch = 'a';
        switch (ch) {
            case 'a', 'e', 'i', 'u', 'o' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
            // ->
                    }
    }
}
