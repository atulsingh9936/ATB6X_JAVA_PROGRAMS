package May.Exercise_25_05_2024.Exceptions;

import java.io.File;
import java.io.FileReader;

public class Lab_224 {
    public static void main(String[] args) {
        try {
            String path = "C://a.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
