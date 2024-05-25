package May.Exercise_18_05_2024.Encapsulation;

public class Lab_193 {
    public static void main(String[] args) {
        Icici_bank_account i = new Icici_bank_account("pramod",100);
        System.out.println(i.getBalance());
        i.setBalance(-100);
        //i.name - "admin"
      //  i.setName("admin");
        System.out.println(i.getBalance());
    }
}
