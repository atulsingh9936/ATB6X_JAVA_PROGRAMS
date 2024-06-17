package May.Exercise_25_05_2024.Exceptions;

public class Lab_221_1 {
    public static void main(String[] args) {
        try {
            String sh = args[0]; // 5
            int x = Integer.parseInt(sh); // (String)5-> (int)5// int x =5
            int a = 10 / x; // 10/5 ->2
            System.out.println(x);
            System.out.println(a);
//       }catch (Exception e){
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem with the code");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
