package May.Exercise_21_05_2024_Abstraction.Abstract_keyword.Real_EX;

public class TC2_FIREFOX extends Base_class {

    @Override
    String openBrowser() {
        System.out.println("Staring firefox....");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing browser");
        return "";
    }
}
