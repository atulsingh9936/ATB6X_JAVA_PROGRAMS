package May.Exercise_18_05_2024.Access_modifier.criminal;

import May.Exercise_18_05_2024.Access_modifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
     Cop cop = new Cop(10);
        System.out.println(cop.gun);
       // cop.canIshoot();
    }
}
