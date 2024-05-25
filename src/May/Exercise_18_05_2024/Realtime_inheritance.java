package May.Exercise_18_05_2024;

import May.Exercise_16_05_2024.muiltilevel_inheritance.Api_automtion.Test;

public class Realtime_inheritance {
    public static void main(String[] args) {
        Base_class t1 = new testcase1();
        t1.setBrowser("edge", true);
        t1.openbrowser();
        t1.closebrowser();
    }

}

class testcase1 extends Base_class{
    @Override
    public void setBrowser(String browser, boolean isauth) {
        super.setBrowser(browser, isauth);
    }
}


class Base_class{



    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isauth) {
      if (isauth){
          this.browser = browser;
      } else{
          System.out.println("not allowed");
      }
    }

    void openbrowser(){
       System.out.println("Chrome browser");
   }

   void openbrowser(String browsername){
        System.out.println("open browser ->"+ browsername);
    }

    void closebrowser(){
        System.out.println("close browser");
    }

}
