package May.Exercise_25_05_2024.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_226 {
    public static void main(String[] args) {

        int a =10/0;  // unchecked - JVM doesn't no

        try {
            FileReader f = new FileReader(new File("C://a/txt"));  // checked exception
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
