package May.Exercise_14_05_2024;

public class BankAccount {
    String bankname;
    int balance ;
    String bankCode;


    BankAccount(){
        bankname ="SBI";
        bankCode="SBI001";
        balance=0;


    }

    public BankAccount(String bankname, int balance, String bankCode) {
       this.bankname = bankname;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    public BankAccount(String bankname,  String bankCode) {
        this.bankname = bankname;
        this.bankCode = bankCode;
    }

    void print_Details(){
        System.out.println("Bank name ->"  +  bankname);
        System.out.println("Bank code -> "+ bankCode);
        System.out.println(" balance -> "+ balance);
    }
}
