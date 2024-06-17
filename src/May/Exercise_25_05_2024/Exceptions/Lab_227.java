package May.Exercise_25_05_2024.Exceptions;

public class Lab_227 {
    public static void main(String[] args) throws Exception {

        Bank Sbi = new Bank("inr",100);
        Bank JPmorgan = new Bank("usd",10);
     Integer total =   Sbi.add(JPmorgan);
        System.out.println(total);
    }
}
