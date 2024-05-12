package Practice;

public class Practice_set_chapter_2 {
    public static void main(String[] args) {

//        // problem 1
//        String name = "Jack parker";
//      name =   name.toLowerCase();
//        System.out.println(name);
//
//        // problem 2
//        String text ="To Lower case";
//        text = text.replace(" ", "_");
//        System.out.println(text);

        // problem3

        String letter = " Dear  <|name>| thanks a lot";
       letter = letter.replace("<|name>|","atul");
        System.out.println(letter);

        // problem 4

        String mystring = " This string contains  double and triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        // problem 5
        String myletter= "Deary harry \n\tThis java course is nice\n\tThanks";
        System.out.println(myletter);

    }
}
