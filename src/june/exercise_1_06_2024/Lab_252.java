package june.exercise_1_06_2024;
import java.util.HashMap;
import  java.util.Map;

public class Lab_252 {
    public static void main(String[] args) {

        // Map - key value pair
        // api testing- JSON - javascript object notation- Map
        // JSON - key value pair
        // Hashset  and HashMap
        // LinkedHashset and LinkedHashmap
        // name = pramod, age= 65, course = atb

//        Map<String,String> studentMap = new HashMap<>();
//        studentMap.put("Firstname","pramod");
//        studentMap.put("age","65");
//        studentMap.put("roll","1");
//        studentMap.put("course","Atb");
//        studentMap.put("Lastname","Dutta");
//        System.out.println(studentMap);



        Map<String,Object> studentMap = new HashMap<>();
        studentMap.put("Firstname","pramod");
        studentMap.put("age",65);
        studentMap.put("roll",1);
        studentMap.put("course","Atb");
        studentMap.put("Lastname","Dutta");
        studentMap.put("isMale",true);
        System.out.println(studentMap);
        System.out.println(studentMap.get("Firstname"));
        System.out.println(studentMap.get("age"));
        System.out.println(studentMap.isEmpty());
        System.out.println(studentMap.containsKey("age"));
        System.out.println(studentMap.containsValue(65));
        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());

        for(Map.Entry<String,Object> item : studentMap.entrySet()){

        }
    }
}
