package May.String_homework;

import java.util.Arrays;

public class Anagram_string {

    public static boolean  is_Anagram(String s1,String s2){
        String str1 = s1.replace("\\s","");
        String str2 = s2.replace("\\s","");

        if(str1.length()!= str2.length()){
            return false;
        }else{
           char c1[] =str1.toLowerCase().toCharArray();
          char c2[]=  str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);

        }

    }






    public static void main(String[] args) {

        System.out.println(  is_Anagram("Listen","silent"));
        System.out.println(  is_Anagram("Listen","silent"));

    }
}
