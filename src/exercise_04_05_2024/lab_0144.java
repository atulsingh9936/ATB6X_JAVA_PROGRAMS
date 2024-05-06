package exercise_04_05_2024;

public class lab_0144 {
    public static void main(String[] args) {
        String s1 ="pramod";  // SCP
        String s2 = new String ("pramod"); /// OA

        // immutable in nature-> one created cant be changed

        StringBuffer string_buffer = new StringBuffer("pramod");
        string_buffer.append("Dutta");
        string_buffer.reverse();
        System.out.println(string_buffer);

        // Pramod dutta

        StringBuilder stringBuilder = new StringBuilder("Pramod");
        string_buffer.append("Dutta");

        String password = "pass@123";
        password = "123";

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Pramod");
        password2.append(" Dutta");
        System.out.println(password2);
    }
}
