package May.Exercise_21_05_2024_Abstraction.Abstract_keyword.Real_EX;

public class TC1_CHROME  extends Base_class{

    @Override
    String openBrowser()
    {
        System.out.println("Starting chrome.....");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("closing chrome");
        return "";
    }
}
