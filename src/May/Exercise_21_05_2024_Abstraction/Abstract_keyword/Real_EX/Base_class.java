package May.Exercise_21_05_2024_Abstraction.Abstract_keyword.Real_EX;

abstract class Base_class {

    // web automation
    // Hierarchical  inheritance -baseclass -> child 1, child2
    // BaseClass -> child 2

    abstract String openBrowser();
    abstract String closeBrowser();

    void print_logs(){
        System.out.println("Logs");

    }

}
