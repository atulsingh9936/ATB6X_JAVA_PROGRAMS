package May.Exercise_18_05_2024.Encapsulation;

public class Lab_191 {
    public static void main(String[] args) {
        vwoLogin v1 = new vwoLogin("admin","admin123");

        // hidden

      //  System.out.println(v1.password);
        v1.Username ="Pramod";
        System.out.println(v1.Username);




    }

}


class vwoLogin{

    private    String password;
   public String Username;

    public vwoLogin( String username,String password ) {
        this.password = password;
       this. Username = username;
    }
}

