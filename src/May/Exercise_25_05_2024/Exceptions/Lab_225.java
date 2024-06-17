package May.Exercise_25_05_2024.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_225 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("c://a.txt");

    }


    static void readFile(String fileName) throws FileNotFoundException {
        int a = 10 / 10;
        int c = 0;
        //int a1 = 10/c;
//        try {
//            FileReader f = new FileReader(new File("C://a/txt"));
//        } catch(Exception e){
//            System.out.println("file not found");
//
//        }
        FileReader f = new FileReader(new File("C://a/txt"));

    }
}