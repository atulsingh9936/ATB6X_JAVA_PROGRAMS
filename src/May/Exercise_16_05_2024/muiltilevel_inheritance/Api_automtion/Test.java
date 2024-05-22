package May.Exercise_16_05_2024.muiltilevel_inheritance.Api_automtion;

public class Test  extends BaseTest{

    void accessExcelAndSql(){
        openExcelfile();
        openSqlConnection();
        System.out.println( api_version);
        System.out.println(version);
    }
    void openJson(){
        System.out.println("Test");
    }
}

