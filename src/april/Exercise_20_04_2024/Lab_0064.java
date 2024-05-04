package april.Exercise_20_04_2024;

public class Lab_0064 {
    public static void main(String[] args) {

        String password = "Hacker@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        // pass_u == password?
        // pass_u.equals(password) -> No
        // pass_u.equalsIgnoreCase(password) -> Yes
        System.out.println(pass_u== password);
        System.out.println(pass_u.equals( password));
        System.out.println(pass_u.equalsIgnoreCase(password));

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf("H"));
    }
}
