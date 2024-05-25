package May.Exercise_18_05_2024.Encapsulation;

public class Lab_192 {

    public static void main(String[] args) {
        vwoLogin1 v1 = new vwoLogin1("admin","admin123");

       // v1.username = "admin";
        String username = v1.getUsername();
        // code to auth is auth = true
     //   String Password = v1.getPassword(true);
        v1.setPassword("pramod", true);

    }

}


class vwoLogin1{

    private String Username;
    private String Password;


    public vwoLogin1(String username, String password) {
      this.Username = username;
        this.Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword(boolean isAuth) {

        if(isAuth){
            return Password;
        }
        else{
           return "Not allowed";

        }
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth){
       this.Password = password;
    }else{

            System.out.println("not allowed");
        }
    }
}