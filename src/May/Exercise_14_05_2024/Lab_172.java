package May.Exercise_14_05_2024;

public class Lab_172 {
    public static void main(String[] args) {
     BankAccount sbiref1 = new BankAccount();
     sbiref1.print_Details();

     BankAccount hdfcref1 = new BankAccount("HDFC",10,"HDFC001");
     hdfcref1.print_Details();
        BankAccount iciciref1 = new BankAccount("ICICI",10,"ICIC001");
        iciciref1.print_Details();

        BankAccount yesbankref1 = new BankAccount("yesbank","yesbank001");
        yesbankref1.print_Details();



    }
}
