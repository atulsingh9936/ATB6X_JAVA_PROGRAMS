package May.Exercise_18_05_2024.Access_modifier.Police;

public class Cop {

    public int gun;   //  Public access by anyone
    private String idcard; // only available to the cop

     public Cop(int gun){
         this.gun = gun;

     }


     protected void canIshoot(){
         System.out.println("Of course shoot !");
     }


}
