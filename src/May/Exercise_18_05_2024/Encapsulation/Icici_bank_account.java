package May.Exercise_18_05_2024.Encapsulation;

public class Icici_bank_account {
   // private
    // use setter and getter with condition to secure your data members by methods
    // hide the data members - encapsulate




  private   String name;
  private long balance;

    public Icici_bank_account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if(balance>0) {
            this.balance = balance;
        }else{
            System.out.println("not allowed");
        }
    }
}
